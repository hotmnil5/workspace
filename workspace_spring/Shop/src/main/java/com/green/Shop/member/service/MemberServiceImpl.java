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
}
