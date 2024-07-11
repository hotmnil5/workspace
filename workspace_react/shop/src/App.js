import logo from './logo.svg';
import './App.css';
import data from './data';
import ItemList from './ItemList';
import axios from 'axios';
import { Route, Routes } from 'react-router-dom';

function App() {
  // 상품 목록 데이터
  const item_list = data;


  return (
    <div className="App">
      <div className='header'>
        Book Shop
      </div>
      <div className='banner'>
        <img className='bannerImg' src={process.env.PUBLIC_URL + '/header.jpg'}/>
      </div>

      <Routes>
        <Route path='/' element={<div>메인페이지</div>} />
        <Route path='/list' element={<ItemList item_list = {item_list}/>} />
        <Route path='/detail' element={<div>상세페이지</div>} />
      </Routes>


      
      <Test name={'hong'} age={20}/>
    </div>
  );
}

const Test = ({name, age})=>{
  console.log(name);
  console.log(age);
  return (
    <div>hello</div>
  );
}
export default App;
