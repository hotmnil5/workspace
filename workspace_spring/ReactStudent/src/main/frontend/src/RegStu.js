import { Navigate, useNavigate } from "react-router-dom";

const RegStu = () => {
  const navigate = useNavigate();
  return(
    <div>
      이름 <input /> <br />
      나이 <input /> <br />
      연락처 <input /> <br />
      주소 <input /> <br />
      <button type="button" onClick={(e)=>{navigate('/')}}>글쓰기</button>
    </div>
  );
}

export default RegStu;