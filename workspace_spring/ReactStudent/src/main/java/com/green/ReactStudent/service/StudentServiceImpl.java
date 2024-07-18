package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    // 게시글 목록 조회
    @Override
    public List<StudentVO> getStuList() {
        return sqlSession.selectList("studentMapper.getStuList");
    }

    // 학생 등록
    @Override
    public void insertStudent(StudentVO studentVO) {
        sqlSession.insert("studentMapper.insertStudent", studentVO);
    }

    // 상세 페이지
    @Override
    public void stuDetail(StudentVO studentVO) {
        sqlSession.insert("studentMapper.stuDetail", studentVO);
    }


//    @Override
//    public StudentVO getStudent(int stuNum) {
//        return null;
//    }

}
