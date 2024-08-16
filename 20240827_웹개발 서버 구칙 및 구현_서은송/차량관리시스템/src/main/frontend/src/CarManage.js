import React from 'react'

const CarManage = () => {
  return (
    <div className='container-div'>
      <div>
        <div>-차량등록</div>
        <div>
          <span>제조사</span>
          <select>
            <option>현대</option>
            <option>기아</option>
            <option>쌍용</option>
          </select>
          <span>모델명</span>
          <input type='text'/>
          <span>차량가격</span>
          <input type='number'/>
        </div>
        <div>
          <button type='button'>등록</button>
        </div>
      </div>
      <div>
        <div>-차량목록</div>
        <div>
          <table>
            <thead>
              <tr>
                <td>모델번호</td>
                <td>모델명</td>
                <td>제조사</td>
              </tr>
            </thead>
          </table>
        </div>
      </div>
    </div>
  )
}

export default CarManage