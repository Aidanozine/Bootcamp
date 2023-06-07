//Chapter Project
//Employee Tracking App
// class Employees {
//     constructor (firstname, lastname, yearsEmployed) {
//         this.firstname = firstname;
//         this.lastname = lastname;
//         this.yearsEmployed = yearsEmployed;
//     }
// }

// let emp1 = new Employees("Ed", "Sheeran", 6);
// let emp2 = new Employees("Taylor", "Swift", 5);
// let emp3 = new Employees("Selena", "Gomez", 3);
// let staff = [emp1, emp2, emp3];

// Employees.prototype.details = function(){
//     return this.firstname + " " + this.lastname + " " + "has been an employee at this company for " + this.yearsEmployed + " years.";
// }

// // console.log(emp1.details());
// // console.log(emp2.details());
// // console.log(emp3.details());

// staff.forEach((emp) => {
//     console.log(emp.details())
// });


//Menu Items Price Calculator
class Prices {
    #quantity1 = 5;
    #quantity2 = 10;
    constructor (itemCost1, itemCost2) {
        this.itemCost1 = itemCost1;
        this.itemCost2 = itemCost2;
    }
    amntDue(){
    return (this.itemCost1 * this.#quantity1) + (this.itemCost2 * this.#quantity2);
    }
    get totalPaid(){
    return this.amntDue();
    }
}

let itemCost1 = new Prices(0, 15);
let itemCost2 = new Prices(10, 20);
console.log(itemCost1.totalPaid);
console.log(itemCost2.totalPaid);