df_4 = df_seoul.loc[['충청남도', '경상북도', '강원도', '전라남도']].T
df_4 = df_4.astype(int)
df_4

plt.style.use('seaborn-whitegrid')
fig = plt.figure(figsize=(20, 10))

# 여백설정
plt.subplots_adjust(wspace = 0.5, hspace = 0.5)

ax1 = fig.add_subplot(2, 2, 1)
ax2 = fig.add_subplot(2, 2, 2)
ax3 = fig.add_subplot(2, 2, 3)
ax4 = fig.add_subplot(2, 2, 4)

ax1.plot(df_4["충청남도"], color="HotPink", linewidth=7)
ax2.plot(df_4["경상북도"], color="RebeccaPurple", linewidth=7)
ax3.plot(df_4["강원도"], color="Salmon", linewidth=7)
ax4.plot(df_4["전라남도"], color="DarkGreen", linewidth=7)

ax1.set_title("Seoul to Chungcheongnam-do", fontsize=20)
ax2.set_title("Seoul to Gyeongsangbuk-do", fontsize=20)
ax3.set_title("Seoul to Gangwon-do", fontsize=20)
ax4.set_title("Seoul to Jeollanam-do", fontsize=20)

for i in [ax1, ax2, ax3, ax4] :
    i.set_xticklabels(df_3.index, rotation=75, fontsize=10)
    i.set_xlabel("Year", fontsize=20)
    i.set_ylabel("Movement Value", fontsize=20)
    i.set_ylim(5000, 60000)