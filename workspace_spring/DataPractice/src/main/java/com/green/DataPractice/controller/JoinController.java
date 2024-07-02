package com.green.DataPractice.controller;

import com.green.DataPractice.vo.JoinVO;
import com.green.DataPractice.vo.SurveyVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {
    @GetMapping("/reg_member")
    public String reg_member(){
        return "reg_member";
    }

    // 커맨드 객체는 model을 사용하지 않아도 자동으로 html로 전달된다.
    // 이때 넘어가는 데이터는 클래스명에서 앞글자만 소문자로 바꾼 이름으로 넘어간다.
    @PostMapping("/regMember")
    public String regMember(JoinVO joinVO, Model model){
        System.out.println("id = " + joinVO.getId());
        System.out.println("pw = " + joinVO.getPw());
        System.out.println("name = " + joinVO.getName());
        System.out.println("pn = " + joinVO.getPn());
        System.out.println("mail = " + joinVO.getMail());
        System.out.println("bir = " + joinVO.getBir());
//        System.out.println(joinVO);  -> toString()

        model.addAttribute("regMember", joinVO);

        return "regMember";
    }

    //survey.
    @GetMapping("/surver")
    public String surver(){
        return "surver";
    }
    @PostMapping("/sResult")
    public String sResult(SurveyVO surveyVO){
        System.out.println(surveyVO);
        return "survey_result";

    }
}
