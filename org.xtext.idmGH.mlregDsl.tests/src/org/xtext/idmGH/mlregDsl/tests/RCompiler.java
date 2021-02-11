package org.xtext.idmGH.mlregDsl.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.xtext.idmGH.mlregDsl.mLReg.ColVar;
import org.xtext.idmGH.mlregDsl.mLReg.CsvFile;
import org.xtext.idmGH.mlregDsl.mLReg.MlRegression;
import org.xtext.idmGH.mlregDsl.mLReg.Model;

import com.google.common.io.Files;

public class RCompiler {
	
	private Model _model;

	RCompiler(Model model) {	
		_model = model;	
	}
	
	public void compileAndRun() throws IOException {
		long startTime = System.nanoTime();
		MlRegression mlReg = _model.getMlRegression();
		String fileName = mlReg.getCsvFile().getCsvFile();
		System.out.println(fileName);
		int testSize = mlReg.getTestSize().getTestSize();
		double trainSize = (100 - testSize)/(double)100;
		EList<ColVar> predictiveVars = mlReg.getPredictiveVars().getPredictiveVar();
		ArrayList<Integer> listPredictiveVars = new ArrayList<Integer>();
		for(ColVar col: predictiveVars) {
			int colId = col.getIdCol();
			listPredictiveVars.add(colId);
		}
		int targetVar = mlReg.getTargetVar().getTargetVar().getIdCol();
		String algorithm = mlReg.getAlgorithm().getAlgoName().getName();
		String errorType = mlReg.getErrorMeasure().getErrorMeasure().getName();
		String targetVarR = Integer.toString(targetVar);
		String rCode = "library(e1071)\n";
		rCode += "library(tree)\n";
		rCode += "library(Metrics)\n";
		rCode += "data <- read.csv(file =\"" + fileName + "\")\n";
		rCode += "dt = sample(dim(data)[1], floor("+trainSize+"*nrow(data)[1]))\n";
		//rCode += "dt = sort(sample(nrow(data), nrow(data)*"+ trainSize +"))\n";
		rCode += "train=data[dt,]\n";
		rCode += "test=data[-dt,]\n";

		if(algorithm.equalsIgnoreCase("Linear")) {
			rCode += "fff = as.formula(paste(paste(colnames(train)["+targetVarR+"],\"~\"),paste(colnames(train)[c("+listPredictiveVars.get(0)+":"+listPredictiveVars.get(listPredictiveVars.size()-1)+")], collapse = \"+\")))\n";
			rCode += "model <- lm(";
			rCode += "fff";
			rCode += ",data = train";
			rCode += ")\n";
		}
		else if(algorithm.equalsIgnoreCase("SVM")) {
			rCode += "fff = as.formula(paste(paste(colnames(train)["+targetVarR+"],\"~\"),paste(colnames(train)[c("+listPredictiveVars.get(0)+":"+listPredictiveVars.get(listPredictiveVars.size()-1)+")], collapse = \"+\")))\n";
			rCode += "model <- svm(";
			rCode += "fff";
			rCode += ",data = train)\n";
		}
		else if(algorithm.equalsIgnoreCase("RegressionTree")) {
			rCode += "fff = as.formula(paste(paste(colnames(train)["+targetVarR+"],\"~\"),paste(colnames(train)[c("+listPredictiveVars.get(0)+":"+listPredictiveVars.get(listPredictiveVars.size()-1)+")], collapse = \"+\")))\n";
			rCode += "model <- tree(";
			rCode += "fff";
			rCode += ", data=train";
			rCode += ")\n";
		}
		rCode += "prediction=predict(model, test)\n";
		rCode += "data.frame(test[1], valeurs_prédites=unlist(prediction))\n";
		rCode += "actual=as.vector(t(test[1]))\n";

		if(errorType.equalsIgnoreCase("root_mean_squared_error")) {
			rCode += "print(\"RMSE\")\n";
			rCode += "error <<- rmse(actual, prediction)\n";
			rCode += "print(error)\n";
		}
		else if(errorType.equalsIgnoreCase("mean_absolute_error")) {
			rCode += "print(\"MAE\")\n";
			rCode += "error <<- mae(actual, prediction)\n";
			rCode += "print(error)\n";
		}
		else if(errorType.equalsIgnoreCase("r2_score")) {
			rCode += "print(\"R2\")\n";
			rCode += "error <<- (var(actual)-var(actual-prediction))/var(actual)\n";
			rCode += "print(error)\n";
		}
		long endTime = System.nanoTime();
		double durationMs = (endTime - startTime) / (double) 1000000;
		
		rCode += "line=paste('"+ algorithm +";"+listPredictiveVars.toString()+";"+targetVar+";"+durationMs+";"+errorType+"',';',sep=\'\')\n";
		rCode += "line=paste(line,error,sep=\'\')\n";
		rCode += "write(line,file=\"statistics/benchmark_R.csv\",append=TRUE)\n";

		
        String R_OUTPUT = "R_outputs/foo1.r";
        
        Files.write(rCode.getBytes(), new File(R_OUTPUT));

        // execute the generated Python code
        // roughly: exec "r -f foo.r"
        Process p = Runtime.getRuntime().exec("Rscript " + R_OUTPUT);

        // output
        BufferedReader stdInput = new BufferedReader(new 
             InputStreamReader(p.getInputStream()));

        // error
        BufferedReader stdError = new BufferedReader(new 
             InputStreamReader(p.getErrorStream()));

        String o;
        while ((o = stdInput.readLine()) != null) {
            System.out.println(o);
        }

        String err; 
        while ((err = stdError.readLine()) != null) {
            System.out.println(err);
        }

	}

}
