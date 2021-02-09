import time
start_time = time.time()
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
X = df.iloc[: ,[1,2,9,10,]]
y = df.iloc[: ,0]
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3)
mlreg = svm.SVR()
print("Algo : SVM")
mlreg.fit(X_train, y_train)
y_prediction = mlreg.predict(X_test)
print("Target variable : ", 0)
print("Predictive variable(s) : ", 1,2,9,10,)
error = r2_score(y_test, y_prediction)
print("r2_score =", error)
end_time = time.time()
import csv
f = open('statistics/benchmark.csv', 'a')
with f: 
	fnames = ['benchmark', 'variant', 'prediction result', 'Error measure', 'Execution time']
	writer = csv.DictWriter(f, fieldnames=fnames)
	writer.writeheader()
	writer.writerow({'benchmark' : "datasets/ozone.csv", 'variant': 'Python scikit-learn', 'prediction result': y_prediction, 'Error measure': error, 'Execution time': (end_time-start_time)})
