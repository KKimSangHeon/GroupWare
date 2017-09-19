conn /as sysdba;

create user sh identified by sh;

grant connect, resource to sh;


DROP TABLE EMPLOYEE;
DROP TABLE TEAM;



/* 사원 */
CREATE TABLE EMPLOYEE (
	EMPLOYEE_NO NVARCHAR2(10) NOT NULL, /* 사번 */
	TEAM_ID NVARCHAR2(10), /* 팀ID */
	EMAIL NVARCHAR2(50), /* 이메일 */
	EMPLOYEE_NAME NVARCHAR2(50), /* 이름 */
	JOIN_DATE DATE, /* 입사일 */
	POSITION NVARCHAR2(50), /* 직급 */
	PASSWORD NVARCHAR2(50), /* 암호 */
	ROLE NVARCHAR2(10),	/* ROLE */
	CONFIRM_CHECK NVARCHAR2(5), /* 인증여부 */
	LAST_LOGIN DATE /* 최근로그인 */
);
DROP TABLE EMPLOYEE;
DROP TABLE TEAM;

/* 사원 */
CREATE TABLE EMPLOYEE (
	EMPLOYEE_NO NVARCHAR2(10) NOT NULL, /* 사번 */
	TEAM_ID NVARCHAR2(10), /* 팀ID */
	EMAIL NVARCHAR2(50), /* 이메일 */
	EMPLOYEE_NAME NVARCHAR2(50), /* 이름 */
	JOIN_DATE DATE, /* 입사일 */
	POSITION_ID NVARCHAR2(50), /* 직급 */
	PASSWORD NVARCHAR2(50), /* 암호 */
	ROLE NVARCHAR2(10),	/* ROLE */
	CONFIRM_CHECK NVARCHAR2(5), /* 인증여부 */
	LAST_LOGIN DATE /* 최근로그인 */
);

/* 팀 */
CREATE TABLE TEAM (
	TEAM_ID NVARCHAR2(10) NOT NULL, /* 팀ID */
	TEAM_NAME NVARCHAR2(50) /* 팀명 */
);

/* 게시판 */
CREATE TABLE BOARD (
	BOARD_ID NVARCHAR2(10) NOT NULL, /* 게시판ID */
	BOARD_NAME NVARCHAR2(50) /* 게시판명 */
);

INSERT INTO TEAM VALUES('DEV01','개발1팀');
INSERT INTO TEAM VALUES('DEV02','개발2팀');
INSERT INTO TEAM VALUES('DEV03','개발3팀');
INSERT INTO TEAM VALUES('DEV04','개발4팀');

	INSERT INTO 
		EMPLOYEE(
				EMPLOYEE_NO,
				TEAM_ID,
                EMAIL,
				EMPLOYEE_NAME,
				JOIN_DATE,
				POSITION_ID,
				PASSWORD,
				CONFIRM_CHECK,
				ROLE,
				LAST_LOGIN) 
		VALUES (
				'2016122910',
				'DEV02',	
				'tkdgjs1501@nate.com',
				'김상헌',
				SYSDATE,
				'10',
				'ADMIN',
				'N',
				'USER',
				SYSDATE
				)
				
UPDATE EMPLOYEE SET CONFIRM_CHECK = 'Y'
    WHERE EMPLOYEE_NO = '2016122910'