function setAvgAge(){
  let sum = 0;
  const resTd = document.querySelector('#resultTd')
  const td_list = document.querySelectorAll('.ageTd');

  for(let i = 0; i < td_list.length; i++){
    sum = sum + Number(td_list[i].textContent);   
  }
  console.log(sum);
  let avgAge = sum / td_list.length;
  resTd.innerHTML=avgAge;
  
}