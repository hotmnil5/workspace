import './reset.css'
import './StudentList.css'
import { useNavigate, useParams } from 'react-router-dom';
import { useEffect, useState } from 'react';
import axios from 'axios';

const StudentList = () => {
  // 학생 목록을 저장할 state 변수
  const [stuList, setStuList] = useState([]);

  useEffect(()=>{
    axios
    .get('/getStuList')
    .then((res)=>{
      setStuList(res.data);
    })
    .catch((error)=>{
      console.log(error);
    },)
  }, [])
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
          <td>평균</td>
        </tr>
      </thead>
      <tbody>
        {
          stuList.length == 0?
          <tr>
            <td colSpan='6'>조회된 데이터가 없습니다.</td>
          </tr>
          : stuList.map((stu, i)=>{
            return(
              <tr key={i}>
                <td>{stuList.length - i}</td>
                <td><span onClick={(e)=>{navigate('/stuDetail')}}>{stu.stuName}</span></td>
                <td>{stu.korScore}</td>
                <td>{stu.engScore}</td>
                <td>{stu.mathScore}</td>
                <td>{Math.round((stu.korScore + stu.engScore + stu.mathScore) / 3 * 10) /10 }</td>
              </tr>
            );
          })
        }
      </tbody>
    </table>
  );
}

export default StudentList