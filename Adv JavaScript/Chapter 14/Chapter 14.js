// EXERCISE 14.1
// const message = document.getElementById("message");
// const output = document.querySelector(".output");
// const myInput = document.querySelector("input");

// myInput.addEventListener("change", uploadAndReadFile);
// function uploadAndReadFile(e) {
//   const files = e.target.files;
//   for (let i = 0; i < files.length; i++) {
//     const file = files[i];
//     const img = document.createElement("img");
//     img.classList.add("thumb");
//     img.file = file;
//     output.appendChild(img);
//     const reader = new FileReader();
//     reader.onload = (function (myImg) {
//       return function (e) {
//         myImg.src = e.target.result;
//       };
//     })(img);
//     reader.readAsDataURL(file);
//   }
// }

// EXERCISE 14.2
// const canvas = document.querySelector('#canvas');
// const ctx = canvas.setContext("2d");

// ctx.fillStyle = "red";
// ctx.fillRect(100, 100, 500, 300);
// ctx.strokeRect(90, 90, 520, 320);
// ctx.clearRect(150, 150, 400, 200);

// EXERCISE 14.3
// const canvas = document.querySelector("#canvas");
// const ctx = canvas.getContext("2d");

// ctx.beginPath();
// ctx.fillStyle = "red";
// ctx.arc(300, 130, 100, 0, Math.PI * 2);
// ctx.fill();
// ctx.beginPath();
// ctx.fillStyle = "black";
// ctx.arc(250, 120, 20, 0, Math.PI * 2);
// ctx.moveTo(370, 120);
// ctx.arc(350, 120, 20, 0, Math.PI * 2);
// ctx.moveTo(240, 160);
// ctx.arc(300, 160, 60, 0, Math.PI);
// ctx.fill();
// ctx.moveTo(300, 130);
// ctx.lineTo(300, 150);
// ctx.stroke();
// ctx.beginPath();
// ctx.moveTo(300, 230);
// ctx.lineTo(300, 270);
// ctx.lineTo(400, 270);
// ctx.lineTo(200, 270);
// ctx.lineTo(300, 270);
// ctx.lineTo(300, 350);
// ctx.lineTo(400, 500);
// ctx.moveTo(300, 350);
// ctx.lineTo(200, 500);
// ctx.stroke();
// ctx.beginPath();
// ctx.fillStyle = "blue";
// ctx.moveTo(200, 50);
// ctx.lineTo(400, 50);
// ctx.lineTo(300, 20);
// ctx.lineTo(200, 50);
// ctx.fill();
// ctx.stroke();

// Exercise 14.4
// const canvas = document.querySelector("#canvas");
// const ctx = canvas.getContext("2d");
// const str = "Hello World";
// ctx.font = "italic 50px Comic";
// ctx.fillStyle = "blue";
// ctx.textAlign = 'left';
// ctx.fillText(str, 100, 100);
// ctx.font = "bold 20px Arial";
// ctx.fillStyle = "red";
// for (let x = 1; x < 11; x++) {
//   ctx.fillText("counter:" + x, 50, 200 + 40 * x);
// }

// Exercise 14.5
// const canvas = document.querySelector("#canvas");
// const ctx = canvas.getContext("2d");
// const imgLoader = document.querySelector("#imgLoader");
// imgLoader.addEventListener("change", handleUpload);

// function handleUpload(e) {
//   console.log(e);
//   const reader = new FileReader();
//   reader.onload = function (e) {
//     console.log(e);
//     const img = new Image();
//     img.onload = function () {
//       canvas.width = img.width / 2;
//       canvas.height = img.height / 2;
//       ctx.drawImage(img, 0, 0, img.width / 2, img.height / 2);
//     };
//     img.src = e.target.result;
//   };
//   reader.readAsDataURL(e.target.files[0]);
// }

// Exercise 14.6
// const canvas = document.getElementById("canvas");
// const ctx = canvas.getContext("2d");
// const ballSize = 10;
// let x = canvas.width / 2;
// let y = canvas.height / 2;
// let dirX = 1;
// let dirY = 1;

// function drawBall() {
//   ctx.beginPath();
//   ctx.arc(x, y, ballSize, 0, Math.PI * 2);
//   ctx.fillStyle = "red";
//   ctx.fill();
//   ctx.closePath();
// }

// function move() {
//   ctx.clearRect(0, 0, canvas.width, canvas.height);
//   drawBall();
//   if (x > canvas.width - ballSize || x < ballSize) {
//     dirX *= -1;
//   }
//   if (y > canvas.height - ballSize || y < ballSize) {
//     dirY *= -1;
//   }
//   x += dirX;
//   y += dirY;
// }

// setInterval(move, 10);

// Exercise 14.7
// window.onload = init;
// const canvas = document.getElementById("canvas");
// const ctx = canvas.getContext("2d");
// canvas.style.border = "1px solid black";
// const penColor = document.querySelector("#penColor");
// const penWidth = document.querySelector("#penWidth");

// document.querySelector(".clear").addEventListener("click", clearImg);

// canvas.width = 700;
// canvas.height = 700;

// let pos = {
//   x: 0,
//   y: 0,
// };

// function init() {
//   canvas.addEventListener("mousemove", draw);
//   canvas.addEventListener("mousemove", setPosition);
//   canvas.addEventListener("mouseenter", setPosition);
// }

// function draw(e) {
//   if (e.buttons !== 1) return;
//   ctx.beginPath();
//   ctx.moveTo(pos.x, pos.y);
//   setPosition(e);
//   ctx.lineTo(pos.x, pos.y);
//   ctx.strokeStyle = penColor.value;
//   ctx.lineWidth = penWidth.value;
//   ctx.lineCap = "round";
//   ctx.stroke();
// }

// function setPosition(e) {
//   pos.x = e.pageX;
//   pos.y = e.pageY;
// }

// function clearImg() {
//   const temp = confirm("Clear confirm?");
//   if (temp) {
//     ctx.clearRect(0, 0, canvas.offsetWidth);
//   }
// }

//Chapter Project
// Matrix Effect
const canvas = document.createElement("canvas");
const ctx = canvas.getContext("2d");
canvas.setAttribute("width", "500");
canvas.setAttribute("height", "300");
document.body.prepend(canvas);
const colVal = [];
for (let x = 0; x < 50; x++) {
  colVal.push(0);
}

function matrix() {
  ctx.fillStyle = "rgba(0,0,0,.05)";
  ctx.fillRect(0, 0, canvas.width, canvas.height);
  ctx.fillStyle = "green";
  colVal.map((posY, index) => {
    let output = Math.random() < 0.5 ? 0 : 1;
    let posX = (index * 10) + 10;
    ctx.fillText(output, posX, posY);
    if (posY > 100 + Math.random() * 300) {
      colVal[index] = 0;
    } else {
      colVal[index] = posY + 10;
    }
  });
}
setInterval(matrix, 50);


//Countdown Clock
// const endDate = document.querySelector("input[name='endDate']");
// const clock = document.querySelector(".clock");
// let timeInterval;
// let timeStop = true;
// const savedValue = localStorage.getItem("countdown") || false;

// if (savedValue) {
//   startClock(savedValue);
//   let inputValue = new Date(savedValue);
//   endDate.valueAsDate = inputValue;
// }

// endDate.addEventListener("change", function (e) {
//   e.preventDefault();
//   clearInterval(timeInterval);
//   const temp = new Date(endDate.value);
//   localStorage.setItem("countdown", temp);
//   startClock(temp);
//   timeStop = true;
// });

// function startClock(d) {
//   function updateCounter() {
//     let tl = timeLeft(d);
//     if (tl.total <= 0) {
//       timeStop = false;
//     }
//     for (let pro in tl) {
//       let el = clock.querySelector("." + pro);
//       if (el) {
//         el.innerHTML = tl[pro];
//       }
//     }
//   }
//   updateCounter();
//   if (timeStop) {
//     timeInterval = setInterval(updateCounter, 1000);
//   } else {
//     clearInterval(timeInterval);
//   }
// }

// function timeLeft(d) {
//   let currentDate = new Date();
//   let t = Date.parse(d) - Date.parse(currentDate);
//   let seconds = Math.floor((t / 1000) % 60);
//   let minutes = Math.floor((t / 1000 / 60) % 60);
//   let hours = Math.floor((t / (1000 * 60 * 60)) % 24);
//   let days = Math.floor(t / (1000 * 60 * 60 * 24));
//   return {
//     total: t,
//     days: days,
//     hours: hours,
//     minutes: minutes,
//     seconds: seconds,
//   };
// }


//Online Paint App
// const canvas = document.querySelector("#canvas");
// const ctx = canvas.getContext("2d");
// const penColor = document.querySelector("#penColor");
// const penWidth = document.querySelector("#penWidth");
// const btnSave = document.querySelector(".save");
// const btnClear = document.querySelector(".clear");
// const output = document.querySelector(".output");
// const mLoc = {
//   draw: false,
//   x: 0,
//   y: 0,
//   lastX: 0,
//   lastY: 0,
// };

// canvas.style.border = "1px solid black";
// btnSave.addEventListener("click", saveImg);
// btnClear.addEventListener("click", clearCanvas);

// canvas.addEventListener("mousemove", (e) => {
//   mLoc.lastX = mLoc.x;
//   mLoc.lastY = mLoc.y;
//   //console.log(e);
//   mLoc.x = e.clientX;
//   mLoc.y = e.clientY;
//   draw();
// });

// canvas.addEventListener("mousedown", (e) => {
//   mLoc.draw = true;
// });

// canvas.addEventListener("mouseup", (e) => {
//   mLoc.draw = false;
// });

// canvas.addEventListener("mouseout", (e) => {
//   mLoc.draw = false;
// });

// function saveImg() {
//   const dataURL = canvas.toDataURL();
//   console.log(dataURL);
//   const img = document.createElement("img");
//   output.prepend(img);
//   img.setAttribute("src", dataURL);
//   const link = document.createElement("a");
//   output.append(link);
//   let fileName = Math.random().toString(16).substr(-8) + ".png";
//   link.setAttribute("download", fileName);
//   link.href = dataURL;
//   link.click();
//   output.removeChild(link);
// }

// function clearCanvas() {
//   let temp = confirm("clear canvas?");
//   if (temp) {
//     ctx.clearRect(0, 0, canvas.width, canvas.height);
//   }
// }

// function draw() {
//   if (mLoc.draw) {
//     ctx.beginPath();
//     ctx.moveTo(mLoc.lastX, mLoc.lastY);
//     ctx.lineTo(mLoc.x, mLoc.y);
//     ctx.strokeStyle = penColor.value;
//     ctx.lineWidth = penWidth.value;
//     ctx.stroke();
//     ctx.closePath();
//   }
// }