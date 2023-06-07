// let groups = [
//     ["Martin", "Daniel", "Keith"],
//     ["Margot", "Marina", "Ali"],
//     ["Helen", "Jonah", "Sambikos"],
//     ];

//     for (let i = 0; i < groups.length; i++) {
//         let matches = 0;
//         for (let j = 0; j < groups[i].length; j++) {
//         if(groups[i][j].startsWith("M")){
//         matches++;
//         } else {
//         continue;
//         }
//         if (matches === 2){
//         console.log("Found a group with two names starting with an M:");
//         console.log(groups[i]);
//         break;
//         }
//         }
//         }
// /*---------------------------------------------------*/
//         outer:
//         for (let group of groups) {
//             inner:
//             for (let member of group) {
//              if (member.startsWith("M")) {
//                  console.log("Found one starting with M:", member);
//                  break outer;
//         }
//         }
//         }
//         //Found one starting with M: Martin


// for (let i = Math.floor(Math.random()*10); i < 10; i++) {
// let guessingArray = [i];
// console.log(i);
// }

//Exercise 5.1
// const max = 5;
// const ranNumber = Math.floor(Math.random() * max) + 1;
// //console.log(ranNumber);
// let correct = false;
// while (!correct) {
// let guess = prompt("Guess a Number 1 - " + max);
// guess = Number(guess);
// if (guess === ranNumber) {
//     correct = true;
// console.log("You got it " + ranNumber);
// } else if (guess > ranNumber) {
// console.log("Too high");
// } else {
// console.log("Too Low");
// }
// }

//--------------------MINE
// let startArray = Math.floor(Math.random()*) + 1;
// pracArray = [];
// let playerInput = prompt("Give a number between 1 and 5");
// let guess = (+playerInput);
// contained = false;

// while (pracArray.length < 5) {
//     startArray++;
//     guess++;
//     pracArray.push(startArray);
//     console.log(pracArray);

//     if (startArray > guess) {
//         console.log(guess);
//         console.log("Contained!");
//         console.log(contained);
//     } else if (startArray <= guess) {
//         console.log(guess);
//         console.log("Contained!");
//     }
// }

//Exercise 5.2
// let counter = 0;
// let step = 5;
// do {
// console.log(counter);
// counter += step;
// }
// while (counter <= 100);

//Exercise 5.3
//---------------------------------------first attempt
// let myWork = [];
// // console.log(myWork);

// let available = [true, false];

// for (let i = 1; i <= 10; i++) {
//     // myWork.push("lesson ".concat(i));
//     console.log("Lesson ".concat(myWork.push(i)));
//     // console.log(myWork);
//     for (let j = 0; j < available.length; j++) {
//         console.log(j, available[j]);
//     }
// }

//---------------------------------------failed attempt
// let myWork = [];
// // console.log(myWork);

// let available = [true, false];

// for (let i = 0; i <= 10; i++) {
//     myWork.push([i++]);
//     console.log("Lesson ".concat(myWork[i]));
// }

// for (let j = 0; j < 2; j++) {
//     available.push([j++]);
//     console.log("status:".concat(available[j]));
// }
//----------------------------------------

//-----------------------------------second attempt
// const myWork = [];
// // console.log(myWork);

// const available = [true, false];

// for (let i = 1; i <= 10; i++) {
//     // myWork.push("lesson ".concat(i));
//     console.log("Lesson ".concat(myWork.push(i)));
//     // console.log(myWork);
//     for (let j = 0; j < available.length; j++) {
//         //  available.push("Status: ".concat(available.push(j)));
//          console.log(available);
//     }
// }

//--------------------------------ALTERNATIVE
// const myWork = [];
// for (let x = 1; x < 10; x++) {
// let stat = x % 2 ? true : false;
// let temp = {
// name: `Lesson ${x}`, status: stat
// };
// myWork.push(temp);
// }
// console.log(myWork);

//Exercise 5.4
// const myTable = [];
// const rows = 4;
// const cols = 7;
// let counter = 0;
// for (let y = 0; y < rows; y++) {
//   let tempTable = [];
//   for (let x = 0; x < cols; x++) {
//     counter++;
//     [438];
//     tempTable.push(counter);
//   }
//   myTable.push(tempTable);
// }
// console.table(myTable);

//Exercise 5.5
// const grid = [];
// const cells = 64;
// let counter = 0;
// let row;
// for (let x = 0; x < cells + 1; x++) {
//   if (counter % 8 == 0) {
//     if (row != undefined) {
//       grid.push(row);
//     }
//     row = [];
//   }
//   counter++;
//   let temp = counter;
//   row.push(temp);
// }
// console.table(grid);

//Exercise 5.6
// const myArray = [];
// for (let x = 0; x < 10; x++) {
//   myArray.push(x + 1);
// }
// console.log(myArray);
// for (let i = 0; i < myArray.length; i++) {
//   console.log(myArray[i]);
// }
// for (let val of myArray) {
//   console.log(val);
// }

//Exercise 5.7
// const obj = {
//   a: 1,
//   b: 2,
//   c: 3,
// };
// for (let prop in obj) {
//   console.log(prop, obj[prop]);
// }
// const arr = ["a", "b", "c"];
// for (let w = 0; w < arr.length; w++) {
//   console.log(w, arr[w]);
// }
// for (el in arr) {
//   console.log(el, arr[el]);
// }  

//Exercise 5.8
// let output = "";
// let skipThis = 7;
// for (let i = 0; i < 10; i++) {
//   if (i === skipThis) {
//     continue;
//   }
//   output += i;
// }
// console.log(output);

//----------------------Alternate
// let output = "";
// let skipThis = 7;
// for (let i = 0; i < 10; i++) {
//   if (i === skipThis) {
//     break;
//   }
//   output += i;
// }
// console.log(output);