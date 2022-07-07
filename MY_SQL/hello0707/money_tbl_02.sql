
CREATE TABLE member_tbl_02
(   custno      NUMBER(6)       NOT NULL PRIMARY KEY    --회원번호
    custname    VARCHAR2(20)                            --회원성명
    phone       VARCHAR2(13)                            --회원전화
    adress      VARCHAR2(60)                            --주소
    joindate    DATE                                    --가입일자  
    grade       CHAR(1)                                 --고객등급
    city        CHAR(2)                                 --거주도시
)

INSERT INTO member_tbl_02 VALUES (100001, '이승기', '010-1111-2222', '서울 동대문구 휘경1동', 2015-12-02, 'A', '01')
INSERT INTO member_tbl_02 VALUES (100002, '이축복', '010-1111-3333', '서울 동대문구 휘경2동', 2015-12-06, 'B', '01')
INSERT INTO member_tbl_02 VALUES (100003, '장믿음', '010-1111-4444', '울릉군 울릉읍 독도1리', 2015-10-01, 'B', '30')
INSERT INTO member_tbl_03 VALUES (100004, '최사랑', '010-1111-5555', '울릉군 울릉읍 독도2리', 2015-11-13, 'A', '30')
INSERT INTO member_tbl_02 VALUES (100005, '진평화', '010-1111-6666', '제주도 제주시 외나무골', 2015-12-25, 'B', '60')
INSERT INTO member_tbl_02 VALUES (100006, '차공단', '010-1111-7777', '제주도 제주시 감나무골', 2015-12-11, 'C', '60')

