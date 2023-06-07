//Exercise 4.1
// let pizza4Dinner = true;
// console.log(pizza4Dinner);

// let dinner = prompt("What's for dinner?").toLowerCase();

// if(dinner === "pizza") {
//     console.log("I better have a small lunch.");
//     alert(`If dinner is ${dinner}, I shouldn't eat a lot now.`)
// } if(dinner !== "pizza") {
//     console.log("Lunch IS the second most important meal of the day.");
//     alert(`If dinner is ${dinner}, that won't conflict with lunch.`)
// }

//Exercise 4.2
// let age = prompt("How old are you?");
// let access = age<19? "denied" : "allowed";
// if(age>21) {
//     console.log(`You are ${access} access to this venue and you are ${access} to purchase alcohol.`);
// } if(age>=19 && age<21) {
//     console.log(`You are ${access} access to the venue, but you are not ${access} to purchase alcohol.`);
// } if(age<19) {
//     console.log(`You are ${access} access to this venue.`);
// }

//Exercise 4.3
// let id = prompt("ID number");
// let valid = id.length == 13? "valid" : "invalid";

// if(id.length==13 && id.startsWith("8")) {
//     console.log(`Your ID is ${valid}, you are allowed entry into the venue.`);
// } else if(id.length==13 && id.startsWith("9")) {
//     console.log(`Your ID is ${valid}, you are allowed entry into the venue.`);
// } else if(id.length==13 && id.startsWith("01")) {
//     console.log(`Your ID is ${valid}, you are allowed entry into the venue.`);
// } else if(id.length==13 && id.startsWith("02")) {
//     console.log(`Your ID is ${valid}, you are denied entry into the venue.`);
// } else {
//     console.log(`Your ID is ${valid}.`);
// }

//Exercise 4.4
// const magic8ball = Math.floor(Math.random() * 5) + 1;

// switch(magic8ball) {
//     case 1:
//         console.log("Yes");
//         break;

//     case 2:
//         console.log("Unlikely");
//         break;

//     case 3:
//         console.log("Maybe");
//         break;

//     case 4:
//         console.log("No");
//         break;

//     case 5:
//         console.log("Likely");
// }

//Exercise 4.5
// const prize = prompt("Pick a number between 0 and 10");

// const answer = (+prize);
// console.log(`My Selection: ${answer}.`);

// switch(answer) {
//     case 0:
//         console.log("Common Chest");
//         break;

//     case 1:
//         console.log("Rare Chest");
//         break;

//     case 2:
//         console.log("SR Chest");
//         break;

//     case 3:
//         console.log("Uncommon Chest");
//         break;

//     case 4:
//         console.log("Common Chest");
//         break;

//     case 5:
//         console.log("SSR Chest");
//         break;

//     case 6:
//         console.("SSR Chest");
//         break;

//     case 7:
//         console.log("Legendary Chest");
//         break;

//     case 8:
//         console.log("Rare Chest");
//         break;

//     case 9:
//         console.log("SR Chest");
//         break;

//     case 10:
//         console.log("Uncommon Chest");
// }