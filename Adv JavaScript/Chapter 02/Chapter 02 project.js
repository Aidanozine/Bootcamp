//Chapter project
//Miles to Kilometers
// let milesDistance = prompt("What's the distance travelled in miles?");

// let kmDistance = (milesDistance * 1.60934).toFixed(2);

// console.log(` The distance of ${kmDistance} km is equal to ${milesDistance} miles.`);

//BMI Calculator
let inchesHeight = prompt("What's your height in inches?");

let cmHeight = (inchesHeight * 2.54).toFixed(2);

let meterHeight = (cmHeight / 100).toFixed(2);

let poundsWeight = prompt("What do you weigh in pounds?");

let kiloWeight = (poundsWeight / 2.2046).toFixed(2);

let BMI = (kiloWeight / (meterHeight ** 2).toFixed(2)).toFixed(2);

console.log(`If you are ${cmHeight} cm tall and weigh ${kiloWeight} kg, then your BMI is ${BMI}.`);