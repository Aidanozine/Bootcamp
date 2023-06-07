// console.log(document.getElementById("unique").onclick = function() { magic(); });

//Exercise 11.1
// let darkMode = false;
// window.onclick = () => {
// console.log(darkMode);
// if (!darkMode) {
// document.body.style.backgroundColor = "black";
// document.body.style.color = "white";
// darkMode = true;
// } else {
// document.body.style.backgroundColor = "white";
// document.body.style.color = "black";
// darkMode = false;
// }
// }

//Exercise 11.2
// const divs = document.querySelectorAll("div");
// divs.forEach((el) => {
//   el.addEventListener("click", () => {
//     document.body.style.backgroundColor = el.textContent;
//   });
// });

//Exercise 11.3
// document.addEventListener("DOMContentLoaded", (e) => {
//   message("Document ready", e);
// });
// window.onload = (e) => {
//   message("Window ready", e);
// };
// function message(val, event) {
//   console.log(event);
//   console.log(val);
// }

// Exercise 11.4
// const output = document.querySelector(".output");

// output.textContent = "hello world";

// output.style.height = "200px";

// output.style.width = "400px";

// output.style.backgroundColor = "red";

// output.addEventListener("mousedown", function (e) {
//   message("green", e);
// });

// output.addEventListener("mouseover", function (e) {
//   message("red", e);
// });

// output.addEventListener("mouseout", function (e) {
//   message("yellow", e);
// });

// output.addEventListener("mouseup", function (e) {
//   message("blue", e);
// });

// function message(elColor, event) {
//   console.log(event.type);
//   output.style.backgroundColor = elColor;
// }

// Exercise 11.5
// const myInput = document.querySelector("input[name='message']");
// const output = document.querySelector(".output");
// const btn1 = document.querySelector(".btn1");
// const btn2 = document.querySelector(".btn2");
// const btn3 = document.querySelector(".btn3");
// const log = [];

// btn1.addEventListener("click", tracker);
// btn2.addEventListener("click", tracker);
// btn3.addEventListener("click", (e) => {
//   console.log(log);
// });

// function tracker(e) {
//   output.textContent = myInput.value;
//   const ev = e.target;
//   console.dir(ev);
//   const temp = {
//     message: myInput.value,
//     type: ev.type,
//     class: ev.className,
//     tag: ev.tagName,
//   };
//   log.push(temp);
//   myInput.value = "";
// }

// Exercise 11.6
// const main = document.querySelector(".container");
// const boxes = document.querySelectorAll(".box");
// main.addEventListener(
//   "click",
//   (e) => {
//     console.log("4");
//   },
//   false
// );
// main.addEventListener(
//   "click",
//   (e) => {
//     console.log("1");
//   },
//   true
// );
// boxes.forEach((ele) => {
//   ele.addEventListener(
//     "click",
//     (e) => {
//       console.log("3");
//       console.log(e.target.textContent);
//     },
//     false
//   );
//   ele.addEventListener(
//     "click",
//     (e) => {
//       console.log("2");
//       console.log(e.target.textContent);
//     },
//     true
//   );
// });

// Exercise 11.7
// const output = document.querySelector(".output1");
// const in1 = document.querySelector("input[name='first']");
// const in2 = document.querySelector("input[name='last']");

// in1.addEventListener("change", (e) => {
//   console.log("change");
//   updater(in1.value);
// });

// in1.addEventListener("blur", (e) => {
//   console.log("blur");
// });

// in1.addEventListener("focus", (e) => {
//   console.log("focus");
// });

// in2.addEventListener("change", (e) => {
//   console.log("change");
//   updater(in2.value);
// });

// in2.addEventListener("blur", (e) => {
//   console.log("blur");
// });

// in2.addEventListener("focus", (e) => {
//   console.log("focus");
// });

// function updater(str) {
//   output.textContent = str;
// }

// Exercise 11.8
// const eles = document.querySelectorAll("input");
// const output = document.querySelector(".output");

// eles.forEach((el) => {
//   el.addEventListener("keydown", (e) => {
//     if (!isNaN(e.key)) {
//       output.textContent += e.key;
//     }
//   });
  
//   el.addEventListener("keyup", (e) => {
//     console.log(e.key);
//   });
  
//   el.addEventListener("paste", (e) => {
//     console.log("pasted");
//   });
// });

// Exercise 11.9
// const dragbox = document.querySelector("#dragme");
// dragbox.addEventListener("dragstart", (e) => {
//     dragbox.style.opacity = 0.5;
// });

// dragbox.addEventListener("dragend", (e) => {
//     dragbox.style.opacity = "";
// });

// const dropOffBoxes = document.querySelectorAll(".box");

// dropOffBoxes.forEach(box => {
//     box.addEventListener("dragenter", (e) => {
//         e.target.classList.add('red');
//     });
//     box.addEventListener("dragover", (e) => {
//         e.preventDefault();
//     });
//     box.addEventListener("dragleave", (e) => {
//         e.target.classList.remove('red');
//     });
//     box.addEventListener("drop", (e) => {
//         e.preventDefault();
//         console.log("dropped");
//         e.target.appendChild(dragbox)
//     });
// });

// function dragstart(e) {
//     console.log("Started");
// }

// Exercise 11.10
// const form = document.querySelector("form");
// const email = document.querySelector("#email");

// form.addEventListener("submit", (e) => {
//   let error = false;
//   if (checker(form.first.value)) {
//     console.log("First Name needed");
//     error = true;
//   }
//   if (checker(form.last.value)) {
//     console.log("Last Name needed");
//     error = true;
//   }
//   if (form.age.value < 19) {
//     console.log("You must be 19 or over");
//     error = true;
//   }
//   if (error) {
//     e.preventDefault();
//     console.log("please review the form");
//   }
// });
// function checker(val) {
//   console.log(val.length);
//   if (val.length < 6) {
//     return true;
//   }
//   return false;
// }

// Exercise 11.11
// const main = document.querySelector("#block");

// let mover = { speed: 10, dir: 1, pos: 0 };
// main.addEventListener("click", moveBlock);

// function moveBlock() {
//   let x = 30;
//   setInterval(function () {
//     if (x < 1) {
//       clearInterval();
//     } else {
//       if (mover.pos > 800 || mover.pos < 0) {
//         mover.dir *= -1;
//       }
//       x--;
//       mover.pos += x * mover.dir;
//       main.style.left = mover.pos + "px";
//       console.log(mover.pos);
//     }
//   }, 2);
// }