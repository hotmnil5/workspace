package com.green.Start;

// 이 클래스는 페이지(html) 이동을 담당함 -> Controller

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

// 1. 자바에서 html로 데이터를 전달하기 위해서는
// 실행되는 메서드의 매개변수에 Model 인터페이스 객체를 선언
// 2. 객체명.addAttribyte 메서드를 사용하여 데이터를 전달한다.

// @ : 어노테이션(Anotation)
@Controller // 해당 클래스가 관제탑 역할을 하는 Controller 임을 인지시켜줌.
public class TestController {

    // 컨트롤러 내의 리턴타입이 문자열(String)인 메서드는
    // 실행하면 리턴되는 문자열 이름의 html 파일을 실행시킴.
    @GetMapping("/t1")
    public String goTest1(Model model){
        model.addAttribute("name","java");
        model.addAttribute("age",10);
        return "test1";
    }
    @GetMapping("/t2")
    public String goTest2(Model model){
        String[] hobbies = {"독서", "운동", "공부"};
        model.addAttribute("abc", hobbies);

        Member m = new Member("hong", 20, 90);
        model.addAttribute("member", m);

        return "test2";
    }
    @GetMapping("/t3")
    public String goTest3(Model model){
        List<Member> list = new ArrayList<>();

        Member m1 = new Member("홍길동", 22, 90);
        Member m2 = new Member("이순신", 32, 85);
        Member m3 = new Member("장영실", 42, 92);

        list.add(m1);
        list.add(m2);
        list.add(m3);

        model.addAttribute("memberList", list);

        return "test3";
    }

}
