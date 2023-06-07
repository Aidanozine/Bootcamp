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