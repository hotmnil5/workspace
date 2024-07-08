import { useState } from "react";
import List from "./List";

function Add(props){
  let [text, setText] = useState('');
  return(
  <div className="box">
    <input type="text" onChange={(e)=>{
      setText(e.target.value);
    }}></input>
    <button type="button" onClick={(e)=>{
      // input 태그에 입력한 내용을 가져오기. -> text;
      // 가져온 내용을 list에 추가
      props.list.push(text);
      console.log(props.list);
      // 변경된 list의 내용으로 setList 함수를 호출
      props.setList([...props.list]);
    }}>추가</button>
  </div>
  );
}

export default Add;