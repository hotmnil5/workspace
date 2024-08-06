import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import './Login.css';
import Modal from '../../common/Modal';

const Login = () => { 
  const navigate = useNavigate();
  //LOGIN 버튼 클릭 시 화면에 보여지는 모달창의 상태
  const [beforeLoginModal, setBeforeLoginModal] = useState(false);

  // login 쿼리가 실행된 후 보여지는 모달창의 상태
  const [afterLoginModal, setAfterLoginModal] = useState(false);

  // login 성공 실패 여부를 저장하는 변수
  const [isLoginSuccess, setIsLoginSuccess] = useState(false);

  // 입력한 id, pw를 저장할 변수
  const [loginData, setLoginData] = useState({
    memId : '',
    memPw : ''
  });

  // 입력한 id, pw를 logindata에 저장하는 함수 (입력할 때마다 실행)
  function changeLoginData(e){
    setLoginData({
      ...loginData,
      [e.target.name] : e.target.value
    });
  }
  console.log(loginData);
  // 로그인 버튼 클릭 시 실행
  function login(){
    // id, pw 입력 여부 확인
    if(loginData.memId == '' || loginData.memPw == ''){
      // 모달창 상태를 보이게 변경
      setBeforeLoginModal(true);
      return;
    }

    axios.post('/api_member/login', loginData)
    .then((res)=>{
      setAfterLoginModal(true);
      // 자바에서 null 데이터가 전달되면 res.data는 빈문자('')데이터로 변환한다.
      if(res.data == ''){ // 로그인 실패시
        setIsLoginSuccess(false);
      }
      else{ // 로그인 성공시
        setIsLoginSuccess(true);

        // 로그인 정보
        const loginInfo = {
          memId : res.data.memId,
          memName : res.data.memName,
          memRole : res.data.memRole
        }

        // 로그인 정보를 가진 객체를 문자열 형태로 변환
        // 객체 -> 문자열로 변환한 데이터를 JSON 데이터로 부른다.
        const json_loginInfo = JSON.stringify(loginInfo);

        // sessionStoragy에 로그인한 회원의 아이디, 이름, 권한정보 등록
        window.sessionStorage.setItem('loginInfo', json_loginInfo);
      }
    })
    .catch((error)=>{console.log(error)});

  }

  // login 쿼리 실행 후 뜨는 모달 안의 내용
  function drawModalContent(){
    return (
      <>
        {
          isLoginSuccess
          ?
          <div>환영합니다.</div>
          :
          <div>ID, 비밀번호를 확인하세요.</div>
        }
      </>
    );
  }
  
  // login 쿼리 실행 후 뜨는 모달 안의 확인 버튼 클릭 시 실행되는 내용
  function handleBtn(){
    if(isLoginSuccess){ // 로그인 성공시 확인 버튼 내용
      // 로그인 성공시 상품 목록 페이지로 이동
      navigate('/')
    }
    else{ // 로그인 실패시 확인 버튼 내용

    }
  }

  return (
  <div className='login-page-div'>
    <div>
      <input type='text' className='form-control' name='memId' placeholder='Input your ID' onChange={(e)=>{changeLoginData(e)}}/>
    </div>
    <div>
    <input type='password'className='form-control' placeholder='Input your Password' name='memPw' onChange={(e)=>{changeLoginData(e)}}/>
    </div>
    <div>
      <button className='btn btn-primary' onClick={(e)=>{login()}}>L O G I N</button>
    </div>

    {/* login 중 id, pw 입력 여부 확인 모달창 */}
    {
      beforeLoginModal
      ?
      <Modal content={()=>{
        return(
          <div> Id, pw는 필수입력입니다.</div>
        );
      }}
        setIsShow={setBeforeLoginModal}
        clickCloseBtn={ () => {}} />
      :
      null
    }

    {/* login 쿼리 실행 후 뜨는 모달 */}
    {
      afterLoginModal ?
      <Modal content={drawModalContent}
            setIsShow={setAfterLoginModal}
            clickCloseBtn={handleBtn}
      /> : null
    }
  </div>
  )
}

export default Login