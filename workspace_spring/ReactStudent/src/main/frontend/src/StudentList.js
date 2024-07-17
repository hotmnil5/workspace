import './reset.css'
import './App.css';
import { useNavigate, useParams } from 'react-router-dom';
import { useState } from 'react';

const StudentList = () => {
  const params = useParams();
  console.log(params);
  const [student, setstudent] = useState({});
  const navigate = useNavigate();
  return(
    <table>
      <thead>
        <tr>
          <td>No</td>
          <td>학생명</td>
          <td>국어점수</td>
          <td>영어점수</td>
          <td>수학점수</td>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>{student.stuNum}</td>
          <td>{student.stuName}</td>
          <td>{student.korScore}</td>
          <td>{student.engScore}</td>
          <td>{student.mathScore}</td>
        </tr>
      </tbody>
    </table>
  );
}

export default StudentList