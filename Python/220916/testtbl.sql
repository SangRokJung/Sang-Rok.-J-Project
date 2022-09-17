DROP TABLE buyTBL;
DROP TABLE userTBL;
CREATE TABLE userTBL
(
    userID VARCHAR(3) PRIMARY KEY,
    userName VARCHAR(4) NOT NULL,
    birthYear INT NOT NULL,
    addr VARCHAR(2) NOT NULL,
    tel SMALLINT NULL,
    mobile INT NULL,
    height INT NOT NULL,
    subDate DATE NOT NULL
);
CREATE TABLE buyTBL
(
    no INT PRIMARY KEY,
    userID VARCHAR(3) NOT NULL,
    pName VARCHAR(4) NOT NULL,
    category VARCHAR(2),
    price INT NOT NULL,
    amount INT NOT NULL,
    FOREIGN KEY (userID) REFERENCES userTBL (userID)
);
INSERT INTO userTBL VALUES ('JSR', '정상록', 1998, '서울', 02, 88888888, 180, '2023-09-17');
INSERT INTO buyTBL VALUES(1, 'JSR', '운동화', '신발', 29000, 1);