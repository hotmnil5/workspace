package service;

import com.green.ReactStudent.vo.StudentVO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private SqlSessionTemplate sqlSession;
    @Override
    public List<StudentVO> StudentList() {
        List<StudentVO> studentList = sqlSession.selectList("studentMapper.studentList");
        return studentList;
    }

//    @Override
//    public StudentVO getStudent(int stuNum) {
//        return null;
//    }

}
