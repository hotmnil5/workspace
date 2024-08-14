import React, { useEffect, useState } from 'react'
import './ItemDetail.css';
import axios from 'axios';
import { useParams } from 'react-router-dom';
const ItemDetail = () => {

  const {itemCode} = useParams();

  // 조회한 상품 정보 데이터를 저장할 state 변수
  const [itemDetail, setItemDetail] = useState({});

  // 대표 이미지명을 저장할 변수
  const [mainImgName, setMainImgName] = useState('');
  // 상세 이미지명을 저장할 변수
  const [subImgName, setSubImgName] = useState('');

  // 수량을 저장할 변수
  const [itemCnt, setItemCnt] = useState(1);

  // 총 가격을 저장하는 state 변수
  const [totalPrice, setTotalPrice] = useState(0);

  // 상품 상세 정보 조회
  useEffect(()=>{
    axios.get(`/api_item/getItemDetail/${itemCode}`)
    .then((res)=>{
      let img1 = '';
      let img2 = '';
      // 조회한 정보에서 대표이미지명, 서브 이미지명 찾기
      res.data.imgList.forEach((img, i)=>{
        if(img.isMain == 'Y'){
          img1 = img.attachedFileName;
        }
        else{
          img2 = img.attachedFileName;
        }
      });

      setMainImgName(img1);
      setSubImgName(img2);
      setItemDetail(res.data);
      setTotalPrice(res.data.itemPrice);
    })
    .catch((error)=>{console.log(error)});
  }, []);

  // 수량이 변경되면 실행되는 함수
  function changeItemCnt(e){
    const cnt = Number(e.target.value);

    if(cnt < 1){
      alert('1인당 최소 구매 가능 수량은 1권입니다.')
      setItemCnt(1)
      setTotalPrice(itemDetail.itemPrice)
    }
    else if(cnt > 10){
      alert('1인당 최대 구매 가능 수량은 10권입니다.')
      setItemCnt(1)
      setTotalPrice(itemDetail.itemPrice)
    }
    else{
      setTotalPrice(itemDetail.itemPrice * Number(e.target.value))
      setItemCnt(e.target.value)
    }
  }

  return (
      <div className='item-detail-div'>
        <div className='item-info-div'>
          <img src={`http://localhost:8080/upload/${mainImgName}`}/>
          <div>
            <h1>{itemDetail.itemName}</h1>
            <p>가격 : {Object.keys(itemDetail).length == 0 ? '' : '￦' + itemDetail.itemPrice.toLocaleString() + '원'}</p>
            <div className='item-cnt-div'>
              <span>수량</span>
              <input type='number' className='form-control' value={itemCnt} onChange={(e)=>{
                  changeItemCnt(e)
                }}/>
            </div>
            <p>총 가격 : {'￦' + totalPrice.toLocaleString() + '원'}</p>
            <div className='item-button-div'>
              <button type='button' className='btn btn-primary'>구매하기</button>
              <button type='button' className='btn btn-primary'>장바구니에 담기</button>
            </div>
          </div>
        </div>
        <div className='item-intro-div'>
          {itemDetail.itemIntro}
        </div>
        <div className='detail-img-div'>
          <img src={`http://localhost:8080/upload/${subImgName}`}/>
        </div>
      </div>
  )
}

export default ItemDetail