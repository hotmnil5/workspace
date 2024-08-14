import React from 'react'
import './CarList.css'
const CarList = () => {
  return (
    <div className='container'>
      <table className='carList-table'>
        <thead>
          <tr>
            <td>No</td>
            <td>
              <input type='checkbox'/>
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
          <tr>
            <td>3</td>
            <td>
              <input type='checkbox'/>
            </td>
            <td>상품3</td>
            <td>10000</td>
            <td>
              <input type='number'/>
            </td>
            <td>20000</td>
            <td>2024-08-10<br/>10:50</td>
            <td><button type='button'className='btn btn-primary' >삭제</button></td>
          </tr>
          <tr>
            <td>No</td>
            <td>
              <input type='checkbox'/>
            </td>
            <td>상품정보</td>
            <td>가격</td>
            <td>
              <input type='number'/>
            </td>
            <td>구매가격</td>
            <td>2024-08-10<br/>10:50</td>
            <td><button type='button'className='btn btn-primary' >삭제</button></td>
          </tr>
          <tr>
            <td>No</td>
            <td>
              <input type='checkbox'/>
            </td>
            <td>상품정보</td>
            <td>가격</td>
            <td>
              <input type='number'/>
            </td>
            <td>구매가격</td>
            <td>2024-08-10<br/>10:50</td>
            <td><button type='button'className='btn btn-primary' >삭제</button></td>
          </tr>
        </tbody>
      </table>
      <div className='btn-div'>
        <button className='btn btn-primary' >선택삭제</button>
        <button className='btn btn-primary' >선택구매</button>
      </div>
    </div>
  )
}

export default CarList