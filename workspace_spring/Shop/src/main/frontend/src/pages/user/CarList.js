import React, { useEffect, useState } from 'react'
import './CarList.css'
import axios from 'axios';

const CarList = () => {
  // 조회한 장바구니 목록 데이터를 저장할 변수
  const [cartList, setCartList] = useState([]);

  // 제목줄 체크박스의 체크여부를 저장하고 있는 state 변수
  // 체크 : true
  const [chkAll, setChkAll] = useState(true);

  // 내용줄 안의 체크박스들 체크여부를 저장하고 있는 state 변수
  const [chks, setChks] = useState([]);

  // 장바구니 목록 조회
  useEffect(()=>{
    const loginInfo = JSON.parse(window.sessionStorage.getItem('loginInfo'));
    
    axios.get(`/api_cart/getCartList/${loginInfo.memId}`)
    .then((res)=>{
      console.log(res.data);
      setCartList(res.data);

      // 조회된 장바구니 목록만큼 체크박스의 값을 설정
      let checkArr = new Array(res.data.length);
      checkArr.fill(true);
      setChks(checkArr);
    })
    .catch((error)=>{console.log(error)})
  }, []);

  useEffect(()=>{
    // 마운트 됐을 때는 실행하지 않겠다!
    if(chks.length != 0){
    // 제목줄 체크박스가 체크(해제) -> 전체 체크박스 체크(해제)
    const copyChks = [...chks];

    if(chkAll){
      copyChks.fill(true);
    }else{
      copyChks.fill(false);
    }

    setChks(copyChks);
    }
  }, [chkAll]);

  // 제목줄의 체크박스 변경 시 실행되는 함수
  function changeChkAll(){
    setChkAll(!chkAll)
  };

  
  return (
    <div className='cart-list-div'>
      <div className='cart-table-div'>
        <table className='cart-list-table'>
          <colgroup>
            <col width='5%'/>
            <col width='5%'/>
            <col width='*'/>
            <col width='10%'/>
            <col width='10%'/>
            <col width='12%'/>
            <col width='20%'/>
            <col width='10%'/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>
                <input type='checkbox' checked={chkAll} onChange={()=>{changeChkAll()}}/>
              </td>
              <td>상품정보</td>
              <td>가격</td>
              <td>수량</td>
              <td>구매가격</td>
              <td>구매일시</td>
              <td></td>
            </tr>
          </thead>
          <tbody>
            {
              cartList.map((cart, i)=>(
                <tr key={i}>
                  <td>{cartList.length - i}</td>
                  <td>
                    <input type='checkbox' checked={chks[i]} onChange={()=>{
                      const copyChks = [...chks];
                      copyChks[i] = !copyChks[i];
                      setChks(copyChks);
                    }}/>
                  </td>
                  <td className='img-td'>
                    <img src={`http://localhost:8080/upload/cart.itemVO.imgList[0].attchedFileName`} />
                    <span>{cart.itemVO.itemName}</span>
                  </td>
                  <td>{'￦' + cart.itemVO.itemPrice.toLocaleString()}</td>
                  <td>
                    <input type='number' className='form-control' defaultValue={cart.cartCnt}/>
                  </td>
                  <td>{'￦' + (cart.itemVO.itemPrice * cart.cartCnt).toLocaleString()}</td>
                  <td>{cart.cartDate}</td>
                  <td><button type='button' className='btn btn-primary' onClick={()=>{}}>삭 제</button></td>
                </tr>
              ))
            }
          </tbody>
        </table>
      </div>
      <div></div>
    </div>
  )
}

export default CarList