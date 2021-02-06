import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn import tree
from sklearn.linear_model import LinearRegression
from sklearn import svm
from sklearn.metrics import r2_score
from sklearn.metrics import explained_variance_score
from sklearn.metrics import mean_squared_error
df = pd.read_csv("datasets/ozone.csv")
X = df.iloc[: ,[1,]]
y = df.iloc[: ,0]
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=0)
mlreg = LinearRegression()
print("Algo : Linear")
mlreg.fit(X_train, y_train)
y_prediction = mlreg.predict(X_test)
df_prediction = pd.DataFrame({'Actual': y_test, 'Predicted': y_prediction})
print("df_prediction : ", df_prediction)
error = mean_squared_error(y_test, y_prediction)
print("mean_squared_error = ", error)
import csv
stats = ["datasets/ozone.csv", 'Pythonscikit-learn', y_prediction, 'time', error]
f = open('statistics/benchmark.csv', 'w')
with f: 
	fnames = ['benchmark', 'variant', 'prediction result', 'Error measure', 'Time']
	writer = csv.DictWriter(f, fieldnames=fnames)
	writer.writeheader()
	writer.writerow({'benchmark' : "datasets/ozone.csv", 'variant': 'Python scikit-learn', 'prediction result': y_prediction, 'Error measure': error, 'Time': 'dfjlskjdf'})
