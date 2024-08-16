import React from 'react'
import { useNavigate } from 'react-router-dom'

const SaleInfo = () => {
  const navigate = useNavigate();
  return (
    <div>
      <div>
        <span>구매자명</span>
        <input type='text'/>
      </div>
      <div>
        <span>색상</span>
        <select>
          <option>블랙</option>
          <option>화이트</option>
          <option>실버</option>
          <option>레드</option>
        </select>
        <span>모델</span>
        <select>
          <option>아반떼</option>
          <option>소나타</option>
          <option>K5</option>
          <option>K8</option>
        </select>
      </div>
      <div>
        <span>연락처</span>
        <input type='text'/>
      </div>
      <div>
        <button type='button' onClick={()=>{navigate('/saleTable')}}>등록</button>
      </div>
    </div>
  )
}

export default SaleInfo