import './BoardList.css'
// 게시글 목록 컴포넌트
const BoardList = ({board_list})=>{
  return (
    <table>
      <thead>
        <tr>
          <td>글 번호</td>
          <td>제 목</td>
          <td>작성자</td>
          <td>작성일</td>
        </tr>
      </thead>
      <tbody>
        {
          board_list.map((board, i)=>{
            return (
              <tr>
                <td>{board.boardNum}</td>
                <td>{board.title}</td>
                <td>{board.writer}</td>
                <td>{board.createDate}</td>
              </tr>
            );
          })        
        }
      </tbody>
    </table>
  );
}

export default BoardList;