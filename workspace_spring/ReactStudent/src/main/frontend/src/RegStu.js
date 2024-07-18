import axios from "axios";
import { useState } from "react";
import { Navigate, useNavigate } from "react-router-dom";

const RegStu = () => {
  // 쿼리 실행을 위해 전달해야 하는 데이터
  const navigate = useNavigate();
  const [stuInfo, setStuInfo] = useState({
    stuName : '',
    stuAge : '',
    stuTel : '',
    stuAddr : ''
  });

  function changeStuInfo(e){
    setStuInfo({
      ...stuInfo,
      [e.target.name] : e.target.value
    });
  }

  function regStudent(){
    // 이름 입력 확인
    const nameInputTag = document.querySelector('input[name="stuName"]');
    if(nameInputTag.value == ''){
      alert('이름은 필수 입력입니다.');
      nameInputTag.focus();
      return;
    }
    axios
    .post('/insertStudent', stuInfo)
    .then((res)=>{
      alert('학생을 등록하였습니다.')
      navigate('/')
    })
    .catch((error)=>{
      alert('error!');
      console.log(error);
    });
  }

  return(
    <div>
      이름 <input name="stuName" onChange={(e)=>{changeStuInfo(e)}}/> <br />
      나이 <input name="stuAge" onChange={(e)=>{changeStuInfo(e)}}/> <br />
      연락처 <input name="stuTel" onChange={(e)=>{changeStuInfo(e)}}/> <br />
      주소 <input name="stuAddr" onChange={(e)=>{changeStuInfo(e)}}/> <br />
      <button type="button" onClick={(e)=>{regStudent()}}>학생 등록</button>
    </div>
  );
}

export default RegStu;