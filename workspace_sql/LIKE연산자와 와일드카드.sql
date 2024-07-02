
SELECT * FROM emp;
-- 사원명에 '이' 가 포함된 사원의 모든 정보 조회
-- 글자가 포함되는지 조회 할 때는 LIKE 연산자와 와일드 카드를 사용
-- 와일드 카드 : % OR _
-- % : 글자 위치와 글자의 수에 제한이 없는 문자
-- _ : 그 위치의 한 글자의 문자
SELECT *
FROM emp
WHERE ENAME LIKE '%이%';

SELECT *
FROM emp
WHERE ENAME LIKE '_이_'; -- 이름은 세 글자이며 가운데 글자가 '이'인 이름을 조회한 것

SELECT *
FROM emp
WHERE ENAME LIKE '%이'; -- 마지막 글자가 '이'로 끝나는 이름을 조회한 것

SELECT *
FROM emp
WHERE ENAME LIKE '_이%'; -- 두번째 글자가 '이'인 뒷글자 수 제한 없는 이름 조회한 것

-- 문자열 연결 함수
SELECT 'JAVA', 1+1, CONCAT('집에', '가고', '싶다');