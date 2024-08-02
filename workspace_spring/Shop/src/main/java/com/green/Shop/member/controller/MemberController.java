package com.green.Shop.member.controller;

import com.green.Shop.member.service.MemberService;
import com.green.Shop.member.vo.MemVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api_member")
public class MemberController {
    @Resource(name = "memberService")
    private MemberService memberService;
    // 회원가입
    @PostMapping("/join")
    public void join(@RequestBody MemVO memVO){
        memberService.join(memVO);
    }

}
