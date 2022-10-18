logistic_regression = LogisticRegression()
knn = KNeighborsClassifier(n_neighbors=8)
voting_model = VotingClassifier(estimators=[ (‘LogisticRegression’, logistic_regression),
                                            (‘KNN’, knn) ], voting=‘soft’)
4:52
classifiers = [logistic_regression, knn]
for classifier in classifiers:
    classifier.fit(X_train, y_train)
    pred = classifier.predict(X_test)
    class_name = classifier.__class__.__name__
    print(‘{0} 정확도: {1:.4f}‘.format(class_name, accuracy_score(y_test, pred)))
voting_model.fit(X_train, y_train)
pred = voting_model.predict(X_test)
print(‘보팅 분류기의 정확도: {0: .4f}’.format(accuracy_score(y_test, pred)))

#!/usr/bin/env python
# coding: utf-8
​
# In[ ]:
​
​
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.preprocessing import LabelEncoder
from sklearn.model_selection import train_test_split, GridSearchCV
from sklearn.tree import DecisionTreeRegressor
from sklearn.metrics import mean_squared_error
from sklearn.tree import plot_tree
import warnings
warnings.filterwarnings('ignore')
​
df = sns.load_dataset('titanic')
df1 = df.copy()
df1.drop(['class', 'embark_town', 'alive'], axis=1, inplace=True)
df1.deck = df1.deck.astype('O')
df1.deck.fillna('N', inplace=True)
df1.embarked.fillna('S', inplace=True)
df1.age.fillna(df1.age.median(), inplace=True)
​
​
# In[ ]:
​
​
le_columns = df1.columns[(df1.dtypes=='O')|(df1.dtypes=='category')|(df1.dtypes=='bool')]
​
​
# In[ ]:
​
​
for i in le_columns:
    globals()[f'df1_{i}_encoder'] = LabelEncoder()
    globals()[f'df1_{i}_encoder'].fit(df1[i])
    df1[i] = globals()[f'df1_{i}_encoder'].transform(df1[i])
​
​
# In[19]:
​
​
X = df1.drop('fare', axis=1)
y = df1.fare
​
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2)
​
​
# In[ ]:
​
​
dtreg = DecisionTreeRegressor(max_depth=3) # "mse", "friedman_mse", "mae"
dtreg.fit(X_train, y_train)
​
​
# In[20]:
​
​
fig = plt.figure(figsize=(15,8))
ax1 = fig.add_subplot(111)
​
plot_tree(dtreg, feature_names=X_train.columns, fontsize=10, ax=ax1)
ax1.set_title('DecisionTreeRegressor with Default parameters')
plt.show()
​
​
# In[21]:
​
​
fare_pred = dtreg.predict(X_test)
mean_squared_error(y_test, fare_pred)
​
​
# ## Trade-off
​
# In[18]:
​
​
import seaborn as sns
import numpy as np
from sklearn.tree import DecisionTreeClassifier
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
import warnings
get_ipython().run_line_magic('matplotlib', 'inline')
warnings.filterwarnings('ignore')
​
# feature importance 추출
print("Feature importanes:\n{0}".format(np.round(dtreg.feature_importances_, 3)))
​
# feature별 importance 매핑
f_i1 = {}
f_i2 = {}
​
for name, value in zip(X_train.columns, dtreg.feature_importances_):
    print('{0} : {1:.3f}'.format(name, value))
    f_i1[name] = value
​
result1 = sorted(f_i1.items(), key=lambda x:x[1], reverse=True)
​
for i, j in result1:
    f_i2[i] = j
    
# feature importance를 column 별로 시각화하기
sns.barplot(x=list(f_i2.values()), y=list(f_i2.keys()))
plt.show()
​
​
# In[35]:
​
​
params = {'max_depth':range(2, 10),
         'ccp_alpha':[i*0.01 for i in range(0, 100)]}
gs_dtreg = GridSearchCV(dtreg, param_grid=params, scoring='neg_mean_squared_error', n_jobs=2, cv=5)
​
​
# In[36]:
​
​
gs_dtreg.fit(X, y)
​
​
# In[41]:
​
​
print(gs_dtreg.best_params_)
print(gs_dtreg.best_estimator_)
print(gs_dtreg.best_score_)
​
​
# In[43]:
​
​
mean_squared_error(y_test, gs_dtreg.best_estimator_.predict(X_test))
​
​
# In[ ]:
​