import logo from './logo.svg';
import './App.css';
import data from './data';
import { Route, Routes } from 'react-router-dom';
import BoardList from './BoardList';

function App() {
  // 게시글 목록
  let board_list = data;
  return (
    <div className="App">
      <Routes>
        {/* 게시글 목록 페이지 */}
        <Route path='/' element={ <BoardList board_list={board_list}/> }/>

        {/* 게시글 상세 정보 페이지 */}
        <Route path='/detail' element= {<div>게시글 상세 정보</div>}/>
      </Routes>
    </div>
  );
}

export default App;
