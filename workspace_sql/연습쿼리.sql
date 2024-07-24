	, MEM_NAME VARCHAR(50) NOT NULL
	, GENDER VARCHAR(10) -- 'male', 'female'
	, MEM_ROLE VARCHAR(20) DEFAULT 'USER' 
);

-- 임시 회원 데이터
INSERT INTstudy_dbstudy_dbO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES ('java', '1111', '김자바', 'male', 'USER');
INSERT INTO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE) 
VALUES ('admin', '1111', '관리자', 'female', 'ADMIN');

-- 게시판 (회원만 게시글 작성 가능)
CREATE TABLE BOARD (
	BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY
	, TITLE VARCHAR(50) NOT NULL
	, CONTENT VARCHAR(100)
	, MEM_ID VARCHAR(50) REFERENCES BOARD_MEMBER (MEM_ID) -- 외래키
	, CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- 게시글 임시데이터
INSERT INTO board (BOARD_NUM, TITLE, CONTENT, MEM_ID) 
VALUES (1, '1번글', '1번 내용', 'java');
INSERT INTO board (BOARD_NUM, TITLE, CONTENT, MEM_ID) 
VALUES (2, '2번글', '2번 내용', 'java');
INSERT INTO board (BOARD_NUM, TITLE, CONTENT, MEM_ID) 
VALUES (3, '3번글', '3번 내용', 'admin');

SELECT * FROM board;


-- 댓글 (회원만 가능)
CREATE TABLE BOARD_REPLY (
	REPLY_NUM INT AUTO_INCREMENT PRIMARY KEY
	, REPLY_CONTENT VARCHAR(50) NOT NULL
	, REPLY_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	, MEM_ID VARCHAR(50) REFERENCES BOARD_MEMBER (MEM_ID)
	, BOARD_NUM INT REFERENCES BOARD (BOARD_NUM)
);

-- 댓글 임시데이터
INSERT INTO board_reply (REPLY_NUM, REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES (1, '댓글1', 'java', 1);
INSERT INTO board_reply (REPLY_NUM, REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES (2, '댓글2', 'java', 2);
INSERT INTO board_reply (REPLY_NUM, REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES (3, '댓글3', 'java', 1);
INSERT INTO board_reply (REPLY_NUM, REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES (4, '댓글4', 'admin', 1);
INSERT INTO board_reply (REPLY_NUM, REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES (5, '댓글5', 'admin', 2);

-- 데이터 조회 연습
-- 회원의 이름이 '김자바'인 회원이 작성한 게시글의
-- 글번호, 제목, 작성자 아이디, 작성자 이름을 조회,
-- 작성일 기준 최신 글부터 조회(내림차순)

SELECT BOARD_NUM, TITLE, MEM_ID, MEM_NAME
FROM board B, board_member M
WHERE B.MEM_ID = M.MEM_ID AND MEM_NAME = '김자바'
ORDER BY CREATE_DATE DESC;
