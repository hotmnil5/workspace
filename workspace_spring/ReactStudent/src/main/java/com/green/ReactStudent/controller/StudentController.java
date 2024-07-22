package com.green.ReactStudent.controller;

import com.green.ReactStudent.service.StudentService;
import com.green.ReactStudent.vo.StudentVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Resource(name = "studentService")
    private StudentService studentService;

    //학생 목록 조회
    @GetMapping("/getStuList")
    public List<StudentVO> getStuList(){
        return studentService.getStuList();
    }

    //학생 등록
    @PostMapping("/insertStudent")
    public void insertStudent(@RequestBody StudentVO studentVO){
        System.out.println(studentVO);
        studentService.insertStudent(studentVO);
    }

    //학생 상세 정보 조회
    @GetMapping("/getStuDetail/{stuNum}")
    public StudentVO getStuDetail(@PathVariable("stuNum") int stuNum){
        return studentService.getStuDetail(stuNum);
    }

    @DeleteMapping("/deleteStu/{stuNum}")
    public void deleteStu(@PathVariable("stuNum") int stuNum){
        studentService.deleteStu(stuNum);
    }



}
