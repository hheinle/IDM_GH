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
X = df.iloc[: ,[1]]
y = df.iloc[: ,0]
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.30)
mlreg = LinearRegression()
algo = "linear"
print(algo)
mlreg.fit(X_train, y_train)
y_prediction = mlreg.predict(X_test)
print("Target variable : ", 0)
print("Predictive variable(s) : ", 1)
df_prediction = pd.DataFrame({'Actual': y_test, 'Predicted': y_prediction})
print("df_prediction : ", df_prediction)
error = r2_score(y_test, y_prediction)
errorName = "r2_score"
print(errorName)
print(error)
import csv
row = ['datasets/ozone.csv', algo, [1], 0, 0.1026, errorName, error];
f = open('statistics/benchmark_Pyth.csv', 'a', newline="")
with f: 
	writer = csv.writer(f)
	writer.writerow(row)