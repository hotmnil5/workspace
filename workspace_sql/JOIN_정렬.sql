-- 여러 테이블의 내용을 동시에 조회하기 (JOIN (조인))
SELECT * FROM emp;
SELECT * FROM dept;

-- 사원번호 , 사원명, 부서명을 조회\
-- emp 테이블에서 DEPTON 확인 -> 20
-- dept 테이블에서 DEPTNO가 20인 데이터

-- JOIN 조건 : 두 테이블이 공통으로 지니는 컬럼의 값이 같은 데이터만 조회
SELECT emp.EMPNO, emp.ENAME, dept.DNAME
FROM emp, dept
WHERE emp.DEPTNO = dept.DEPTNO;

-- 조인 + 별칭
SELECT EMPNO AS 사원번호
	, ENAME AS 사원명
	, 사원.SAL
FROM emp 사원;

-- 직급이 '대리' 사원들의
-- 사원번호, 사원명, 직급, 부서번호, 부서명, 부서의 지역 조회
SELECT EMPNO, ENAME, JOB, DNAME, LOC, E.DEPTNO, D.DEPTNO
FROM emp E, dept D
WHERE E.DEPTNO = D.DEPTNO;
AND JOB = '사원';

-- 조회 시 데이터를 정렬하여 조회하기
SELECT * FROM emp;

-- 사번, 사원명, 급여를 조회, 급여 기준 오름차순 정렬 (생략시 자동 오름차순)
-- 오름차순 : ASC (생략 가능)
-- 내림차순 : DESC
SELECT EMPNO, ENAME, SAL
FROM emp
ORDER BY SAL DESC;

-- 부서 번호가 30번이 아닌 사원들의
-- 사원명, 부서번호를 조회하되, 사원명 기준 내림차순으로 정렬
SELECT ENAME, DEPTNO
FROM emp
WHERE DEPTNO != 30
ORDER BY ENAME DESC;

-- 부서명이 인사부가 아니면서 급여가 300 이상인 사원들의
-- 사번, 사원명, 부서번호, 부서명, 급여를 조회하되,
-- 부서번호 기준 오름차순으로 정렬
SELECT EMPNO, ENAME, EMP.DEPTNO, DNAME, SAL
FROM emp, dept
WHERE emp.DEPTNO = dept.DEPTNO AND DNAME != '인사부' AND SAL >= 300
ORDER BY DEPTNO;

SELECT EMPNO, ENAME, JOB, SAL
FROM emp
ORDER BY JOB DESC, SAL;