import logo from './logo.svg';
import './reset.css';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import BoardList from './pages/BoardList';
import Detail from './pages/Detail';

function App() {
  const navigate = useNavigate();
  return (
    <div className="conatainer">
      <div className='header'>
        <dib>
          <span>Login</span>
          <span>Join</span>
        </dib>
        <h2>자유게시판</h2>
      </div>
      <div className='content'>
        <Routes>
          {/* 게시글 목록 페이지 */}
          <Route path='/' element={ <BoardList /> } />
          <Route path='/detail' element={ <Detail /> } />
        </Routes>
      </div>
    </div>
  );
}

export default App;
