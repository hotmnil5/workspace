package com.green.ReactStudent.controller;

import com.green.ReactStudent.vo.StudentVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.green.ReactStudent.service.StudentService;

import java.util.List;

@RestController
public class StudentController {
    @Resource(name = "studentService")
    private StudentService studentService;

    // 학생 목록 조회
    @GetMapping("/getStuList")
    public List<StudentVO> getStuList(){
        return studentService.getStuList();
    }

    // 학생등록
    @PostMapping("/insertStudent")
    public void insertStudent(@RequestBody StudentVO studentVO){
        studentService.insertStudent(studentVO);
    }

    // 상세 페이지
    @GetMapping("/stuDetail")
    public void stuDetail(@RequestBody StudentVO studentVO){
        studentService.stuDetail(studentVO);
    }
}
