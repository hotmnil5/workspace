package com.green.ListPractice.controller;

import com.green.ListPractice.service.StudentService;
import com.green.ListPractice.vo.StudentVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.PublicKey;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
//    List<StudentVO> stuList = new ArrayList<>();
    StudentService studentService = new StudentService();

    @GetMapping("/stu_list")
    public String stu_list(Model model){
        // 학생 여러명이 저장될 수 있는 공간 생성
        // 학생 목록 데이터를 html에 전달
//        model.addAttribute("stuList", stuList);

        // 학생 목록 데이터 받아오기
        List<StudentVO> list = studentService.getStuList();

        // 학생 목록을 html로 전달
        model.addAttribute("stuList", list);

        return "stu_list";
    }
    @GetMapping("/reg_student")
    public String reg_student(StudentVO studentVO){
        return "reg_student";
    }
    // 학생 등록 + 학생 목록 페이지로 이동
    @PostMapping("/regStu")
    public String regStu(StudentVO studentVO){
//        stuList.add(studentVO);

        studentService.regStudent(studentVO);

        return "redirect:/stu_list";
    }

    // 상세페이지로 이동
    @GetMapping("/student_detail")
    public String student_detail(@RequestParam(name="num") int num, Model model){

        // 내가 클릭한 학생 한 명을 검색(학번을 알면 됨)
        StudentVO student = studentService.getStuDetail(num);
        // 학생 상세 정보 데이터를 html로 전달
        model.addAttribute("student", student);

        return "student_detail";
    }
    // 학생 삭제 + 목록페이지로 이동
    @GetMapping("/stuDelete")
    public String stuDelete(@RequestParam(name = "num") int num){
        // 학생 삭제
        studentService.deleteStu(num);

        return "redirect:/stu_list";
    }

    // 학생 정보 수정 페이지
    @GetMapping("/updateForm")
    public String updateForm(@RequestParam(name = "num")int num, Model model){
        // 정보를 수정할 학생의 원래 정보를 html에 전달
        // 1. 정보를 수정할 학생 한 명을 pick.
        StudentVO student = studentService.getStuDetail(num);
        // 2. 수정할 학생을 html로 전달
        model.addAttribute("student", student);
        return "update_student";
    }

    // 학생 정보 수정 + 상세 페이지로 이동
    @PostMapping("/updateStu")
    public String updateStu(StudentVO studentVO){
        // 학생 정보 수정
        studentService.updateStu(studentVO);
        // 3번

        return "redirect:/student_detail?num=" + studentVO.getNum();
    }
}
