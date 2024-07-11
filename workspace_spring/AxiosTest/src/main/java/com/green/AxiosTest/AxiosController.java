package com.green.AxiosTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// RestController : 컨트롤러 안의 메서드 리턴이 html파일 명이 아님.
@RestController
public class AxiosController {

    @GetMapping("/test1")
    public String test1(){
        return "bye";
    }
    @GetMapping("/test2")
    public int test2(){
        return 100;
    }
    @GetMapping("/test3")
    public int[] test3(){
        int[] arr = {1,2,3,4,5};
        return arr;
    }
    @GetMapping("/test4")
    public List<ItemVO> test4(){
        // ItemVO 객체를 세 개 리액트로 전달
        ItemVO item = new ItemVO(1, "first_java", 20000, "intro1", "book_1.jpg");
        ItemVO item2 = new ItemVO(2, "java_design", 25000, "intro2", "book_2.jpg");
        ItemVO item3 = new ItemVO(3, "deep_running", 30000, "intro3", "book_3.jpg");

        List<ItemVO> itemList = new ArrayList<>();
        itemList.add(item);
        itemList.add(item2);
        itemList.add(item3);

        return itemList;
    }
}
