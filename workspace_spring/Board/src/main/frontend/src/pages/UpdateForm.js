import React, { useEffect, useState } from 'react'
import * as boardApi from '../apis/boardApi'
import { useNavigate, useParams } from 'react-router-dom';
const UpdateForm = () => {
  const navigate = useNavigate();
  // url로 넘어오는 boardNum 값 받기
  const {boardNum} = useParams();

  // 게시글 상세 정보를 저장할 state 변수
  const [boardDetail, setBoardDetail] = useState({});

  // 수정 쿼리 실행 시 빈 값을 채워줄 데이터
  const [updateDate, setUpdateDate] = useState({
    boardNum : boardNum,
    title : '',
    content : ''
  });

  function changeUpdateDate(e){
    setUpdateDate({
      ...updateDate,
      [e.target.name] : e.target.value
    });
  }

  // 게시글 상세 정보 조회
  useEffect(()=>{
    boardApi.selectBoard(boardNum)
    .then((res)=>{
      setBoardDetail(res.data);
      setUpdateDate({
        ...updateDate,
        title : res.data.title,
        content : res.data.content
      });
    })
    .catch((error)=>{console.log(error);});
  }, []);
  // 게시글 수정 쿼리 실행
  function updateBoard(){
    boardApi.updateBoard(updateDate)
    .then((res)=>{
      alert('수정 완료');
      navigate(`/detail/${boardNum}`);
    })
    .catch((error)=>{console.log(error);});
  }
  return (
    <div>
      <div>작성일 : {boardDetail.createDate}</div>
      <div>작성자 : {boardDetail.memId}</div>
      <div>제목 <input type='text' defaultValue={boardDetail.title} name='title' onChange={(e)=>{changeUpdateDate(e)}}/></div>
      <div>내용 <textarea value={updateDate.content} name='content' onChange={(e)=>{changeUpdateDate(e)}}></textarea></div>
      <div>
        <button type='button' onClick={(e)=>{navigate(-1)}}>뒤로가기</button>
        <button type='button' onClick={(e)=>{updateBoard()}}>수정</button>
      </div>
    </div>
  )
}

export default UpdateForm