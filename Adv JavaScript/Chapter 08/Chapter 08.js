// let s = "Hello";
// console.log(
// s.concat(" there!")
// .toUpperCase()
// .replace("THERE", "you")
// .concat(" You're amazing!")
// );

// let x = 7;
// console.log(Number.isNaN(x));

// let x = 7;  ///Alternat to one above
// console.log(isNaN(x));

// let uri = "https://www.example.com/submit?name=maaike van putten";
// let encoded_uri = encodeURI(uri);
// console.log("Encoded:", encoded_uri);
// let decoded_uri = decodeURI(encoded_uri);
// console.log("Decoded:", decoded_uri);

// let uri = "https://www.example.com/submit?name=maaike van putten";
// let encoded_uri = encodeURIComponent(uri);
// console.log("Encoded:", encoded_uri);
// let decoded_uri = decodeURIComponent(encoded_uri);
// console.log("Decoded:", decoded_uri);

// let str_binary = "0b101";
// let int_binary = parseInt(str_binary);
// console.log("Type of", int_binary, "is", typeof int_binary);

// let str_float = "7.6";
// let int_float = parseInt(str_float);
// console.log("Type of", int_float, "is", typeof int_float);

// let str_float = "7.6";
// let float_float = parseFloat(str_float);
// console.log("Type of", float_float, "is", typeof float_float);

// let str_binary = "0b101";
// let float_binary = parseFloat(str_binary);
// console.log("Type of", float_binary, "is", typeof float_binary);

// let str_nan = "hello!";
// let float_nan = parseFloat(str_nan);
// console.log("Type of", float_nan, "is", typeof float_nan);

// let arr = ["grapefruit", 4, "hello", 5.6, true];
// function printStuff(element, index) {
// console.log("Printing stuff:", element, "on array position:", index);
// }
// arr.forEach(printStuff);

// let arr = ["squirrel", 5, "Tjed", new Date(), true];
// function checkString(element, index) {
// return typeof element === "string";
// }
// let filterArr = arr.filter(checkString);
// console.log(filterArr);
// console.log(arr.every(checkString));

// arr = ["grapefruit", 4, "hello", 5.6, true];
// arr.copyWithin(0, 3, 4);
// console.log(arr);

// arr = ["grapefruit", 4, "hello", 5.6, true];
// arr.copyWithin(1, 3, 4);
// console.log(arr);

// arr = ["grapefruit", 4, "hello", 5.6, true];
// arr.copyWithin(2, 3, 4);
// console.log(arr);

// arr = ["grapefruit", 4, "hello", 5.6, true];
// arr.copyWithin(0, 3, 5);
// console.log(arr);

// arr = ["grapefruit", 4, "hello", 5.6, true];
// arr.copyWithin(0, 2, 4);
// console.log(arr);

// function go(e) {   //Needs command in html
//     eval(e.value);
//     }

// let arr = [1, 2, 3, 4];
// let mapped_arr = arr.map(x => x + 1);
// console.log(mapped_arr);

// let s1 = "Hello ";
// let s2 = "JavaScript";
// let result = s1.concat(s2);
// console.log(result);

// let result = "Hello JavaScript";
// let arr_result = result.split(" "); // " " is , as default
// console.log(arr_result);

// let favoriteFruits = "strawberry,watermelon,grapefruit";
// let arr_fruits = favoriteFruits.split(","); // "," specifies , as delimeter
// console.log(arr_fruits);

// let letters = ["a", "b", "c"];
// let x = letters.join();
// console.log(x);

// let poem = "Roses are red, violets are blue, if I can do JS, then you can too!";
// let index_re = poem.indexOf("re"); // P.S. Don't forget to count spaces as well as letters
// console.log(index_re);

// let indexNotFound = poem.indexOf("python");
// console.log(indexNotFound);

// let pos2 = poem.charAt(1000);
// console.log(pos2);

// let searchStr = "When I see my fellow, I say hello";
// let pos = searchStr.search("lo");
// console.log(pos);

// let notFound = searchStr.search("JavaScript");
// console.log(notFound);

// let hi = "Hi buddy";
// let new_hi = hi.replace("buddy", "Pascal");
// console.log(new_hi);

// let new_hi2 = hi.replace("not there", "never there");
// console.log(new_hi2);

// let s3 = "hello hello";
// let new_s3 = s3.replace("hello", "oh");
// console.log(new_s3);

// let s3 = "hello hello";
// let new_s3 = s3.replaceAll("hello", "oh");
// console.log(new_s3);

// let caps = "HI HOW ARE YOU?";
// let fixed_caps = caps.toLowerCase();
// console.log(fixed_caps);

// let caps = "HI HOW ARE YOU?";
// console.log(caps[0] + caps.slice(1).toLowerCase(1));

// let encouragement = "You are doing great, keep up the good work!";
// let bool_start = encouragement.startsWith("You");
// console.log(bool_start);

// let bool_start2 = encouragement.startsWith("you");
// console.log(bool_start2);

// let bool_start3 = encouragement.toLowerCase().startsWith("you");
// console.log(bool_start3);

// let bool_end = encouragement.endsWith("Something else");
// console.log(bool_end);

// let x = 34;
// console.log(isNaN(x));
// console.log(!isNaN(x));
// let str = "hi";
// console.log(isNaN(str));

// let x = 3;
// let str = "finite";
// console.log(isFinite(x));
// console.log(isFinite(str));
// console.log(isFinite(Infinity));
// console.log(isFinite(10 / 0));

// let x = 3;
// let str = "integer";
// console.log(Number.isInteger(x));
// console.log(Number.isInteger(str));
// console.log(Number.isInteger(Infinity));
// console.log(Number.isInteger(2.4));

// let x = 1.23456;
// let newX = x.toFixed(3);
// console.log(x, newX);

// let x = 1.23456;
// let newX = x.toPrecision(4);
// console.log(newX);

// let highest = Math.max(2, 56, 12, 1, 233, 4);
// console.log(highest);

// let lowest = Math.min(2, 56, 12, 1, 233, 4);
// console.log(lowest);

// let highestOfWords = Math.max("hi", 3, "bye");
// console.log(highestOfWords);

// let result = Math.sqrt(64);
// console.log(result);

// let result2 = Math.pow(5, 3);
// console.log(result2);

// console.log(5 ** 3); // Same as one above

// let x = 6.78;
// let y = 5.34;

// console.log("X:", x, "becomes", Math.round(x));
// console.log("Y:", y, "becomes", Math.round(y));

// console.log("X:", x, "becomes", Math.ceil(x));
// console.log("Y:", y, "becomes", Math.ceil(y));

// let negativeX = -x;
// let negativeY = -y;

// console.log("negativeX:", negativeX, "becomes", Math.ceil(negativeX));
// console.log("negativeY:", negativeY, "becomes", Math.ceil(negativeY));

// console.log("negativeX:", negativeX, "becomes", Math.floor(negativeX));
// console.log("negativeY:", negativeY, "becomes", Math.floor(negativeY));

// console.log("X:", x, "becomes", Math.trunc(x));
// console.log("Y:", y, "becomes", Math.trunc(y));

// let x = 2;
// let exp = Math.exp(x);
// console.log("Exp:", exp);
// let log = Math.log(exp);
// console.log("Log:", log);

// let currentDateTime = new Date();
// console.log(currentDateTime);

// let now2 = Date.now();
// console.log(now2);

// let milliDate = new Date(1000);
// console.log(milliDate);

// let stringDate = new Date("Sat Jun 05 2021 12:40:12 GMT+0200");
// console.log(stringDate);

// let specificDate = new Date(2022, 1, 10, 12, 10, 15, 100);
// console.log(specificDate);

// var c = "http://www.google.com?id=1000&n=500";
// var e = encodeURIComponent(c);

// console.log(decodeURIComponent(e));

//Exercise 8.1
// let string1 = "How's%20it%20going%3F";
// let string2 = "How's it going?";

// console.log(decodeURIComponent(string1));
// console.log(encodeURIComponent(string2));

// let URIEntry = "http://www.basescripts.com?=Hello World";

// console.log(encodeURI(URIEntry));

//Exercise 8.2
// theArray = ["Laurence", "Mike", "Larry", "Kim", "Joanne", "Laurence", "Mike",
// "Laurence", "Mike", "Laurence", "Mike"];

// let ansVar = theArray.filter((value, index, array) => {
//     console.log(value, index, array, array.indexOf(value));
//     return array.indexOf(value) === index;
// })

// console.log(ansVar);

//Exercise 8.3
// let numbArray = [5, 4, 3, 2, 1, 6, 7, 8, 9];

// let numbArray1 = numbArray.map(function(x){
//     return x*2;
// })
// console.log(numbArray1);

// let numbArray2 = numbArray.map(x => x*2);
// console.log(numbArray2);

//Exercise 8.4
// let randoString = "thIs will be capiTalized for each word";

// function capLetters(str) {
//   str = str.toLowerCase();
//   const tempArr = [];
//   let words = str.split(" ");
//   words.forEach((word) => {
//     let temp = word.slice(0, 1).toUpperCase() + word.slice(1);
//     tempArr.push(temp);
//   });
//   return tempArr.join(" ");
// }
// console.log(capLetters(randoString));

//Exercise 8.5
// theString = "I love JavaScript";

// lowerString = theString.toLowerCase();
// console.log(lowerString);
// let vowels = ["a", "e", "i", "o", "u"];
// vowels.forEach((letter, index) => {
//   console.log(letter);
//   lowerString = lowerString.replaceAll(letter, index);
// });
// console.log(lowerString);

//Exercise 8.6
// console.log(Math.ceil(5.7));
// console.log(Math.floor(5.7));
// console.log(Math.round(5.7));
// console.log(Math.random());
// console.log(Math.floor(Math.random() * 11)); // 0-10
// console.log(Math.floor(Math.random() * 10) + 1); // 1-10;
// console.log(Math.floor(Math.random() * 100) + 1); // 1-100;
// function ranNum(min, max) {
//   return Math.floor(Math.random() * (max - min + 1)) + min;
// }
// for (let x = 0; x < 100; x++) {
//   console.log(ranNum(1, 100));
// }

//Exercise 8.7
// let future = new Date(2025, 5, 15);
// console.log(future);
// const months = [
//   "January",
//   "February",
//   "March",
//   "April",
//   "May",
//   "June",
//   "July",
//   "August",
//   "September",
//   "October",
//   "November",
//   "December",
// ];
// let day = future.getDate();
// let month = future.getMonth();
// let year = future.getFullYear();
// let myDate = `${months[month - 1]} ${day} ${year}`;
// console.log(myDate);