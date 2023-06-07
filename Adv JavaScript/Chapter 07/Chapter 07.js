// function Dog(dogName, weight, color, breed) {
//     this.dogName = dogName;
//     this.weight = weight;
//     this.color = color;
//     this.breed = breed;
//     }
//     let dog = new Dog("Jacky", 30, "brown", "labrador");

//      /*console.log(dog);
//      console.log(dog.dogName);
//      console.log(dog.weight);
//      console.log(dog.color);
//      console.log(dog.breed);*/

//     alert(`It's a dog named ${dog.dogName} whose weight is ${dog.weight}; is ${dog.color} in colour and is a ${dog.breed}.`)

// function Dog(dogName, weight, color, breed) {
//     this.dogName = dogName;
//     this.weight = weight;
//     this.color = color;
//     this.breed = breed;
//     }
//     let dog1 = new Dog("Jacky", 30, "brown", "labrador");
//     let dog2 = new Dog("Bruce", 30, "black", "pitbull");

//     alert(`It's a dog named ${dog1.dogName} whose weight is ${dog1.weight}; is ${dog1.color} in colour and is a ${dog1.breed}.`)
//     alert(`It's a dog named ${dog2.dogName} whose weight is ${dog2.weight}; is ${dog2.color} in colour and is a ${dog2.breed}.`)

// class Dog {
//     constructor(dogName, weight, color, breed) {
//     this.dogName = dogName;
//     this.weight = weight;
//     this.color = color;
//     this.breed = breed;
//     }
//     }
//     let dog1 = new Dog("JavaScript", 2.4, "brown", "chihuahua");
//     let dog2 = new Dog("Java", 2.4, "white", "chihuahua");
//     let dog3 = new Dog("Python", 2.4, "black", "chihuahua");
//     let dog4 = new Dog("SQL", 2.4, "caramel", "chihuahua");

//     alert(`It's a dog named ${dog1.dogName} whose weight is ${dog1.weight}; is ${dog1.color} in colour and is a ${dog1.breed}.`)
//     alert(`It's a dog named ${dog2.dogName} whose weight is ${dog2.weight}; is ${dog2.color} in colour and is a ${dog2.breed}.`)
//     alert(`It's a dog named ${dog3.dogName} whose weight is ${dog3.weight}; is ${dog3.color} in colour and is a ${dog3.breed}.`)
//     alert(`It's a dog named ${dog4.dogName} whose weight is ${dog4.weight}; is ${dog4.color} in colour and is a ${dog4.breed}.`)

// class Person {
//     constructor(firstname, lastname) {
//     this.firstname = firstname;
//     this.lastname = lastname;
//     }
//     }

//     let p1 = new Person("Jack", "Anderson");
//     let p2 = new Person("Jane", "Dolores");
//     let p3 = new Person("Jill");

//     console.log(p1);
//     console.log(p1.firstname);
//     console.log(p1.lastname);
//     console.log(p2);
//     console.log(p2.firstname);
//     console.log(p2.lastname);
//     console.log(p3);
//     console.log(p3.firstname);
//     console.log(p3.lastname);

    // alert(`Announcing Sir ${p1.firstname} of House ${p1.lastname}.`)
    // alert(`Announcing Lady ${p2.firstname} of House ${p2.lastname}.`)

    // alert(`Hi ${p1.firstname}!`)
    // alert(`Hi ${p2.firstname}!`)


//     class Person {
//         constructor(firstname, lastname = "Doe") /*Will pass "Doe" wherever a lastname isn't given*/ {
//         this.firstname = firstname;
//         this.lastname = lastname;
//         }
//         /*greet() {
//             console.log("Hi there! I'm", this.firstname);
//             }*/
//     }

// /*let p = new Person("Maaike", "van Putten");
// p.greet();

// let p1 = new Person("Jack", "Anderson");
// p1.greet();

// let p2 = new Person("Jane", "Dolores");
// p2.greet();*/
    
//         let p1 = new Person("Jack", "Anderson");
//         let p2 = new Person("Jane", "Dolores");
//         let p3 = new Person("Jill");
    
//         console.log(p1);
//         console.log(p1.firstname);
//         console.log(p1.lastname);
//         console.log(p2);
//         console.log(p2.firstname);
//         console.log(p2.lastname);
//         console.log(p3);
//         console.log(p3.firstname);
//         console.log(p3.lastname);

//   class Person {
//     constructor(firstname, lastname = "Doe") /*Will pass "Doe" wherever a lastname isn't given*/ {
//     this.firstname = firstname;
//     this.lastname = lastname;
//     }
//     greet() {
//         console.log("Hi there! I'm", this.firstname);
//         }
// }

// let p = new Person("Maaike", "van Putten");
// p.greet();

// let p1 = new Person("Jack", "Anderson");
// p1.greet();

// let p2 = new Person("Jane", "Dolores");
// p2.greet();

//     let p1 = new Person("Jack", "Anderson");
//     let p2 = new Person("Jane", "Dolores");
//     let p3 = new Person("Jill");

//     console.log(p1);
//     console.log(p1.firstname);
//     console.log(p1.lastname);
//     console.log(p2);
//     console.log(p2.firstname);
//     console.log(p2.lastname);
//     console.log(p3);
//     console.log(p3.firstname);
//     console.log(p3.lastname);

// class Person {
//     firstname;
//     lastname;
//     constructor(
//       firstname,
//       lastname = "Doe"
//     ){
//       this.firstname = firstname;
//       this.lastname = lastname;
//     }
   
//     compliment(name, object) {
//       return "That's a wonderful " + object + ", " + name;
//     }
//   }
  
//   let p1 = new Person("Jack", "Anderson");
//   let p2 = new Person("Jane", "Dolores");
//   let p3 = new Person("Jill");
  
//   let compliment = p1.compliment("Jack", "hat");
//   console.log(compliment); 


// /*P.S. The #'s make the information private*/
// class Person {
//     #firstname;
//     #lastname;
//     constructor(firstname, lastname = "Doe") /*Will pass "Doe" wherever a lastname isn't given*/ {
//     this.#firstname = firstname;
//     this.#lastname = lastname;
//     }
//     /*greet() {
//         console.log("Hi there! I'm", this.firstname);
//         }*/
// }
//          let p1 = new Person("Jack", "Anderson");
//          let p2 = new Person("Jane", "Dolores");
//          let p3 = new Person("Jill");     

    //  console.log(p1);
    //  console.log(p1.firstname);
    //  console.log(p1.lastname);
    //  console.log(p2);
    //  console.log(p2.firstname);
    //  console.log(p2.lastname);
    //  console.log(p3);
    //  console.log(p3.firstname);
    //  console.log(p3.lastname);

// class Person {
//     #firstname;
//     #lastname;
//     constructor(firstname, lastname) {
//     this.#firstname = firstname;
//     this.#lastname = lastname;
//     }
//     get firstname() {
//     return this.#firstname;
//     }
//     set firstname(firstname) {
//     this.#firstname = firstname;
//     }
//     get lastname() {
//     return this.#lastname;
//     }
//     set lastname(lastname) {
//     this.#lastname = lastname;
//     }
//     }

//           let p1 = new Person("Jack", "Anderson");
//           let p2 = new Person("Jane", "Dolores");
//           let p3 = new Person("Jill"); 
          
//           console.log(p1);
//           console.log(p1.firstname);
//           console.log(p1.lastname);
//           console.log(p2);
//           console.log(p2.firstname);
//           console.log(p2.lastname);
//           console.log(p3);
//           console.log(p3.firstname);
//           console.log(p3.lastname);

// class Person {
//     #firstname;
//     #lastname;
//     constructor(firstname, lastname) {
//         if (firstname.length > 1){
//             this.#firstname = firstname;
//             }else {
//                 alert("Name too short!")
//             }
//     this.#lastname = lastname;
//     }
//     get firstname() {
//     return this.#firstname;
//     }
//     set firstname(firstname) {
//     if (firstname.length > 1){
//     this.#firstname = firstname;
//     }else {
//         alert("Name too short!")
//     }
//     }
//     get lastname() {
//     return this.#lastname;
//     }
//     set lastname(lastname) {
//     this.#lastname = lastname;
//     }
//     }

//           let p1 = new Person("J", "Anderson");
//           let p2 = new Person("Jane", "Dolores");
//           let p3 = new Person("Jill"); 
        
//           console.log(p1);
//           console.log(p1.firstname);
//           console.log(p1.lastname);
//           console.log(p2);
//           console.log(p2.firstname);
//           console.log(p2.lastname);
//           console.log(p3);
//           console.log(p3.firstname);
//           console.log(p3.lastname);


//Inheritance

// class Vehicle {
//     color;
//     currentSpeed;
//     maxSpeed;
//     constructor(color, currentSpeed, maxSpeed) {
//     this.color = color;
//     this.currentSpeed = currentSpeed;
// this.maxSpeed = maxSpeed;
// }
// move() {
// console.log("moving at", this.currentSpeed);
// }
// accelerate(amount) {
// this.currentSpeed += amount;
// }
// }

// class Motorcycle extends Vehicle {
//     fuel;
//     constructor(color, currentSpeed, maxSpeed, fuel) {
//     super(color, currentSpeed, maxSpeed);
//     this.fuel = fuel;
//     }
//     doWheelie() {
//     console.log("Driving on one wheel!");
//     }
//     }

// let motor = new Motorcycle("Black", 0, 250, "gasoline");
// console.log(motor.color);
// motor.accelerate(50);
// console.log(motor.currentSpeed)
// motor.move();
// motor.doWheelie();

// class Person {
//     constructor(firstname, lastname) {
//     this.firstname = firstname;
//     this.lastname = lastname;
//     }
//     greet() {
//     console.log("Hi there!");
//     }
//     }

//     Person.prototype.introduce = function () {
//         console.log("Hi, I'm", this.firstname);
//         };

//     Person.prototype.favoriteColor = "green";

//         let p = new Person("Maria", "Saga");
// console.log(p.favoriteColor);
// p.introduce();
// p.greet();

//Exercise 7.1
// class Person {
//   constructor(firstname, lastname) {
//     this.firstname = firstname;
//     this.lastname = lastname;
//   }
// }
// let person1 = new Person("Bob", "Sullivan");
// let person2 = new Person("Lucy", "Orville");
// console.log("hello " + person1.firstname);
// console.log("hello " + person2.firstname);

//Exercise 7.2
// class Person {
//     constructor(firstname, lastname) {
//         this.firstname = firstname;
//         this.lastname = lastname;
//     }
//     fullname() {
//         return this.firstname + " " + this.lastname
//     }
// }
// let person3 = new Person("Janine", "Norton");
// console.log("Hello " + person3.fullname());

//Exercise 7.3
// class Animals {
//     constructor(species, sound) {
//         this.species = species;
//         this.sound = sound;
//     }
//     animalInfo() {
//         return this.species + " " + this.sound;
//     }
// }

// Animals.prototype.sadTruth = function() {
//     console.log(this.species + " sleep a lot.");
// }

// let animal1 = new Animals("Cows", "moo");
// let animal2 = new Animals("Dogs", "bark");
// let animal3 = new Animals("Cats", "meow");
// console.log("Did you know " + animal1.animalInfo());
// console.log("Did you know " + animal2.animalInfo());
// console.log("Did you know " + animal3.animalInfo());

// animal1.sadTruth();