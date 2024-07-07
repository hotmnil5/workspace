function checkAllMenu(){
  const chkAll = document.querySelector("#chk_all");
  const isCheaked = chkAll.checked;
  const chks = document.querySelectorAll(".menu");
  if(isCheaked){
    for(const chk of chks){
      chk.checked = true;
    }
  }
  else {
    for(const chk of chks){
      chk.checked = false;
    }
  }
}
function checkAllOption(){
  
} 