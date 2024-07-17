import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';
import { Route, Routes } from 'react-router-dom';
import { Axios } from 'axios';
import AxiosTest from './AxiosTest';
import BoardList from './BoardList';
import BoardDetail from './BoardDetail';
import BoardWrite from './BoardWrite';

function App() {

  // 가장 마지막에 실행
  // 컴포넌트의 생애주기에 따라 기능을 구현
  // 생애주기
  // mount(컴포넌트 생성)
  // update(컴포넌트 재랜더링)
  // unmount(컴포넌트 제거)
  const [age, setAge] = useState(0);
  const [addr, setAddr] = useState('');
  // setAge(10); = 재랜더링 됨.
  useEffect(()=>{}); // 마운트 될 때 + 업데이트 될 때 실행
  useEffect(()=>{}, []); // 마운트 될 때만 실행 됨 (재랜더링 할 때는 실행 X) 
  useEffect(()=>{}, [age]); // 마운트 될 때 + 
  // 대괄호 안에 들어있는 age라는 state 변수의 값이 update 될 때 실행됨.
  useEffect(()=>{}, [age, addr]); // 마운트 될 때 +
  // 대괄호 안에 들어있는 age, addr 이라는 state 변수의 값이 update 될 때 실행됨. 

  return (
    <div className="App">

      <Routes>
        {/* {axios 예제 페이지} */}
        <Route path='/axios' element={ <AxiosTest/> } />

        {/* {게시글 목록 페이지} */}
        <Route path='/' element={<BoardList />} />

        {/* {상세 정보 페이지} */}
        <Route path='/detail/:boardNum' element={<BoardDetail />} />
        
        {/* {글쓰기 페이지} */}
        <Route path='/write' element={<BoardWrite />} />

      </Routes>
      
    </div>
  );
}

export default App;
