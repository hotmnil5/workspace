package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;

import java.util.List;

public interface StudentService {
    // 학생 목록 조회
    List<StudentVO> getStuList();

    // 학생 등록
    void insertStudent(StudentVO studentVO);

    // 상세 페이지
    void stuDetail(StudentVO studentVO);

//    StudentVO getStudent(int stuNum);
}
