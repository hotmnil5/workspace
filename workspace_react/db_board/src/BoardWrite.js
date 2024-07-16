const BoardWrite = ()=>{
  return(
  <div>
    <table>
      <thead>
        <tr>
          <td>글 번호</td>
          <td><input>{BoardWrite.boardNum}</input></td>
        </tr>
        <tr>
          <td>제목</td>
          <td><input></input></td>
        </tr>
        <tr>
          <td>작성자</td>
          <td><input></input></td>
        </tr>
        <tr>
          <td>작성일</td>
          <td><input>{board.cerateDate}</input></td>
        </tr>
        <tr>
          <td>내용</td>
          <td><textarea></textarea></td>
        </tr>
      </thead>
      <tbody></tbody>
    </table>
    <button type="button" onClick={()=>{
      alert('게시글 등록')}}>글등록</button>
  </div>
  );
}