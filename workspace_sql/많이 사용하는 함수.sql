-- 많이 사용하는 함수

SELECT 'JAVA', 123, 'HELLO';
SELECT 'JAVA', BOARD_NUM FROM board;

-- CONCAT : 문자열 나열 함수
SELECT 'JAVA', 'HELLO', CONCAT('JAVA', 'HELLO', 'PYTHON');
SELECT BOARD_NUM, TITLE, CONCAT(BOARD_NUM, '_', TITLE) AS BOARD_INFO
FROM board;

-- LENGTH : 문자열의 길이
SELECT 'JAVA', LENGTH('JAVA'), 'HELLO', LENGTH('HELLO');

-- SUBSTRING : 일부 문자열 추출
-- 첫번째 매개변수 : 원본 글,
-- 두번째 매개변수 : 추출 시작 INDEX(1부터 시작)
-- 세번째 매개변수 : 추출 개수
SELECT 'ABCDEFG', SUBSTRING('ABCDEFG', 3), SUBSTRING('ABCDEFG', 3, 2);

-- UPPER : 대문자로 변경하는 함수
-- LOWER : 소문자로 변경하는 함수
SELECT 'Mysql', UPPER('Mysql'), LOWER('Mysql');

-- 문자나 숫자의 자릿수 맞추기 
-- ( 첫번째 매개변수를 무조건 두번째 매개변수의 자릿수로
--   남는 자리에는 세번째 매개변수로 자릿수를 맞추겠다.)
-- LPAD : 세번째 매개변수를 앞에 붙임.
-- RPAD : 세번째 매개변수를 뒤에 붙임.
SELECT LPAD('JAVA', 5, '#'), RPAD('JAVA', 5, '#');

-- LTRIM : 문자열의 왼쪽 공백 제거
-- RTRIM : 문자열의 오른쪽 공백 제거
-- TRIM : 문자열의 양쪽 공백 제거
SELECT '  AA BB  ', LTRIM('  AA BB  '), RTRIM('  AA BB  '), TRIM('  AA BB  ');

-- 문자열 치환 함수
SELECT '010 1111 2222', REPLACE('010 1111 2222', ' ', '-');

-- 반올림 함수
-- 소수점 뒤 두번째 매개변수에 넣은 자릿수까지 출력
SELECT 123.456, ROUND(123.456, 2);

-- 연산 및 (MOD : 나머지 연산자)
SELECT 10 + 10, 2 * 3, 15 / 4, MOD(10, 3);

-- NULL 데이터를 치환하는 함수
SELECT COMM, IFNULL(COMM, 0) FROM emp;

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
-- 단일행 함수 : 데이터의 갯수와 상관없이 조회 결과 하나의 행 결과만 갖는 함수
-- SUM(), MAX(), MIN(), AVG(), COUNT()
SELECT * FROM emp;

-- 모든 사원의 급여 및 커미션 총합을 조회
-- SUM(10, 10) <- 이런 쿼리는 불가
SELECT SUM(SAL), SUM(COMM) FROM emp;

-- SUM() 함수가 위의 함수와 다른점
-- SUM() 함수는 데이터의 수와 상관없이 무조건 하나의 조회 결과를 가짐
SELECT LENGTH (ENAME), LENGTH (JOB) FROM emp;

-- *** 쿼리 조회 시 조회하는 모든 컬럼의 조회 행 갯수는 모두 일치해야 함 ***
-- 모든 사원의 이름과 급여의 합을 조회 (오류!!)
SELECT ENAME, SUM(SAL) FROM emp;

SELECT SUM(SAL), MAX(SAL), MIN(SAL), AVG(SAL), COUNT(SAL)
FROM emp;

-- 테이블에 있는 데이터의 수 조회
SELECT COUNT(*) FROM emp;
-- 추천하는 방법 : COUNT(PK)
SELECT COUNT(EMPNO) FROM emp;

-- NULL 데이터는 COUNT에서 제외함.
SELECT COUNT(COMM) FROM emp;

-- 평균 계산 시 NULL 데이터 주의
SELECT AVG(COMM) FROM emp;

-- CUMM 컬럼의 평균 값을 계산하는 올바른 방법
SELECT ROUND(AVG(IFNULL(COMM, 0)), 2) FROM emp;