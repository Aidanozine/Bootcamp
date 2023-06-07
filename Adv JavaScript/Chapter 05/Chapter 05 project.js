//Chapter Project
const myTable = [];
const numero = 10;
for (let x = 0; x < numero; x++) {
  const temp = [];
  for (let y = 0; y < numero; y++) {
    temp.push(x * y);
  }
  myTable.push(temp);
}
console.table(myTable);