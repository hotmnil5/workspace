import React from 'react'
import './ItemDetail.css';
const ItemDetail = () => {
  return (
    <div>
      <div className='itemDetail-container'>
        <div className='itemDetail-img'>
        <img src={`http://localhost:8080/upload/65ea38dc-3e48-4608-b2c7-4975ef024fa4.jpg`} />
        </div>
        <div className='itemDetail-content'>
          <h3>시나공 워드</h3>
          <p>가격 : 23,000</p>
          <p>수량 <input type='number'min={0}/></p>
          <p>총 가격 : 0</p>
          <button type='button'>바로 구매하기</button>
          <button type='button'>장바구니에 담기</button>
        </div>
      </div>
        <div className='itemDetail-footer'>
          <img src={`http://localhost:8080/upload/fb886c56-d3e6-43ce-96c9-366fe49aedc0.jpg`}/>
        </div>
    </div>
  )
}

export default ItemDetail