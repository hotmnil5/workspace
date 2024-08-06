package com.green.Shop.member.service;

import com.green.Shop.member.vo.MemVO;

public interface MemberService {
    //회원 가입
    void join(MemVO memVO);

    //아이디 중복 확인
    //사용 가능 : true / 사용 불가 : false
    boolean isEnableId(String memId);

    //로그인
    MemVO login(MemVO memVO);
}
