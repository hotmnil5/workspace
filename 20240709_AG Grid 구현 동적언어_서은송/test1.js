const e = 10;
e = 5.5;

const a = 10;
const b = 5.5;
const c = 'hi';
const d = "hi";
 
// 배열과 객체는 여러 데이터를 저장할 수 있는 변수이다.
const arr1 = []; // 배열
const arr2 = [1, 5.5, 'javascript'] // 배열

const obj1 = {}; // 객체

// key 값은 중복 불가
const obj2 = {
  // key : value
  age : 20,
  score : 50,
  addr : '울산시'
  // addr : '대구시' => key 값 중복-> 안에 데이터가 교체 되는 것, 2개 중복 안댐.
};

const date = [
  {
    stuName : 'kim',
    age : 20
  },
  {
    stuName : 'lee',
    age : 25
  }
];

const add_data = {
  stuName : 'park',
  age : 30
};
date.push(add_data);

//item_list는 현재 쇼핑몰에서 판매하고 있는 상품들의 목록 정보이다.
//아래 데이터를 참고하여 요구사항을 해결하시오.

// 배열 : 데이터가 여러 개 존재(반복 돌리기 가능) + 데이터 접근시 순번으로 접근
// item_list => 배열
// item_list[0] => 객체
// item_list[0].item_name => (문자열) 객체 내에 key : value
// item_list[0].price => (정수) 객체 내에 key : value
// item_list[0].size => (배열) 객체 내에 key : value
// item_list[0].sixe[1] => (정수) 객체 내에 배열 중 1번쨰 값 (100)

const item_list = [
  {
    item_name : '여름 셔츠',
    price : 25000,
    brand : 'java마켓',
    size : [90, 100, 110]
  },
  {
    item_name : '라운드 티',
    price : 20000,
    brand : 'java마켓',
    size : [90, 95, 100, 105, 110]
  },
  {
    item_name : '데님 청바지',
    price : 30000,
    brand : 'python마켓',
    size : [90, 100, 110, 120]
  },
  {
    item_name : '슬림 면바지',
    price : 35000,
    brand : 'python마켓',
    size : [90, 95, 100]
  }
];

//1. 'java마켓'에서 팔고 있는 상품들의 상품명과 가격을 각각 콘솔창에 출력하여라.
let ptintMP = '';
for(let i = 0; i<item_list.length; i++){
  if(item_list[i].brand == 'java마켓'){
    ptintMP+=item_list[i].item_name+' : ';
    ptintMP+=item_list[i].price+' / ';
  }
}console.log(ptintMP);

// 1-1 시험 결과 풀이
for(let i = 0; i < item_list.length; i++){
 if(item_list[i].brand == 'java마켓'){
  console.log(`상품명 : ${item_list[i].item_name} / 가격 : ${item_list[i].price}`)
 }  
}
// 1-2
for(const item of item_list){
  if(item.brand == 'java마켓'){
    console.log(`상품명 : ${item.item_name} / 가격 : ${item.price}`)
  }
}
// 1-3
item_list.forEach((item, i)=>{
  if(item.brand == 'java마켓'){
    console.log(`상품명 : ${item.item_name} / 가격 : ${item.price}`)
  }
});

//2. 95사이즈를 구매할 수 있는 상품들의 상품명을 콘솔창에 출력하시오.
for (let i = 0; i < item_list.length; i++) {
  if (item_list[i].size.includes(95)) {
    console.log(item_list[i].item_name);
  }
}

// 2 시험 결과 풀이
item_list.forEach((item, i)=>{
  item.size.forEach((size, j)=>{
  if(size == 95){
    console.log(item.item_name);
    }
  });
})

//3. '등록 및 출력' 버튼을 클릭하면 입력 내용 저장 후 콘솔창에 데이터를 출력하시오.
// function addItem() {
//   const itemName = document.getElementById('itemName').value;
//   const price = document.getElementById('price').value;
//   const brand = document.getElementById('brand').value;
//   const sizes = document.querySelectorAll('.size:checked');

//   if (itemName == null) {
//       alert('상품명을 입력하세요');
//       return;
//   }

//   const newItem = {
//       item_name: itemName,
//       price: price,
//       brand: brand,
//       size: sizes
//   };

//   item_list.push(newItem);
//   console.log(item_list);
// }

// 3 시험 결과 풀이
function addItem(){
  // 체크박스
  const chks = document.querySelectorAll('.size:checked')
  const size = [];
  chks.forEach((chk, i)=>{
    size.push(chk.value);
  });
  // 추가할 객체
  const add_data = {
    item_name : document.querySelector('#itemName').value,
    price : document.querySelector('#price').value,
    brand : document.querySelector('#brand').value,
    size : size
  };
  item_list.push(add_data);

  console.log(item_list);
}
