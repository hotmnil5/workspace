import logo from './logo.svg';
import './reset.css';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import UserLayout from './pages/user/UserLayout';
import AdminLayout from './pages/admin/AdminLayout';
import Join from './pages/user/Join';

function App() {
  const navigate = useNavigate();
  return (
  <div className="container">

      <div className='login-div'>
        <div>
          <ul className='heard-menu'>
            <li><span onClick={(e)=>{navigate('/login')}}>LOGIN</span></li>
            <li><span onClick={(e)=>{navigate('/join')}}>JOIN</span></li>
          </ul>
        </div>
        <div className='banner'>
          <div>
            <img src='http://localhost:8080/images/book_banner.PNG' className='banner-img' />
          </div>
          <div className='title-div'>BOOK SHOP</div>
        </div>
      </div>

      <div className='layout-div'>
        <Routes>
          {/* 일반 유저용 */}
          <Route path='/' element={ <UserLayout /> }>
            {/* 상품 목록 화면 */}
            <Route path='' element={<div>상품 목록 화면</div>} />
            {/* 회원가입 페이지 */}
            <Route path='join' element={<Join />} />
          </Route>
          {/* 관리자용 */}
          <Route path='/admin' element={ <AdminLayout /> } >
            <Route path='test1' element={<div>상품 등록 페이지</div>} />
          </Route>
        </Routes>
      </div>
    </div>
  );
}

export default App;
