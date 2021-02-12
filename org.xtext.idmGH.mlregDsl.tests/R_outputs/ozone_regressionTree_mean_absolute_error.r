library(e1071)
library(tree)
library(Metrics)
data <- read.csv(file ="datasets/ozone.csv")
dt = sample(dim(data)[1], floor(0.7*nrow(data)[1]))
train=data[dt,]
test=data[-dt,]
fff = as.formula(paste(paste(colnames(train)[1],"~"),paste(colnames(train)[c(2:11)], collapse = "+")))
model <- tree(fff, data=train)
prediction=predict(model, test)
data.frame(test[1], valeurs_predites=unlist(prediction))
actual=as.vector(t(test[1]))
print("MAE")
error <<- mae(actual, prediction)
print(error)
line=paste('datasets/ozone.csv;regressionTree;[2, 3, 10, 11];1;0.0706;mean_absolute_error',';',sep='')
line=paste(line,error,sep='')
write(line,file="statistics/benchmark_R.csv",append=TRUE)
