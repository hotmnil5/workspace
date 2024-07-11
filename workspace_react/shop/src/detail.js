import { useParams } from 'react-router-dom';
import './detail.css';
const Detail = ([item_list])=>{
  // url로 전달되는 데이터 받기
  // 1번
  // const params = useParams();
  // console.log(params);
  // console.log(params.id);

  const {id} = useParams();
  let findItem = null;
  item_list.forEach((item, i)=>{
    if(item.itemNum == id){
      findItem = item;
    }
  })



  return (
    <>
    <div className="item-info">
      <img src={process.env.PUBLIC_URL + '/' + findItem.imgName}/>
    <div>
      <h4>{findItem.itemName}</h4>
      <p>{findItem.price}</p>
      <button type='button'>주문하기</button>
    </div>
    </div>
    <div className='intro'>상품 소개입니다.</div>
    </>
  )
}

export default Detail