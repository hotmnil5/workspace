package com.green.Board.service;

import com.green.Board.vo.MemberVO;

import java.util.List;

public interface MemberService {

    //아이디 중복 확인
    boolean isDuplicateId(String memId);

    //회원가입
    void join(MemberVO memberVO);

    //로그인
    MemberVO login(MemberVO memberVO);


































//    void insertMember(MemberVO memberVO);
//
//    void test1(MemberVO memberVO);
//    void test2(String memId);
//    void test3(int boardNum);
//
//    void sds(MemberVO memberVO);
//
//    MemberVO may(MemberVO memberVO);
//    MemberVO may1(String memId);
























}
