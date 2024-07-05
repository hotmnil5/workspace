function setTable(){
  
    const row = document.querySelector("#rowInput").value;
    const column = document.querySelector("#colInput").value;
    const tbDiv = document.querySelector(".table-div");

    let str ='';
    str+="<table>";
    for(var i=0; i<row; i++){
      str+="<tr>";
      for(var j=0; j<column; j++){
          
          str+=`<td>${i+1}행 ${j+1}열</td>`;
      }
      str+="</tr>";
    }
    str+="</table>";

    tbDiv.innerHTML='';
    tbDiv.insertAdjacentHTML('beforeend', str);

    // tbDiv.innerHTML=str;

}