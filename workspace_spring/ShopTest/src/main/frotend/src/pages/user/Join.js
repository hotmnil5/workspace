import React, { useRef, useState } from 'react'
import './Join.css';
import { useDaumPostcodePopup } from 'react-daum-postcode';
import axios from 'axios';
import Modal from '../../common/Modal';

const Join = () => {

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

  function changeJoinData(e){
    setJoinData({
      ...joinData,
      [e.target.name] : e.target.name == 'memEmail' ? email_1.current.value + email_2.current.value : e.target.value
    });


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

  console.log(joinData);

  // 회원가입 버튼 클릭 시 insert 쿼리 실행하러 가기
  function join(){
    axios.post('/api_member/join', joinData)
    .then((res)=>{
      // 모달창 띄우기
      setIsShow(true);
    })
    .catch((error)=>{console.log(error)})
  }

  changeJoinData(joinData.memId)
  .then((res)=>{
    const result = res.data;
    alert(result ? 'ID 중복' : 'ID 사용 가능');
    if(!result){
      setIsShow(false);
    }
  })
  .catch(()=>{})

// ID 길이
  // const idLength = joinData.memId.length;
  // if(idLength < 4 || IdleDeadline > 8){
  //   alert('ID는 4 ~ 8 글자 사이로 입력 해주시기 바랍니다.')
  //   return;
  // }


  // 모달창 랜더링 여부
  const [isShow, setIsShow] = useState(false);

  // 모달창 안의 내용을 생성하는 함수
  function setModalContent(){
    return (
      <div>회원가입을 축하합니다</div>
    );
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
                  <input type='text' className='form-control'name='memId' onChange={(e)=>{changeJoinData(e)}}/>
                  <button type='button' className='btn btn-primary' >중복확인</button>
                </div>
              </td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td><input className='form-control' type='password' name='memPw' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td>비밀번호 확인</td>
              <td><input name ='confirmPw' className='form-control' type='password' /></td>
            </tr>
            <tr>
              <td>이름</td>
              <td><input className='form-control' type='text' name='memName' onChange={(e)=>{changeJoinData(e)}}/></td>
            </tr>
            <tr>
              <td>연락처</td>
              <td><input type='text' className='form-control' placeholder='숫자만 입력하세요' name='memTel' onChange={(e)=>{changeJoinData(e)}}/></td>
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
        isShow ? <Modal content={setModalContent} setIsShow={setIsShow}/> : null
      }
    </div>
  )
}


export default Join