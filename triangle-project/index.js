submit();
erase();
function submit(){
  const submitElem = document.querySelector(".js-submit-button");
  submitElem.addEventListener('click', ()=>{
    const typeOfTriangle = document.querySelector('input[name="type-of-triangle"]:checked');
    if(!typeOfTriangle)
      document.querySelector(".js-result").innerHTML = `Please select the type of your triangle.`;
    let fillupChar = document.querySelector(".js-fillup-char").value;
    if(!fillupChar) fillupChar = "*";
    let negativeSpaceChar = document.querySelector(".js-negative-space-char").value;
    if(!negativeSpaceChar) negativeSpaceChar = '&nbsp;';
    generateTriangle(fillupChar, negativeSpaceChar, typeOfTriangle.value);
  });
}

function generateTriangle(f, n, type) {
  let elem = document.querySelector(".js-result");
  let triangle = ``;
  const H = 5;
  if(type === 'right-angle'){
    for(let i = 0; i < 5; i++) {
      for(let j = 0; j < i; j++) {
        triangle += `${f}${n}`;
      }
      triangle += `<br>`;
    }
  } else if(type === 'equilateral') {
    for(let i = 0; i <= H; i++) {
      let border = false;
      for (let j = 0; j <= H + i; j++) {
        if (j === H - i) {
          border = true;
        }
        if (border) {
          triangle += `${f}${n}`;
          j++;
        } else {
          triangle += n;
        }
      }
      triangle += '<br>';
    }
  }
  elem.innerHTML = triangle;
  console.log(triangle);
}

function erase(){
  document.querySelector(".js-erase-button")
    .addEventListener('click', ()=>{
      document.querySelector(".js-result")
        .innerHTML = '';
    });
}