import logo from './logo.svg';
import './reset.css';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import FirstBoard from './FirstBoard';
import ManageCar from './ManageCar';

function App() {
  const navigate = useNavigate();
  return (
    <div className="App">
      <table className='title'>
        <colgroup>
          <col width='25%' />
          <col width='25%' />
          <col width='25%' />
          <col width='25%' />
        </colgroup>
        <tr>
          <td>홈</td>
          <td><span onClick={(e)=>{navigate('/ManageCar')}} className='carManage'>차량관리</span></td>
          <td>판매 정보 등록</td>
          <td>판매 목록</td>
        </tr>
      </table>
      <div className='content'>
      <Routes>
        <Route path='/' element={ <FirstBoard /> } />

        <Route path='/ManageCar' element={ <ManageCar /> } />
      </Routes>
      </div>
    </div>
  );
}

export default App;
