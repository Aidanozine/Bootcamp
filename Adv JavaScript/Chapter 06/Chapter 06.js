// function addTwoNumbers(x = 2, y = 3) {
//     console.log(x + y);
//     }
// addTwoNumbers();
// addTwoNumbers(6, 6);
// addTwoNumbers(10);

// let addTwoNumbers = (x, y) => console.log(x + y);
// addTwoNumbers(5, 3);

// const arr = ["squirrel", "alpaca", "buddy"];
// arr.forEach(e => console.log(e));

// function someFunction(param1, param2) {
//     console.log(param1, param2);
//     }
//     someFunction("hi", "there!", "How are you?");

//     function someFunction(param1, ...param2) {
//         console.log(param1, param2);
//         }
//         someFunction("hi", "there!", "How are you?");

// let result = addTwoNumbers(4, 5);
// console.log(result);

// function addTwoNumbers(x, y) {
//     return x + y;
//     }

// let result = addTwoNumbers(4, 5);
// console.log(result);

// let resultsArr = [];
// for(let i = 0; i < 10; i ++){
// let result = addTwoNumbers(i, 2*i);
// resultsArr.push(result);
// }
// console.log(resultsArr);

// let addTwoNumbers = (x, y) => x + y;

// let result = addTwoNumbers(12, 15);
// console.log(result);

// let addTwoNumbers = (x, y) => {
//     console.log("Adding...");
//     return x + y;
//     }

//     let result = addTwoNumbers(12, 15);
//     console.log(result);


// function testAvailability(x) {
//     console.log("Available here:", x);
//         }

// testAvailability("Hi!");
//     console.log("Not available here:", x);

// function testAvailability() {
//     let y = "Local variable!";
//     console.log("Available here:", y);
//     }
//     testAvailability();
//     console.log("Not available here:", y);

// function testAvailability() {
//     let y = "I'll return";
//     console.log("Available here:", y);
//     return y;
//     }
//     let z = testAvailability();
//     console.log("Outside the function:", z);
//     console.log("Not available here:", y);


// ----------------------------------------var VS let--------------------------------------------


// function doingStuff() {
//     if (true) {
//     var x = "local";
//     }
//     console.log(x);
//     }
//     doingStuff();

// function doingStuff() {
//     if (true) {
//     let x = "local";
//     }
//        console.log(x);
//     }
//     doingStuff();

// function doingStuff() {
//     if (true) {
//     let x = "local";
//     console.log(x);
//     }
    
//     }
//     doingStuff();

// function doingStuff() {
//      if (true) {
//      console.log(x);
//      let x = "local";
//      }
    
//      }
//      doingStuff();

// function doingStuff() {
//     if (true) {
//     console.log(x);
//     var x = "local";
//     }
   
//     }
//     doingStuff();

// function doingStuff() {
//     let x = "local"; //(Ideal location for "let")
//     if (true) {
//     console.log(x);
//     }
   
//     }
//     doingStuff();

// function doingStuff() {
//     var x = "local";
//     if (true) {
//     console.log(x);
//     }
   
//     }
//     doingStuff();

// let x = "local";
// function doingStuff() {
   
//     if (true) {
//     console.log(x);
//     }
   
//     }
//     doingStuff();

// var x = "local";
// function doingStuff() {
   
//     if (true) {
//     console.log(x);
//     }
   
//     }
//     doingStuff();

// function doingStuff() {
//     if (true) {
//         const X = "local";
//     }
//     console.log(X);
//     }
//     doingStuff(); 

// let globalVar = "Accessible everywhere!";
// console.log("Outside function:", globalVar);
// function creatingNewScope(x) {
// console.log("Access to global vars inside function." , globalVar);
// }
// creatingNewScope("some parameter");
// console.log("Still available:", globalVar);

// var globalVar = "Accessible everywhere!";
// console.log("Outside function:", globalVar);
// function creatingNewScope(x) {
// console.log("Access to global vars inside function." , globalVar);
// }
// creatingNewScope("some parameter");
// console.log("Still available:", globalVar);

// let x = "global";
// function doingStuff() {
// let x = "local";
// console.log(x);
// }
// doingStuff();
// console.log(x);

// let x = "global";  //Test
// function doingStuff() {
// console.log(x);
// }
// let x = "local";
// doingStuff();
// console.log(x);

// function confuseReader() {
//     x = "Guess my scope...";
//     console.log("Inside the function:", x);
//     }
//     confuseReader();
//     console.log("Outside of function:", x);

// (function () {
//     console.log("IIFE!");
//     })();

// (()=>{
//     console.log("run right away");
//     })();

// let x = 1000;

// (function () {
//     let x = 2000;
//     console.log(x);
//     })();

// let result = (()=>{
//     let x = 3000;
//     return x;
//     })();

// console.log("x is " + x);
// console.log("result is " + result);

// let x = 1000;

// (function () {
//     let x = 2000;
//     console.log(x);
//     })();

// let result = ((y)=>{
//     let x = 3000;
//     return y;
//     })(5);

// console.log("x is " + x);
// console.log("result is " + result);

// let x = 1000;

// (function () {
//     let x = 2000;
//     console.log(x);
//     })();

// let result1 = (()=>{
//     let x = 3000;
//     return x;
//     })();

// let result2 = ((y)=>{
//     let x = 3000;
//     return y;
//     })();

// console.log("x is " + x);
// console.log("result1 is " + result1);
// console.log("result2 is " + result2);

// let x = "1000";

// (function () {
//     let x = "2000";
//     console.log(x);
//     })();

// let result1 = (()=>{
//     let x = "3000";
//     return x;
//     })();

// let result2 = ((y)=>{
//     let x = "3000";
//     return y * 2;
//     })("4000");

// console.log("x is " + x);
// console.log("result1 is " + result1);
// console.log("result2 is " + result2);

// function getRecursive(nr) {
//     console.log(nr);
//     getRecursive(--nr);
//     }
//     getRecursive(3);

// function getRecursive(nr) {
//     console.log(nr);
//     if (nr > 0) {
//     getRecursive(--nr);
//     }
//     }
//     getRecursive(3);

// function getRecursive(nr) {
//     alert(nr);
//     if (nr > 0) {
//     getRecursive(--nr);
//     }
//     }
//     getRecursive(3);

// function logRecursive(nr) {
//     console.log("Started function:", nr);
//     if (nr > 0) {
//     logRecursive(nr - 1);
//     } else {
//     console.log("done with recursion");
//     }
//     console.log("Ended function:", nr);
//     }
//     logRecursive(3);

// function doOuterFunctionStuff(nr) {
//     console.log("Outer function");
//     doInnerFunctionStuff(nr);
//     function doInnerFunctionStuff(x) {
//     console.log(x + 7);
//     console.log("I can access outer variables:", nr);
// }
// }
// doOuterFunctionStuff(2);

// function doOuterFunctionStuff(nr) {
//     doInnerFunctionStuff(nr);
//     function doInnerFunctionStuff(x) {
//     let z = 10;
//     }
//     console.log("Not accessible:", z);
//     }
//     doOuterFunctionStuff(5);

// function doOuterFunctionStuff(nr) {
//     doInnerFunctionStuff(nr);
//     function doInnerFunctionStuff(x) {
//     let z = 10;
//     console.log("Not accessible:", z);
//     }
//     }
//     doOuterFunctionStuff(5);

// (function (nr) {  //Self-invoked version of the one above
//     (function (x) {
//     let z = 10;
//     console.log(z)
//     })(nr);  
// })(5);

// let functionVariable = function () {
//     console.log("Not so secret though.");
//     };

// function doFlexibleStuff(executeStuff) {
//     executeStuff();
//     console.log("Inside doFlexibleStuffFunction.");
//     }

// doFlexibleStuff(functionVariable);

// doFlexibleStuff(functionVariable); //Alternative to one above

// function functionVariable() {
//     console.log("Not so secret though.");
//     };

// function doFlexibleStuff(executeStuff) {
//     executeStuff();
//     console.log("Inside doFlexibleStuffFunction.");
//     }

// let youGotThis = function () {
//     console.log("You're doing really well, keep coding!");
//     };
//     setTimeout(youGotThis, 1000);

// let youGotThis = function () {
//     console.log("You're doing really well, keep coding!");
//     };
//     setTimeout(youGotThis, 10);

//     setInterval(youGotThis, 1000);

// let val = 10;
// function tester(val){
// val += 10;
// if(val < 100){
// return tester(val);
// }
// return val;
// }
// tester(val);
// console.log(val);

// let val = 10;
// function tester(val){
// val += 10;
// if(val < 100){
// return tester(val);
// }
// return val;
// }
// val = tester(val);
// console.log(val);

// (function () {
//     console.log("Welcome");
//     })();
//     (function () {
//     let firstName = "Laurence";
//     })();
//     let result = (function () {
//     let firstName = "Laurence";
//     return firstName;
//     })();
//     console.log(result);
//     (function (firstName) {
//     console.log("My Name is " + firstName);
//     })("Laurence");

// let test2 = (num) => num + 5;
// console.log(test2(14));

// let test2 = (num) => {
//     num + 5;
//     return num + 5;
// }
// console.log(test2(14));

// var addFive1 = function addFive1(num) {
//     return num + 2;
//     };
//     let addFive2 = (num) => num + 2;
//     console.log(addFive1(14));

// var addFive1 = function addFive1(num) {
//     return num + 2;
//     };
//     //let addFive2 = (num) => num + 2;
//     console.log(addFive1(14));

//Exercise 6.1
// function add2Variables() {
//     let funcResult = x + y;
//     console.log(funcResult);
// }

// x = 12;
// y = 13;
// add2Variables();

//Exercise 6.2
// const adj = ["great", "okay", "serious", "happy", "terrible"];
// function myFun() {
//   const question = prompt("What is your name?");
//   const nameAdj = Math.floor(Math.random() * adj.length);
//   console.log(adj[nameAdj] + " " + question);
// }
// myFun();

//Exercise 6.3
// const val1 = 10;
// const val2 = 5;
// let operat = "-";
// function cal(a, b, op) {
// if (op == "-") {
// console.log(a — b);
// } else {
// console.log(a + b);
// }
// }
// cal(val1, val2, operat);

//Exercise 6.4
// const theArr = [];
// for (let x = 0; x < 10; x++) {
//   let val1 = 5 * x;
//   let val2 = x * x;
//   let res = cal(val1, val2, "+");
//   theArr.push(res);
// }
// console.log(theArr);
// function cal(a, b, op) {
//   if (op == "-") {
//     return a - b;
//   } else {
//     return a + b;
//   }
// }

//Exercise 6.5
// let stringVar = "1000";

// (function () {
//     let stringVar = "2000";
//     console.log(stringVar);
// })();
// let result = (function () {
//     let stringVar = "Aidan";
//     return stringVar;
//     })();
//     console.log(result);
//     console.log(stringVar);

// (function (stringVar) {
//     console.log(`My name is ${stringVar}`);
//     })("Aidan");

//Exercise 6.6
// function calcFactorial(nr) {
//     console.log(nr);
//     if (nr === 0) {
//     return 1;
//     }
//     else {
//     return nr * calcFactorial(--nr);
//     }
//     }
// console.log(calcFactorial(4));

//Exercise 6.7
// let start = 10;
// function loop1(val) {
// console.log(val);
// if (val < 1) {
// return;
// }
// return loop1(val - 1);
// }
// loop1(start);
// function loop2(val) {
// console.log(val);
// if (val > 0) {
//     val--;
// return loop2(val);
// }
// return;
// }
// loop2(start);

//Exercise 6.8
// const test = function(val){
//     console.log(val);
//     }
//     test('hello 1');
//     function test1(val){
//     console.log(val);
//     }
//     test1("hello 2");