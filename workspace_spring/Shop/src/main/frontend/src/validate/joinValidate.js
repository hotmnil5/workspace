import { type } from "@testing-library/user-event/dist/type";

// valid_tag[0] : memId
// valid_tag[1] : memName
// 유효성 검사 결과를 저장할 변수
let resultArr = [
  false, // id
  false, // pw
  false, // name
  false, // tel
];
let result_pw1 = false;
let result_pw2 = false;

export const joinValidate = (newData, valid_tag, tagName) => {

  // id 값을 변경했으면 id 피드백만 띄움
  // pw 값을 변경했으면 pw 피드백만 띄움
  // name 값을 변경했으면 name 피드백만 띄움
  // tel 값을 변경했으면 tel 피드백만 띄움
  switch(tagName){
    case 'memId' :
      // id가 4~12글자 영문만 포함하는지 검사하는 정규식
      const regex_memId = /^[a-z|A-Z]{4,12}$/;
      
      // id 유효성 검사
      // test() : 매개변수로 들어온 데이터가 조건에 부합하면 리턴 true
      if(regex_memId.test(newData.memId)){
        // div에 good 클래스 추가
        // memId_valid_tag.current.className = 'feedback good';
        // // div 태그 안에 글자변경 : 사용 가능한 아이디
        // memId_valid_tag.current.textContent = '사용 가능한 아이디입니다.';
        
        sendFeedbackMsg(valid_tag[0], '사용 가능한 아이디입니다.' , 'good')
        resultArr[0] = true;
      }
      else{
        // div 안에 error 클래스 추가
        // memId_valid_tag.current.className = 'feedback error';
        // // div 태그 안에 글자변경 : 4자리 이상 가능
        // memId_valid_tag.current.textContent = '4글자 이상 12글자 이하인 영문으로만 입력해주세요.';

        sendFeedbackMsg(valid_tag[0], '4글자 이상 12글자 이하인 영문으로만 입력해주세요.', 'error')
        resultArr[0] = false;
      }
      break;
    case 'memPw' :
    case 'confirmPw' :
      // 비밀번호 값 유효성 검사
      // 4~12글자 영문 소문자 + 숫자만 포함하는지 검사하는 정규식
      const regex_memPw = /^(?=.*[a-z])(?=.*[0-9]).{4,12}$/

      if(regex_memPw.test(newData.memPw)){
        sendFeedbackMsg(valid_tag[3], '사용 가능한 비밀번호입니다.', 'good')
        result_pw1 = true;  
      }
      else{
        sendFeedbackMsg(valid_tag[3], '4글자 이상 12글자 이하인 영어 소문자 + 숫자 조합으로 입력해주세요.','error');
        result_pw1 = false;
      }

      // 비밀번호 및 비밀번호 확인 글자가 같아야 함
      // 입력한 두 비밀번호가 다르면
      if(newData.memPw != newData.confirmPw){
        sendFeedbackMsg(valid_tag[2], '비밀번호가 일치하지 않습니다.', 'error');
        result_pw2 = false;
      }
      else{
        sendFeedbackMsg(valid_tag[2], '', 'good');
        result_pw2 = true;
      }

      resultArr[1] = result_pw1 && result_pw2 ? true : false;

      break;

    case 'memName' :
      // 이름 값 유효성 검사
      // 2~10 글자 한글만 포함하는지 검사하는 정규식
      const regex_memName = /^[ㄱ-ㅎ|가-힣]{2,10}$/;

      // 정규식에 충족하면
      if(regex_memName.test(newData.memName)){
        // memName_valid_tag.current.className = 'feedback good';
        // memName_valid_tag.current.textContent = '사용 가능한 이름입니다.';

        sendFeedbackMsg(valid_tag[1], '사용 가능한 이름입니다.', 'good')
        resultArr[2] = true;
      }
      // 정규식에 충족하지 않으면
      else{
        // memName_valid_tag.current.className = 'feedback error';
        // memName_valid_tag.current.textContent = '2글자 이상 10글자 이하인 한글로만 입력해주세요.';

        sendFeedbackMsg(valid_tag[1], '2글자 이상 10글자 이하인 한글로만 입력해주세요.' ,'error');
        resultArr[2] = false;
      }
      break;
    case 'memTel' :
      // 연락처 정규식
      // 연락처 값 유효성 검사
      // 010-숫자4개-숫자4개
      const regex_memTel = /^\d{3}-\d{4}-\d{4}$/;
      if(regex_memTel.test(newData.memTel)){
        sendFeedbackMsg(valid_tag[4], '가입 가능 연락처입니다.', 'good')
        resultArr[3] = true;
      }
      else{
        sendFeedbackMsg(valid_tag[4], '000-0000-0000 형식으로 연락처를 입력하세요.', 'error')
        resultArr[3] = false;
      }
      break;
  }

  // 배열에 매개변수로 전달된 데이터가 존재하면 리턴 true
  // return !resultArr.includes(false);

  // resultArr의 모든 데이터가 true일 때만 return true;

  console.log(resultArr);
  for(const e of resultArr){
    if(!e){
      return false;
    }
  }

  return true;
}

// 유효성 결과 메시지를 띄우는 함수
function sendFeedbackMsg(feedbackTag ,msg, type){
  feedbackTag.current.className = `feedback ${type}`;
  feedbackTag.current.textContent = msg;
}
