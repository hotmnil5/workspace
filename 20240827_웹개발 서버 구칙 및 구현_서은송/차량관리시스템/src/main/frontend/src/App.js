import logo from './logo.svg';
import './App.css';
import { Route, Router, Routes, useNavigate } from 'react-router-dom';
import Home from './Home';
import './reset.css';
import CarManage from './CarManage';
import SaleInfo from './SaleInfo';
import SaleTable from './SaleTable';

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
            <span onClick={()=>{navigate('/carManage')}}>차량관리</span>
          </li>
          <li>
            <span onClick={()=>{navigate('/saleInfo')}}>판매 정보 등록</span>
          </li>
          <li>
            <span onClick={()=>{navigate('/saleTable')}}>판매 목록</span>
          </li>
        </ul>
      </div>
      <div>
        <Routes>

          <Route path='/' element={<Home />} />

          <Route path='/carManage' element={<CarManage />} />

          <Route path='/saleInfo' element={<SaleInfo/>}/>

          <Route path='/saleTable' element={<SaleTable/>}/>

        </Routes>
      </div>
    </div>
  );
}

export default App;
