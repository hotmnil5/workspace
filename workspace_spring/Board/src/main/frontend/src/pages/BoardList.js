import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const BoardList = () => {
  const navigate = useNavigate();
  // 조회된 게시글 목록을 저장할 변수
  const [boardList, setBoardList] = useState([]);

  // 게시글 목록 조회
  useEffect(()=>{
    axios.get('/board/list')
    .then((res)=>{
      setBoardList(res.data);
    })
    .catch((error)=>{
    alert('게시글 목록 조회 오류')
      console.log(error);
    })
  }, []);
  
  return(
    <div className="board-list-container">
      <div className="search-div">
        <select>
          <option>제목</option>
          <option>작성자</option>
        </select>
        <input type="text" />
        <button className="btn">검색</button>
      </div>
      <div className="board-list-div">
        <table>
          <colgroup>
            <col width='10%'/>
            <col width='*'/>
            <col width='20%'/>
            <col width='20%'/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>제 목</td>
              <td>작성자</td>
              <td>작성일</td>
            </tr>
          </thead>
          <tbody>
            {
              boardList.map((board, i)=>{
                return (
                  <tr key={i}>
                    <td>{boardList.length - i}</td>
                    <td>{board.title}</td>
                    <td>{board.memId}</td>
                    <td>{board.createDate}</td>
                  </tr>
                );
              })
            }
          </tbody>
        </table>
      </div>
      <div className="btn-div">
        <button type="button" className="btn" onClick={(e)=>{navigate('/detail')}}>글쓰기</button>
      </div>
    </div>
  )
}

export default BoardList;