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

    //게시글 목록 조회
    @Override
    public List<StudentVO> getStuList() {
        return sqlSession.selectList("studentMapper.getStuList");
    }

    //학생 등록
    @Override
    public void insertStudent(StudentVO studentVO) {
        sqlSession.insert("studentMapper.insertStudent", studentVO);
    }

    //학생 상세 정보 조회
    @Override
    public StudentVO getStuDetail(int stuNum) {
        return sqlSession.selectOne("studentMapper.getStuDetail", stuNum);
    }

    //학생 삭제
    @Override
    public void deleteStu(int stuNum) {
        sqlSession.delete("studentMapper.deleteStu", stuNum);
    }
}
