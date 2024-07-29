import React, { useEffect, useState } from 'react'
import * as boardApi from '../apis/boardApi'
import { useNavigate, useParams } from 'react-router-dom';
import * as replyApi from '../apis/replyApi'
import axios from 'axios';
import { login } from '../apis/memberApi';

const BoardDetail = ({loginInfo}) => {
  const navigate = useNavigate();
  const {boardNum} = useParams();
  
  // 게시글 상세 정보를 저장할 변수
  const [BoardDetail, setBoardDetail] = useState({});
  
  // 댓글 목록을 저장할 변수
  const [selectReply, setSelectReply] = useState([]);
  
  // 댓글 등록시 가져가야 하는 데이터를 저장할 변수
  const [replyData, setReplyData] = useState({
    replyContent : '',
    memId : loginInfo.memId,
    boardNum : boardNum
  });
  // 댓글 삭제 후 재랜더링을 위한 변수
  const [deleteState, setDeleteState] = useState({});

  // 게시글 상세 정보 조회
  // useEffect(()=>{
  //   boardApi.selectBoard(boardNum)
  //   .then((res)=>{
  //     setBoardDetail(res.data);
  //   })
  //   .catch((error)=>{
  //     console.log(error);
  //   });
  // }, []);

  // useEffect(()=>{
  //   replyApi.selectReply(boardNum)
  //   .then((res)=>{
  //     setSelectReply(res.data);
  //   })
  //   .catch((error)=>{});
  // }, []);

  //DB에서 데이터 조회 여러개 동시에 실행하기
  useEffect(()=>{
    axios.all([
        boardApi.selectBoard(boardNum)
      , replyApi.selectReply(boardNum)
    ])
    .then(axios.spread((res1, res2)=>{
      setBoardDetail(res1.data);
      setSelectReply(res2.data);
    }))
    .catch();
  }, [replyData, deleteState]);

  function regReply(){
    axios.post('/reply/insert', replyData)
    .then((res)=>{
      alert('댓글 등록');
      // document.querySelector('input[type="text"]').value = '';
      // 추가된 댓글이 화면에 바로 보이게 코드 작성
      setReplyData({
        ...replyData,
        replyContent : ''
      });
    }).catch((error)=>{console.log(error)});
  }

  // 댓글 삭제
  function deleteComment(replyNum){
    axios.delete(`/reply/delete/${replyNum}`)
    .then((res)=>{
      alert('댓글 삭제')
    })
    .catch((error)=>{
      console.log(error)
    });
  }
  // 게시글 삭제
  function deletePost(boardNum){
    axios.delete(`/board/delete/${boardNum}`)
    .then((res)=>{
      alert('게시글 삭제')
      navigate('/')
    })
    .catch((error)=>{console.log(error)})
  }

  return (
    <div>
      <div>
        글 번호 :{BoardDetail.boardNum} <br />
        제  목 :{BoardDetail.title} <br />
        작성자 :{BoardDetail.memId} <br />
        작성일 :{BoardDetail.createDate} <br />
        내  용 :{BoardDetail.content} <br />
      </div>
      <div>
        <button type='button'>목록가기</button>
        {
          loginInfo.memRole == 'ADMIN' || loginInfo.memId == BoardDetail.memId
          ?
          <>
          <button type='button'>수정</button>
          <button type='button' onClick={(e)=>{deletePost(BoardDetail.boardNum)}}>삭제</button>
          </>
          :
          null
        } <br />
        {
          loginInfo.memId != null ? 
          <>
          <input type='text' value={replyData.replyContent} onChange={(e)=>{
            setReplyData({
              ...replyData,
              replyContent : e.target.value
            });
          }}/>
          <button type='button' onClick={(e)=>{regReply()}}>댓글 등록</button> 
          </>
          : null
        }
      </div>
      <div>
        {
          selectReply.map((reply, i)=>{
            return (
              <div key={i}>
                <div>{reply.replyDate}</div>
                <div>{reply.memId}</div>
                <div>{reply.replyContent}</div>
                <button type='button' onClick={(e)=>{deleteComment(reply.replyNum)}}>댓글 삭제</button>
              </div>
            );
          })
        }
      </div>
    </div>
  )
}

export default BoardDetail