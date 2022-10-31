xor = {'x1':[0,0,1,1], 'x2':[0,1,0,1], 'y':[0,1,1,0]}
XOR = pd.DataFrame(xor)
X = XOR.drop('y', axis=1)
y = XOR.y

ip = Input(shape=(2,))
n = Dense(2, activation='selu')(ip)
n = Dense(1, activation='linear')(n)
model = Model(inputs=ip, outputs=n)

weights = model.get_weights()
xavier_w12 = np.random.randn(2, 2) / np.sqrt(2)
xavier_w21 = np.random.randn(2, 1) / np.sqrt(2)
xavier_weights = weights
xavier_weights[0] = xavier_w12
xavier_weights[2] = xavier_w21
model.set_weights(xavier_weights)


model.compile(loss='mse', optimizer='rmsprop')
model.fit(X, y, epochs=1400, verbose=0)
model.predict(X)