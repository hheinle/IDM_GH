package org.xtext.idmGH.mlregDsl.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.eclipse.emf.common.util.EList;
import org.xtext.idmGH.mlregDsl.mLReg.ColVar;
import org.xtext.idmGH.mlregDsl.mLReg.MlRegression;
import org.xtext.idmGH.mlregDsl.mLReg.Model;
import com.google.common.io.Files;

public class PythonCompiler {

	private Model model;

	PythonCompiler(Model model) {
		this.model = model;
	}

	public void compileAndRun() throws IOException {

		MlRegression mlRegression = this.model.getMlRegression();
		String csvFile = mlRegression.getCsvFile().getCsvFile();
		int testSize = mlRegression.getTestSize().getTestSize();
		EList<ColVar> colVars = mlRegression.getPredictiveVars().getPredictiveVar();
		String colVarsString = "";
		for (ColVar colvar : colVars) {
			colVarsString += colvar.getIdCol();
			colVarsString += ",";
		}
		colVarsString.replaceAll(",$", "");
		int targetVar = mlRegression.getTargetVar().getTargetVar().getIdCol();
		String algo = mlRegression.getAlgorithm().getAlgoName().getName();
		String errorMeasure = mlRegression.getErrorMeasure().getErrorMeasure().getName();

		String pythonCode = "import pandas as pd\n" + "import matplotlib.pyplot as plt\n"
				+ "from sklearn.model_selection import train_test_split\n" + "from sklearn import tree\n"
				+ "from sklearn.linear_model import LinearRegression\n" + "from sklearn import svm\n"
				+ "from sklearn.metrics import r2_score\n" + "from sklearn.metrics import explained_variance_score\n"
				+ "from sklearn.metrics import mean_squared_error\n" + "df = pd.read_csv(\"" + csvFile + "\")\n";
		
		// Spliting dataset between features (X) and label (y)
		pythonCode += "X = df.iloc[: ,[" + colVarsString + "]]\n";
		pythonCode += "y = df.iloc[: ," + targetVar + "]\n";

		// Spliting into LearningSet and TestSet
		pythonCode += "X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0." + testSize
				+ ", random_state=0)\n";

		// Set algorithm to use
		if (algo.equalsIgnoreCase("linear")) {
			pythonCode += "mlreg = LinearRegression()\n";
			pythonCode += "print(\"Algo : Linear\")\n";
		} else if (algo.equalsIgnoreCase("svm")) {
			pythonCode += "mlreg = svm.SVR()\n";
			pythonCode += "print(\"Algo : SVM\")\n";
		} else if (algo.equalsIgnoreCase("regressiontree")) {
			pythonCode += "mlreg = tree.DecisionTreeRegressor()\n";
			pythonCode += "print(\"Algo : Regression Tree\")\n";
		}

		// Use the algorithm to create a model with the training set
		pythonCode += "mlreg.fit(X_train, y_train)\n";

		// Prediction
		pythonCode += "y_prediction = mlreg.predict(X_test)\n";
		pythonCode += "df_prediction = pd.DataFrame({'Actual': y_test, 'Predicted': y_prediction})\n";
		pythonCode += "print(\"df_prediction : \", df_prediction)\n";

		// Compute and display the error
		// Set error measure to use
		if (errorMeasure.equalsIgnoreCase("mean_squared_error")) {
			pythonCode += "error = mean_squared_error(y_test, y_prediction)\n";
			pythonCode += "print(\"mean_squared_error = \", error)\n";
		} else if (errorMeasure.equalsIgnoreCase("explained_variance_score")) {
			pythonCode += "error = explained_variance_score(y_test, y_prediction)\n";
			pythonCode += "print(\"explained_variance_score =\", error)\n";
		} else if (errorMeasure.equalsIgnoreCase("r2_score")) {
			pythonCode += "error = r2_score(y_test, y_prediction)\n";
			pythonCode += "print(\"r2_score =\", error)\n";
		}

		// serialize code into Python filename

		csvFile = csvFile.substring(csvFile.lastIndexOf("/")).replace("/", "");
		String PYTHON_OUTPUT = "python_outputs/" + csvFile.replaceAll(".csv", "") + "_" + algo + "_" + errorMeasure + ".py";
		Files.write(pythonCode.getBytes(), new File(PYTHON_OUTPUT));
		Process p = Runtime.getRuntime().exec("python " + PYTHON_OUTPUT);
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
		BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
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
