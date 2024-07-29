import { useEffect, useState } from "react";
import * as carApi from '../apis/carApi';
import { useNavigate } from "react-router-dom";

const ManageCar = () => {
  const navigate = useNavigate;
  const [carList, setCarList] = useState([]);

  useEffect(()=>{
    carApi.getCarList()
    .then((res)=>{
      setCarList(res.data);
    })
    .catch((error)=>{
      console.log(error);
    })
  })
  return (
    <div>
      <span>-차량등록</span> <br />
      제조사 <select>
        <option>현대</option>
        <option>기아</option>
        <option>쌍용</option>
      </select>
      모델명 <input type="text" />
      차량가격 <input type="number" /> <br />
      <button type="button" onClick={(e)=>{navigate('/')}}>등록</button> <br />
      <span>-차량목록</span> <br />
      <table>
        <thead>
          <colgroup>
          <col width='25%' />
          <col width='35%' />
          <col width='40%' />
          </colgroup>
          <tr>
            <td>모델번호</td>
            <td>모델명</td>
            <td>제조사</td>
          </tr>
        </thead>
        <tbody>
          {
            carList.map((car, i)=>{
              return(
                <tr key={i}>
                  <td>{carList.length - i}</td>
                  <td>{car.carName}</td>
                  <td>{car.company}</td>
                </tr>
              );
            })
          }
        </tbody>
      </table>

    </div>
  );
}
export default ManageCar;