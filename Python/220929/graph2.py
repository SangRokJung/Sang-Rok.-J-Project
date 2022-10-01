fig = plt.figure(figsize=(15,5))

ax1 = fig.add_subplot(1,2,1)
ax2 = fig.add_subplot(1,2,2)

sns.stripplot(x=titanic["class"], y=titanic.age, data=titanic, ax=ax1)
sns.swarmplot(x=titanic["class"], y=titanic.age, data=titanic, ax=ax2)

ax1.set_title('stripplot')
ax2.set_title('swarmplot')