//stores item
function store(){
    var brand = document.getElementById('carBrand').value;
    var price = document.getElementById('carPrice').value;
    //gets the key
    var key = document.getElementById('key').value;

    const car = {
        brand: brand,
        price: price,
    }

    //converts to string
    window.localStorage.setItem(key,JSON.stringify(car));  
}

//retrieves item
function retrieveRecords(){
    console.log("retrieve records");
     var key = document.getElementById('retrieveKey').value;
    var records = window.localStorage.getItem(key);
    var paragraph = document.createElement("p");
    var infor = document.createTextNode(records);
    paragraph.appendChild(infor);
    var element = document.getElementById("retrieve");
    element.appendChild(paragraph);
}

//delete items
function removeItem(){
    var key = document.getElementById('removeKey').value;
    localStorage.removeItem(key)
    console.log("remove items");
}

//clears storage
function clearStorage(){
    localStorage.clear()
    console.log("clear records");
}

//loads page before functions are executed
window.onload =function(){
    document.getElementById("carForm").onsubmit = store
    document.getElementById("clearButton").onclick = clearStorage
    document.getElementById("removeButton").onclick = removeItem
    document.getElementById("retrieveButton").onclick = retrieveRecords
}