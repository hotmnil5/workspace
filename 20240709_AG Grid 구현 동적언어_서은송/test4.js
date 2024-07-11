function checkAllMenu(){
  const chkAll = document.querySelector('#chk_all');
  const isChecked = chkAll.checked;
  const chks = document.querySelectorAll('input');

  if(isChecked){
    for(const chk of chks){
      chk.checked = true;
    }
  }
  else{
    for(const chk of chks){
      chk.checked = false;
    }
  }
  
}
function checkAllOption(inputTag){
  const isChecked = inputTag.checked;
  const chks = inputTag.nextElementSibling.querySelectorAll('input');
  if(isChecked){
    for(const chk of chks){
      chk.checked = true;
    }
  }
  else{
    for(const chk of chks){
      chk.checked = false;
    }
  }
}
