import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.preprocessing import LabelEncoder
import warnings
warnings.filterwarnings(‘ignore’)
df = sns.load_dataset(‘titanic’)
df.drop([‘class’, ‘alive’, ‘embark_town’, ‘who’, ‘adult_male’, ‘alone’], axis=1, inplace=True)
df[‘family’] = df.sibsp + df.parch
df.drop([‘sibsp’, ‘parch’], axis=1, inplace=True)
df1 = df.copy()
df1.embarked.fillna(‘S’, inplace=True)
m1_med = df1.loc[(df1.sex == ‘male’) & (df1.pclass == 1), ‘age’].median()
m2_med = df1.loc[(df1.sex == ‘male’) & (df1.pclass == 2), ‘age’].median()
m3_med = df1.loc[(df1.sex == ‘male’) & (df1.pclass == 3), ‘age’].median()
f1_med = df1.loc[(df1.sex == ‘female’) & (df1.pclass == 1), ‘age’].median()
f2_med = df1.loc[(df1.sex == ‘female’) & (df1.pclass == 2), ‘age’].median()
f3_med = df1.loc[(df1.sex == ‘female’) & (df1.pclass == 3), ‘age’].median()
df1.loc[(df1.sex == ‘male’)&(df1.pclass == 1), ‘age’].fillna(29, inplace=True)
df1.loc[(df1.sex == ‘male’)  &(df1.pclass == 1)&(df1.age.isna()), ‘age’] = m1_med
df1.loc[(df1.sex == ‘male’)  &(df1.pclass == 2)&(df1.age.isna()), ‘age’] = m2_med
df1.loc[(df1.sex == ‘male’)  &(df1.pclass == 3)&(df1.age.isna()), ‘age’] = m3_med
df1.loc[(df1.sex == ‘female’)&(df1.pclass == 1)&(df1.age.isna()), ‘age’] = f1_med
df1.loc[(df1.sex == ‘female’)&(df1.pclass == 2)&(df1.age.isna()), ‘age’] = f2_med
df1.loc[(df1.sex == ‘female’)&(df1.pclass == 3)&(df1.age.isna()), ‘age’] = f3_med
df1.drop(‘deck’, axis=1, inplace=True)
df1.age_new = 0
# 노인의 생존율 (50세 이상) 유아의 생존율 (10세 미만)
df1.loc[df1.age >= 50, ‘age_new’] = ‘old’
df1.loc[(df1.age < 50) & (df1.age>=10), ‘age_new’] = ‘young’
df1.loc[df1.age < 10, ‘age_new’] = ‘baby’
for i in [‘sex’, ‘embarked’, ‘age_new’]:
    globals()[f’df1_{i}_encoder’] = LabelEncoder()
    globals()[f’df1_{i}_encoder’].fit(df1[i])
    df1[i] = globals()[f’df1_{i}_encoder’].transform(df1[i])
df1_sex_encoder = LabelEncoder()
df1_embarked_encoder = LabelEncoder()
df1_agenew_encoder = LabelEncoder()
df1_sex_encoder.fit(df1[‘sex’])
df1_embarked_encoder.fit(df1[‘embarked’])
df1_agenew_encoder.fit(df1[‘age_new’])
df1[‘sex’] = df1_sex_encoder.transform(df1[‘sex’])
df1[‘embarked’] = df1_embarked_encoder.transform(df1[‘embarked’])
df1[‘age_new’] = df1_agenew_encoder.transform(df1[‘age_new’])
X = df1.drop(‘survived’, axis=1)
y = df1.survived
5:48
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2)
# Tuning Multiple Hyperparameters
# read in hyperopt values
from hyperopt import fmin, hp, tpe, Trials, space_eval, STATUS_OK
# redefine the function usng a wider range of hyperparameters
def objective(search_space):
    model = DecisionTreeClassifier(**search_space)
    model.fit(X_train, y_train)
    y_pred = model.predict(X_test)
    accuracy = accuracy_score(y_test, y_pred)
    return {‘loss’: -accuracy, ‘status’: STATUS_OK}
# new search space
search_space={‘max_depth’:hp.choice(‘max_depth’, range(3, 17)),
              ‘min_samples_split’:hp.uniform(‘min_samples_split’, 0, 1),
              ‘min_samples_leaf’:hp.choice(‘min_samples_leaf’, range(1, 30)),
              ‘criterion’:hp.choice(‘criterion’, [‘gini’,‘entropy’]),
              ‘max_features’:hp.choice(‘max_features’, [None, ‘sqrt’, ‘log2’])}
# set the hyperparam tuning algorithm
algorithm=tpe.suggest
# implement Hyperopt
best_params = fmin(
    fn=objective,
    space=search_space,
    algo=algorithm,
    max_evals=100)
space_eval(search_space, best_params)
5:48
space_eval(search_space, best_params)
5:48
new_dtclf = DecisionTreeClassifier(**space_eval(search_space, best_params))
new_dtclf.fit(X_train, y_train)
5:48
new_dtclf.score(X_test, y_test)