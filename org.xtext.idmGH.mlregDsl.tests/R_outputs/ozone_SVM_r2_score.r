library(e1071)
library(tree)
library(Metrics)
data <- read.csv(file ="datasets/ozone.csv")
dt = sample(dim(data)[1], floor(0.7*nrow(data)[1]))
train=data[dt,]
test=data[-dt,]
fff = as.formula(paste(paste(colnames(train)[1],"~"),paste(colnames(train)[c(2:11)], collapse = "+")))
model <- svm(fff,data = train)
prediction=predict(model, test)
data.frame(test[1], valeurs_pr�dites=unlist(prediction))
actual=as.vector(t(test[1]))
print("R2")
error <<- (var(actual)-var(actual-prediction))/var(actual)
print(error)
line=paste('SVM;[2, 3, 10, 11];1;0.0598;r2_score',';',sep='')
line=paste(line,error,sep='')
write(line,file="statistics/benchmark_R.csv",append=TRUE)
