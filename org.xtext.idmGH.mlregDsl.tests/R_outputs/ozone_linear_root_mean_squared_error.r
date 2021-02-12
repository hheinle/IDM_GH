library(e1071)
library(tree)
library(Metrics)
data <- read.csv(file ="datasets/ozone.csv")
dt = sample(dim(data)[1], floor(0.7*nrow(data)[1]))
train=data[dt,]
test=data[-dt,]
fff = as.formula(paste(paste(colnames(train)[1],"~"),paste(colnames(train)[c(2:2)], collapse = "+")))
model <- lm(fff,data = train)
prediction=predict(model, test)
data.frame(test[1], valeurs_pr�dites=unlist(prediction))
actual=as.vector(t(test[1]))
print("RMSE")
error <<- rmse(actual, prediction)
print(error)
line=paste('linear;[2];1;0.0772;root_mean_squared_error',';',sep='')
line=paste(line,error,sep='')
write(line,file="statistics/benchmark_R.csv",append=TRUE)
