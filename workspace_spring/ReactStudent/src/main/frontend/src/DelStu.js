import axios from "axios";
import { useNavigate } from "react-router-dom";

const DelStu = () => {
  const navigate = useNavigate();
  function stuDelete(e){
    if(window.confirm('삭제 하시겠습니까?')){
      axios
      .delete()
      .then((res)=>{
        alert('삭제 되었습니다.')
        navigate('/delStu');
      })
      .catch((error)=>{
        alert('error!')
        console.log(error);
      })
    }
  }
  return(
    <div>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>학생명</td>
            <td>삭제</td>
          </tr>
        </thead>
        <tbody>
          <tr className="ch1">
            <td>1</td>
            <td>홍길동</td>
            <td><button type="button" onClick={(e)=>{{stuDelete()}}}>삭제</button></td>
          </tr>
          <tr className="ch2">
            <td>2</td>
            <td>김길동</td>
            <td><button type="button" onClick={(e)=>{{stuDelete()}}}>삭제</button></td>
          </tr>
          <tr className="ch1">
            <td>3</td>
            <td>박길동</td>
            <td><button type="button" onClick={(e)=>{{stuDelete()}}}>삭제</button></td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default DelStu;