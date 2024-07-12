import { useState } from "react";

const InputTest = ()=>{
  // input 태그에 입력한 내용을 저장하는 변수
  let [inputData, setInputData] = useState('');
  const [inputdata2, setInputData2] = useState('');

  const [stu, setStu] = useState({
    stuName : '',
    age : 0,
    score : 0,
    addr : ''
  });

  function changeStu(e){
    setStu({
      ...stu,
      [e.target.name] : e.target.value
    });
  }
  return (
  <>
  <div>
      이름 : <input type='text' onChange={(e)=>{
        console.log(e.target.value);
        // inputData = e.target.value;
        setInputData(e.target.value);
      }}/> <br/>
      나이 : <input type='text' onChange={(e)=>{
        setInputData2(e.target.value);
      }}/>
    </div>

    <div>
      학생 명 : <input type='text' name='stuName' onChange={(e)=>{
        changeStu(e);
      }}/> <br/>
      나이 : <input type='text' name='age' onChange={(e)=>{
        changeStu(e);
      }}/> <br/>
      점수 : <input type='text' name='score' onChange={(e)=>{
        changeStu(e);
      }}/> <br/>
      주소 : <input type='text' name='addr' onChange={(e)=>{
        changeStu(e);
      }}/> <br/>

      <div>
        이름 : {stu.stuName} <br/>
        나이 : {stu.age} <br/>
        점수 : {stu.score} <br/>
        주소 : {stu.addr} <br/>
      </div>

      </div>
  </>
  );
}

export default InputTest;