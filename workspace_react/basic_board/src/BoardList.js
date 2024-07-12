import { Link, useNavigate } from 'react-router-dom';
import './BoardList.css'
import Write from './Write';
// 게시글 목록 컴포넌트
const BoardList = ({board_list})=>{
  // navigate = 함수 -> navigate();
  // 함수는 뒤에 ()소괄호 붙음!
  const navigate = useNavigate();

  return (
    <>
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
                <tr key={i}>
                  <td>{board.boardNum}</td>
                  <td>
                    {/* Link 태그 */}
                    {/* <Link to='/detail'>
                    {board.title}
                    </Link> */}
                    <span onClick={(e)=>{
                      navigate(`/detail/${board.boardNum}`);
                    }}>{board.title}</span>
                  </td>
                  <td>{board.writer}</td>
                  <td>{board.createDate}</td>
                </tr>
              );
            })        
          }
        </tbody>
      </table>
      <button type='button' onClick={(e)=>{navigate('/writeForm')}}>글쓰기</button>
    </>
  );
}

export default BoardList;