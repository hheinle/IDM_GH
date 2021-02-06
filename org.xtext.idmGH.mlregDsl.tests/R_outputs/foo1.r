library(e1071)
library(tree)
data <- read.csv(file ="datasets/ozone.csv")
dt = sample(dim(data)[1], floor(0.7*nrow(data)[1]))
train=data[dt,]
test=data[-dt,]
fff = as.formula(paste(paste(colnames(train)[1],"~"),paste(colnames(train)[c(2:2)], collapse = "+")))
model <- tree(fff, data=train)
predict(model, test)
