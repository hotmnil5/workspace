package com.green.Shop.member.service;

import com.green.Shop.member.vo.MemVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
    @Autowired
    private SqlSessionTemplate sqlSession;
    // 회원 가입
    @Override
    public void join(MemVO memVO) {
        sqlSession.insert("memberMapper.join", memVO);
    }

    // 아이디 중복 확인
    // 사용 가능 : true / 사용 불가 : false
    @Override
    public boolean isEnableId(String memId) {
        // 사용 가능한 아이디면 selectedId : null
        String selectedId = sqlSession.selectOne("memberMapper.isEnableId", memId);
        return selectedId == null;
    }

    // 로그인
    @Override
    public MemVO login(MemVO memVO) {
        return sqlSession.selectOne("memberMapper.login", memVO);
    }
}
