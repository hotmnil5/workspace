import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

const BoardWrite = ()=>{
  const navigate = useNavigate();

  // 입력한 내용을 저장하는 state 변수
  const [board, setBoard] = useState({
    boardTitle : '',
    boardContent : '',
    boardWriter : ''
  });

  // 글 등록 버튼 클릭 시 실행하는 함수
  function insertBoard(){
    // 제목이 비었으면
    const title_input = document.querySelector('input[name="boardTitle"]');
    if(title_input.value == ''){
      alert('제목은 필수 입력입니다.')
      title_input.focus();
      return;
    }
    // if(board.boardTitle == ''){
    //   alert('제목은 필수 입력입니다.')
    // }

    if(document.querySelector('input[name="boardWriter"]').value == ''){
      alert('작성자는 필수 입력입니다.')
      return;
    }

    axios
    .post('/regBoard', board)
    .then((res)=>{
      alert('게시글 등록');
      navigate('/');
    })
    .catch((error)=>{
      alert('error!');
      console.log(error);
    });
  }

  // 입력 값 세팅
  function changeBoard(e){
    setBoard({
      ...board,
      [e.target.name] : e.target.value
    })
  }
  return(
  <div>
    <table>
      <thead>
        <tr>
          <td>제목</td>
          <td><input name="boardTitle" onChange={(e)=>{changeBoard(e)}} /></td>
        </tr>
        <tr>
          <td>작성자</td>
          <td><input name="boardWriter" onChange={(e)=>{changeBoard(e)}} /></td>
        </tr>
        <tr>
          <td>내용</td>
          <td><textarea name="boardContent" onChange={(e)=>{changeBoard(e)}}></textarea></td>
        </tr>
      </thead>
      <tbody></tbody>
    </table>
    <button type="button" onClick={(e)=>{insertBoard()}}>글등록</button>
  </div>
  );
}

export default BoardWrite;