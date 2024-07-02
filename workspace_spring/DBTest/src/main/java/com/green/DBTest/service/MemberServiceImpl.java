package com.green.DBTest.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// implements
// TEST_MEMBER 테이블에 데이터를 조작하는 DB 작업을 하는 클래스

//MemberServiceImpl memberService = new MemberServiceImpl();
@Service("memberService")
public class MemberServiceImpl implements MemberService {
    // sqlSessionTemplate 객체 : 쿼리 실행을 위한 메서드를 가지고 있는 객체
    // 쿼리 실행을 위한 메서드
    // 데이터 삽입(INSERT) : 객체.insert("쿼리가 있는 mapper파일의 namespace.쿼리 id, [실행할 쿼리의 빈값을 채울 데이터]");
    // 데이터 삭제(DELETE) : 객체.delete("쿼리가 있는 mapper파일의 namespace.쿼리 id, [실행할 쿼리의 빈값을 채울 데이터]");
    // 데이터 수정(UPDATE) : 객체.update("쿼리가 있는 mapper파일의 namespace.쿼리 id, [실행할 쿼리의 빈값을 채울 데이터]");
    // 데이터 조회(SELECT) : 객체.selectOne("쿼리가 있는 mapper파일의 namespace.쿼리 id, [실행할 쿼리의 빈값을 채울 데이터]");
    //                      객체.selectList("쿼리가 있는 mapper파일의 namespace.쿼리 id, [실행할 쿼리의 빈값을 채울 데이터]");
    @Autowired
    private SqlSessionTemplate sqlSession;

    // TEST_MEMBER 테이블에 데이터 1개 삽입
    @Override
    public void insertMember(){
        sqlSession.insert("memberMapper.insert1");
    }

    @Override
    public void insetMember2() {
        // 쿼리가 있는 mapper파일의 namespace.쿼리 id
        sqlSession.insert("memberMapper.insert2", 20);
    }
}
