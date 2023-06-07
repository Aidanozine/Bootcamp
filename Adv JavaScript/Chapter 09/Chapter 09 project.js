//Chapter Project
let component1 = document.querySelector(".output");
console.log(component1);

jsObject = document.querySelector("ul");
jsObject.id = "mainlist";
console.log(jsObject);

const divTags = document.querySelectorAll("div");
for (let x = 0; x < divTags.length; x++) {
  console.log(divTags[x].tagName);
  divTags[x].id = "id" + (x + 1);
  if (x % 2) {
    divTags[x].style.color = "red";
  } else {
    divTags[x].style.color = "blue";
  }
}