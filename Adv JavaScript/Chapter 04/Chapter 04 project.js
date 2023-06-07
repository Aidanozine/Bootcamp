//Chapter project

//Evaluating Number Game
// const randoNum = Math.floor(Math.random() * 10) + 1;
// console.log(`The number I was thinking: ${randoNum}.`);

// const inputNum = prompt("I'm thinking of a number between 1 and 10");
// const guessNum = (+inputNum);
// console.log(`Your guess: ${guessNum}`);

// if(guessNum === randoNum) {
//     alert("Wow! Right on the money!");
// } else if(guessNum > randoNum) {
//     alert("Sorry. Too high.");
// } else if(guessNum < randoNum) {
//     alert("Sorry. Too low.");
// }

//Friend Checker Game
const inputName = prompt("Who did you want to know about?");

switch(inputName) {
    case "Bob":
    console.log("Oh yes, good ol' Bob!");
    break;

    case "Jane":
    console.log("Yeah, I know Jane!");
    break;

    case "John":
    console.log("Ah-ha! Johnny!");
    break;

    case "Bethany":
    console.log("Oh! Do you know Bethany too?");
    break;

    case "Ann":
    console.log("Ah-ha! Ann!");
    break;

    case "Steve":
    console.log("Oh! Do you know Steven too?");
    break;

    case "Susan":
    console.log("Yeah, I know Susan!");
    break;

    case "Trent":
    console.log("Oh yes, good ol' Trent!");
    break;

    case inputName:
    console.log(`Hmmm. Sorry, I can't say I know ${inputName}.`);
}

//Rock Paper Scissors Game
// let choices = ["Rock", "Paper", "Scissors"];

// pickRandomWord = function(words) {
//     return words[Math.floor(Math.random() * words.length)];
// };

// let cpuChoices = pickRandomWord(choices);
// console.log(`I chose ${cpuChoices}`);

// let playerChoices = prompt("Choose Rock, Paper or Scissors");
// console.log(`You chose ${playerChoices}`)

// switch(cpuChoices) {
//     case "Rock":
//     if(playerChoices === "Rock") {
//         console.log("It's a draw!");
//     } else if(playerChoices === "Paper") {
//         console.log("You win!");
//     } else if(playerChoices === "Scissors") {
//         console.log("You lose!");
//     }
//     break;

//     case "Paper":
//     if(playerChoices === "Rock") {
//         console.log("You lose!");
//     } else if(playerChoices === "Paper") {
//         console.log("It's a draw!");
//     } else if(playerChoices === "Scissors") {
//         console.log("You win!");
//     }
//     break;

//     case "Scissors":
//     if(playerChoices === "Rock") {
//         console.log("You win!");
//     } else if(playerChoices === "Paper") {
//         console.log("You lose!");
//     } else if(playerChoices === "Scissors") {
//         console.log("It's a draw!");
//     }
//     break;
// }