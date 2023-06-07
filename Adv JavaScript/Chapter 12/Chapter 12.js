// Exercise 12.1
// const output = document.getElementById("output");
// const findValue = document.getElementById("sText");
// const replaceValue = document.getElementById("rText");

// document.querySelector("button").addEventListener("click", lookUp);

// function lookUp() {
//   const s = output.textContent;
//   const rt = replaceValue.value;
//   const re = new RegExp(findValue.value, "gi");
//   if (s.match(re)) {
//     let newValue = s.replace(re, rt);
//     output.textContent = newValue;
//   }
// }

// Exercise 12.2
// const output = document.querySelector(".output");
// const emailVal = document.querySelector("input");
// const btn = document.querySelector("button");
// const emailExp = /([A-Za-z0-9._-]+@[A-Za-z0-9._-]+\.[A-Za-z0-9]+)\w+/;
// btn.addEventListener("click", (e) => {
//   const val = emailVal.value;
//   const result = emailExp.test(val);
//   let response = "";
//   if (!result) {
//     response = "Invalid Email";
//     output.style.color = "red";
//   } else {
//     response = "Valid Email";
//     output.style.color = "green";
//   }
//   emailVal.value = "";
//   output.textContent = response;
// });

// Exercise 12.3
// function showNames() {
//     let lastOne = "";
//     for (let i = 0; i < arguments.length; i++) {
//     lastOne = arguments[i];
//     }
//     return lastOne;
//     }

// console.log(showNames("Martin", "Simon", "Clark", "Jim", "Timothy"));

// Exercise 12.4
// let val = 5;
// val += adder();
// val += adder();
// val += adder();
// console.log(val);

// function adder() {
//   let counter = val;
//   for (let i = 0; i < val; i++) {
//     counter++;
//   }
//   return counter;
// }

// console.log(adder());

// Exercise 12.5
// function test(val) {
//   try {
//     if (isNaN(val)) {
//       throw "Not a number";
//     } else {
//       console.log("Got number");
//     }
//   } catch (e) {
//     console.error(e);
//   } finally {
//     console.log("Done " + val);
//   }
// }
// test("a");
// test(100);

// Exercise 12.6
// console.log(document.cookie);
// console.log(rCookie("test1"));
// console.log(rCookie("test"));

// cCookie("test1", "new Cookie", 30);
// dCookie("test2");

// function cCookie(cName, value, days) {
//   if (days) {
//     const d = new Date();
//     d.setTime(d.getTime() + days * 24 * 60 * 60 * 1000);
//     let e = "; expires=" + d.toUTCString();
//     document.cookie = cName + "=" + value + e + "; path=/";
//   }
// }

// function rCookie(cName) {
//   let cookieValue = false;
//   let arr = document.cookie.split("; ");
//   arr.forEach((str) => {
//     const cookie = str.split("=");
//     if (cookie[0] == cName) {
//       cookieValue = cookie[1];
//     }
//   });
//   return cookieValue;
// }

// function dCookie(cName) {
//   cCookie(cName, "", -1);
// }

// Exercise 12.7
// const userTask = document.querySelector(".main input");
// const addBtn = document.querySelector(".main button");
// const output = document.querySelector(".output");
// const tasks = JSON.parse(localStorage.getItem("tasklist")) || [];

// addBtn.addEventListener("click", createListItem);
// if (tasks.length > 0) {
//   tasks.forEach((task) => {
//     genItem(task.val, task.checked);
//   });
// }

// function saveTasks() {
//   localStorage.setItem("tasklist", JSON.stringify(tasks));
// }

// function buildTasks() {
//   tasks.length = 0;
//   const curList = output.querySelectorAll("li");
//   curList.forEach((el) => {
//     const tempTask = {
//       val: el.textContent,
//       checked: false,
//     };
//     if (el.classList.contains("ready")) {
//       tempTask.checked = true;
//     }
//     tasks.push(tempTask);
//   });
//   saveTasks();
// }

// function genItem(val, complete) {
//   const li = document.createElement("li");
//   const temp = document.createTextNode(val);
//   li.appendChild(temp);
//   output.append(li);
//   userTask.value = "";
//   if (complete) {
//     li.classList.add("ready");
//   }
//   li.addEventListener("click", (e) => {
//     li.classList.toggle("ready");
//     buildTasks();
//   });
//   return val;
// }

// function createListItem() {
//   const val = userTask.value;
//   if (val.length > 0) {
//     const myObj = {
//       val: genItem(val, false),
//       checked: false,
//     };
//     tasks.push(myObj);
//     saveTasks();
//   }
// }

// Exercise 12.8
// let myList = [
//   {
//     name: "Learn JavaScript",
//     status: true,
//   },
//   {
//     name: "Try JSON",
//     status: false,
//   },
// ];
// reloader();

// function reloader() {
//   myList.forEach((el) => {
//     console.log(`${el.name} = ${el.status}`);
//   });
// }

// Exercise 12.9
// let myList = [
//   {
//     name: "Learn JavaScript",
//     status: true,
//   },
//   {
//     name: "Try JSON",
//     status: false,
//   },
// ];

// const newStr = JSON.stringify(myList);
// const newObj = JSON.parse(newStr);
// newObj.forEach((el) => {
//   console.log(el);
// });