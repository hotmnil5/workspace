import axios from "axios";
import { useEffect, useState } from "react";
import './StudentList.css';
import { useNavigate } from "react-router-dom";

const StudentList = () => {
  const navigate = useNavigate();

  //학생 목록을 저장할 state 변수
  const [stuList, setStuList] = useState([]);

  useEffect(() => {
    axios
    .get('/getStuList')
    .then((res) => {
      setStuList(res.data);
    })
    .catch((error) => {
      console.log(error);
    });
  }, []);

  return (
    <div>
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
            stuList.length == 0 
            ? 
            <tr>
              <td colSpan='6'>조회된 데이터가 없습니다</td>
            </tr> 
            :
            stuList.map((stu, i) => {
              const avg = (stu.korScore + stu.engScore + stu.mathScore) / 3;
              return (
                <tr key={i}>
                  <td>{stuList.length - i}</td>
                  <td>
                    <span onClick={(e) => {navigate(`/detail/${stu.stuNum}`)}}>{stu.stuName}</span>
                  </td>
                  <td>{stu.korScore}</td>
                  <td>{stu.engScore}</td>
                  <td>{stu.mathScore}</td>
                  <td>{Math.round(avg * 100) / 100}</td>
                </tr>                      
              );
            })
          }
        </tbody>
      </table>
    </div>
  );
}

export default StudentList;