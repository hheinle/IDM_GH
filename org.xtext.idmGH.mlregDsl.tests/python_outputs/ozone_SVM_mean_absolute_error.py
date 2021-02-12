import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn import tree
from sklearn.linear_model import LinearRegression
from sklearn import svm
from sklearn.metrics import r2_score
from sklearn.metrics import mean_absolute_error
from sklearn.metrics import mean_squared_error
df = pd.read_csv("datasets/ozone.csv")
X = df.iloc[: ,[1,]]
y = df.iloc[: ,0]
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.30)
mlreg = svm.SVR()
algo = "SVM"
print(algo)
mlreg.fit(X_train, y_train)
y_prediction = mlreg.predict(X_test)
print("Target variable : ", 0)
print("Predictive variable(s) : ", 1,)
error = mean_absolute_error(y_test, y_prediction)
errorName = "mean_absolute_error"
print(errorName)
print(error)
import csv
row = [algo, [1,], 0, 0.1126, errorName, error];
f = open('statistics/benchmark_Pyth.csv', 'a', newline="")
with f: 
	writer = csv.writer(f)
	writer.writerow(row)