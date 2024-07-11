import logo from './logo.svg';
import './App.css';
import data from './data';
import ItemList from './ItemList';
import axios from 'axios';
import { Link, Route, Routes } from 'react-router-dom';
import Detail from './detail';

function App() {
  // 상품 목록 데이터
  const item_list = data;


  return (
    <div className="App">
      <div className='header'>
        Book Shop
        <Link to='/list'> 상품 목록 </Link>
        <Link to='/detail'> 상품 상세</Link>
      </div>
      <div className='banner'>
        <img className='bannerImg' src={process.env.PUBLIC_URL + '/header.jpg'}/>
      </div>

      <Routes>
        <Route path='/' element={<div>메인페이지</div>} />
        <Route path='/list' element={<ItemList item_list = {item_list}/>} />
        <Route path='/detail/:id' element={<Detail item_list={item_list}/>} />
        <Route path='*' element={<div>잘못된 페이지입니다.</div>} />
      </Routes>
    </div>
  );
}

const Test = ({name, age})=>{
  console.log(name);
  console.log(age);
  return (
    <div></div>
  );
}
export default App;
