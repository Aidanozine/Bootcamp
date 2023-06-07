//Chapter project
// const theList = [ "laurence",
//                   "Svekis",
//                   true,
//                   35,
//                   null,
//                   undefined,
//                   { test: "one",
//                     score: 55
//                   },
//                   [ "one",
//                     "two"
//                   ]
//                 ];

// theList.splice(2, 6, "MIDDLE", "hello World", "LAST");

// theList.shift();

// theList.unshift("FIRST");

// console.log(theList);


//Product Catalogue
const prodCat = [ { prodName: "Fanta Grape",
                    model: "Cold drink",
                    cost: 12,
                    quantity: 6
                  },
                  { prodName: "BBQ chips",
                    model: "Simba",
                    cost: 15,
                    quantity: 2
                  },
                  { prodName: "Marshmallow eggs (3xpack)",
                    model: "Beacon",
                    cost: 10,
                    quantity: 5,
                    detail: [ "Promotional",
                              "Non-promotional"
                            ]
                  },
                  [ { promotionalBag: "Free", 
                      standardPlastic: 2
                    },
                    "Durable Plastic",             
                    "Recycleable Plastic"
                  ]
                ];

console.log(prodCat);

console.log(prodCat[2].quantity);

console.log(prodCat[1].model);

console.log(prodCat[2]);

console.log(prodCat[2].detail[1]);

console.log(prodCat[3][0].promotionalBag);

console.log(prodCat[3][1]);