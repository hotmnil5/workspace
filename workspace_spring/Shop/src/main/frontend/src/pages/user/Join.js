import React, { useRef, useState } from 'react'
import './Join.css';
import { useDaumPostcodePopup } from 'react-daum-postcode';
import axios from 'axios';
import Modal from '../../common/Modal';
import { joinValidate } from '../../validate/joinValidate';
import { Navigate, useNavigate } from 'react-router-dom';

const Join = () => {
  // id 중복 체크 여부를 저장할 변수
  const [isCheckId, setIsCheckId] = useState(false);

  const navigate = useNavigate();
  // daum 주소 api 팝업창을 띄우기 위한 함수 선언
  const open = useDaumPostcodePopup();

  // 주소 검색 팝업창이 닫힐 때 실행되는 함수
  function handleComplete(data){
    // 우편번호
    console.log(data.zonecode);
    // 도로명 주소
    console.log(data.roadAddress);
    // input 태그에 검색한 내용 넣어주기
    setJoinData({
      ...joinData,
      post : data.zonecode,
      memAddr : data.roadAddress
    })
  }
  // 검색 버튼 클릭 시 실행되는 함수
  function handleClick(){
    open({onComplete : handleComplete});
  }

  // 태그를 참조하는 변수
  const email_1 = useRef();
  const email_2 = useRef();


  // 회원 가입 쿼리 실행시 가져갈 데이터
  const [joinData, setJoinData] = useState({
    memId : '',
    memPw : '',
    confirmPw : '',
    memName : '',
    memTel : '',
    post : '',
    memAddr : '',
    addrDetail : '',
    memEmail : ''
  });

  const memId_valid_tag = useRef();
  const memName_valid_tag = useRef();
  const confirmPw_valid_tag = useRef();
  const memPw_valid_tag = useRef();
  const memTel_valid_tag = useRef();

  const valid_tag = [
    memId_valid_tag
    , memName_valid_tag
    , confirmPw_valid_tag
    , memPw_valid_tag
    , memTel_valid_tag
  ];

  // 유효성 검사 결과를 저장하는 변수
  const [valid_result, setValidResult] = useState(false);
  
  function changeJoinData(e){
    // 입력한 데이터
    const newData = {
      ...joinData,
      [e.target.name] : e.target.name == 'memEmail' ? email_1.current.value + email_2.current.value : e.target.value
    }
    
    // 입력한 데이터에 대한 validation 처리
    
    
    // validation 처리 : 모든 데이터가 유효한 데이터면 리턴 true;
    const valid_result = joinValidate(newData, valid_tag, e.target.name);
    setValidResult(valid_result);
    // 유효성 검사가 끝난 데이터를 joinData에 저장
    setJoinData(newData);
    // memEmail
    // if(e.target.name == 'memEmail'){
      //   setJoinData({
        //     ...joinData,
        //     [e.target.name] : email_1.current.value + email_2.current.value
        //   });
        // }
        // else{
          //   setJoinData({
            //     ...joinData,
            //     [e.target.name] : e.target.value
            //   });
            // }
  }
          
          // console.log(joinData);
          
  // 회원가입 버튼 클릭 시 insert 쿼리 실행하러 가기
  function join(){
    // 유효성 검사 결과가 false면 회원가입 로직 중지
    if(!valid_result){
      alert('입력 데이터를 확인하세요.')
      return;
    }

    // id 중복 검사 했는지 확인
    if(!isCheckId){
      alert('ID 중복 검사 후 가입이 가능합니다.')
      return;
    }

    axios.post('/api_member/join', joinData)
    .then((res)=>{
      // 모달창 띄우기 -> 띄워진 모달창에서 닫기 누르면 로그인 페이지로 이동
      setIsShow(true);
    })
    .catch((error)=>{console.log(error)})
  }
  // 모달창 랜더링 여부
  const [isShow, setIsShow] = useState(false);

  // 모달창 안의 내용을 생성하는 함수
  function setModalContent(){
    return (
      <div>회원가입을 축하합니다</div>
    );
  }

  // 모달창을 닫으면 실행되는 함수
  function onclickModalBtn(){
    navigate('/loginForm')
  }
  
  // 중복확인 버튼 클릭 시 실행
  function isEnableId(){
    axios.get(`/api_member/isEnableId/${joinData.memId}`)
    .then((res) => {
      if(res.data){
        alert('사용 가능한 ID 입니다')
        setIsCheckId(true);
      }
      else{
        alert('중복된 아이디입니다.')
      }
    })
    .catch((error) => {
      console.log(error);
    });
  }

  return (
    <div className='join-div'>
      <div>
        <table className='join-table'>
          <tbody>
            <tr>
              <td>아이디</td>
              <td>
                <div className='inline-input'>
                  <input type='text' className='form-control'name='memId' onChange={(e)=>{
                    changeJoinData(e)
                    setIsCheckId(false);
                  }}/>
                  <button type='button' className='btn btn-primary' onClick={(e)=>{isEnableId()}}>중복확인</button>
                </div>
                <div className='feedback' ref={valid_tag[0]}></div>
              </td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td><input className='form-control' type='password' name='memPw' onChange={(e)=>{changeJoinData(e)}}/> 
              <div className='feedback' ref={valid_tag[3]}></div>
              </td>
            </tr>
            <tr>
              <td>비밀번호 확인</td>
              <td><input name ='confirmPw' className='form-control' type='password' onChange={(e)=>{changeJoinData(e)}}/>
              <div className='feedback' ref={valid_tag[2]}></div>
              </td>
            </tr>
            <tr>
              <td>이름</td>
              <td><input className='form-control' type='text' name='memName' onChange={(e)=>{changeJoinData(e)}}/>
              <div className='feedback' ref={valid_tag[1]}></div>
              </td>
            </tr>
            <tr>
              <td>연락처</td>
              <td><input type='text' className='form-control' placeholder='숫자만 입력하세요' name='memTel' onChange={(e)=>{changeJoinData(e)}}/>
              <div className='feedback' ref={valid_tag[4]}></div>
              </td>
            </tr>
            <tr>
              <td>주소</td>
              <td>
                <div className='inline-input'>
                  <input value={joinData.post} type='text' readOnly={true} className='form-control' onClick={handleClick} placeholder='우편번호' name='post' onChange={(e)=>{changeJoinData(e)}}/>
                  <button type='button' className='btn btn-primary' onClick={handleClick}>검색</button>
                </div>
              </td>
            </tr>
            <tr>
              <td></td>
              <td><input value={joinData.memAddr} type='text' readOnly={true} className='form-control' placeholder='주소' onClick={handleClick} name='memAddr' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td></td>
              <td><input type='text' className='form-control' placeholder='상세주소'name='addrDetail' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td>이메일</td>
              <td>
                <div className='inline-input'>
                  <input type='text' ref={email_1} className='form-control' name='memEmail' onChange={(e)=>{changeJoinData(e)}}/>
                  <select className='form-control' ref={email_2} name='memEmail' onChange={(e)=>{changeJoinData(e)}}>
                    <option value={'@naver.com'}>naver.com</option>
                    <option value={'@google.com'}>google.com</option>
                  </select>
                </div>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className='btn-div'>
        <button type='button' className='btn btn-primary but' onClick={(e)=>{join()}}>회원가입</button>
      </div>
      {/* 회원가입 성공 시 열리는 모달 */}
      {
        isShow ? <Modal content={setModalContent} setIsShow={setIsShow} clickCloseBtn={onclickModalBtn}/> : null
      }
    </div>
  )
}


export default Join