import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const BoardDetail = () => {
  const navigate = useNavigate();
  // useParams : route의 url로 전달되는 데이터 받기
  const params = useParams();
  console.log(params);

  // 상세 정보를 저장한 state 변수
  const [board, setBoard] = useState({});

  // DB에서 상세 조회한 내용을 화면에 출력
  useEffect(()=>{
    axios
    .get(`/boardDetail/${params.boardNum}`)
    .then((res)=>{
      console.log(res.data);
      setBoard(res.data);
    })
    .catch((error)=>{
      alert('error!');
      console.log(error);
    });
  },[]);

  function postDelete(e){
    if(window.confirm('삭제 하시겠습니까?')){
      axios
      .delete(`/postDelete/${board.boardNum}`)
      .then((res)=>{
        alert('삭제 되었습니다.');
        navigate('/');
      })
      .catch((error)=>{
        alert('error!');
        console.log(error);
      })
    }
  }
  return (
    <div>
      <div>글 번호 : {board.boardNum}</div>
      <div>제목 : {board.boardTitle}</div>
      <div>내용 : {board.boardContent}</div>
      <div>작성자 : {board.boardWriter}</div>
      <div>작성일 : {board.createDate}</div>
      <button type="button" onClick={(e)=>{navigate(-1)}}>뒤로가기</button>
      <button type="button" onClick={(e)=>{postDelete()}}>삭제</button>
    </div>
  );
}

export default BoardDetail;