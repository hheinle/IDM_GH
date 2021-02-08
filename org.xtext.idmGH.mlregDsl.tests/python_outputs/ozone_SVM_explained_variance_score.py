import time
start_time = time.time()
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
X = df.iloc[: ,[2,3,4,]]
y = df.iloc[: ,0]
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=0)
mlreg = svm.SVR()
print("Algo : SVM")
mlreg.fit(X_train, y_train)
y_prediction = mlreg.predict(X_test)
df_prediction = pd.DataFrame({'Actual': y_test, 'Predicted': y_prediction})
print("df_prediction : ", df_prediction)
error = explained_variance_score(y_test, y_prediction)
print("explained_variance_score =", error)
end_time = time.time()
import csv
f = open('statistics/benchmark.csv', 'a')
with f: 
	fnames = ['benchmark', 'variant', 'prediction result', 'Error measure', 'Execution time']
	writer = csv.DictWriter(f, fieldnames=fnames)
	writer.writeheader()
	writer.writerow({'benchmark' : "datasets/ozone.csv", 'variant': 'Python scikit-learn', 'prediction result': y_prediction, 'Error measure': error, 'Execution time': (end_time-start_time)})
