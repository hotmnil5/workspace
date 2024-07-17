package com.green.ReactStudent.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import service.StudentService;

public class StudentController {
    @Resource(name = "studentService")
    private StudentService studentService;

//    @GetMapping("/")
}
