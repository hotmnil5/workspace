import logo from './logo.svg';
import './App.css';
import { Route, Router, Routes, useNavigate } from 'react-router-dom';
import Home from './Home';
import './reset.css';
import CarManage from './CarManage';

function App() {
  const navigate = useNavigate();
  return (
    <div className="container">
      <div className='page-div'>
        <ul className='heard-menu'>
          <li>
            <span onClick={(e)=>{navigate('/')}}>홈</span>
          </li>
          <li>
            <span onClick={()=>{}}>차량관리</span>
          </li>
          <li>
            <span onClick={()=>{}}>판매 정보 등록</span>
          </li>
          <li>
            <span onClick={()=>{}}>판매 목록</span>
          </li>
        </ul>
      </div>
      <div>
        <Routes>

          <Route path='/' element={<Home />} />

          <Route path='/carManage' element={<CarManage />} />
        </Routes>
      </div>
    </div>
  );
}

export default App;
