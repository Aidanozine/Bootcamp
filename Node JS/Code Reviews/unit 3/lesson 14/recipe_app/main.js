const mongoose = require("mongoose");
const Subscriber = require("./models/subscriber");

// Connect with mongoose instead of mongodb
mongoose.connect(
    "mongodb://127.0.0.1:27017/recipe_db",
    { useNewUrlParser: true }
);
const db = mongoose.connection;

db.once("open", () => {
    console.log("Successfully connected to MongoDB using Mongoose!");
});

// Instantiate a new subscriber.
var subscriber1 = new Subscriber({
    name: "Jon Wexler",
    email: "jon@jonwexler.com"
});

// Exported the below code to a separate file.
// const subscriberSchema = mongoose.Schema({
//     name: String,
//     email: String,
//     zipCode: Number
// });

// const Subscriber = mongoose.model("Subscriber", subscriberSchema)



// Save a subscriber to the database
subscriber1.save()
    .then(data => console.log(data)) // Log saved data document
    .catch(error => console.log(error)); // Log errors





// Create and save a subscriber in a single step.
Subscriber.create(
    {
        name: "Jon2 Wexler",
        email: "jon2@jonwexler.com"
    }
)
    .catch(err => console.log(err))





// Run a query
var myQuery = Subscriber.findOne({
    name: "Jon Wexler"
})
.where("email", /wexler/);

myQuery.exec()
.then(data => console.log(data))
.catch(err => console.log(err));

// "use strict";

// const express = require("express"),
//   app = express(),
//   // errorController = require("./controllers/errorController"),
//   // homeController = require("./controllers/homeController"),
//   layouts = require("express-ejs-layouts"),
//   mongoose = require("mongoose"),
//   Subscriber = require("./models/subscriber");

// mongoose.connect(
//   "mongodb://127.0.0.1:27017/recipe_db",
//   { useNewUrlParser: true }
// );

// const db = mongoose.connection;

// db.once("open", () => {
//   console.log("Successfully connected to MongoDB using Mongoose!");
// });

// Subscriber.create(
//   {
//       name: "Jon2 Wexler",
//       email: "jon2@jonwexler.com"
//   }
// )
//   .catch(err => console.log(err))

// // Run a query
// var myQuery = Subscriber.findOne({
//   name: "Jon Wexler"
// })
// .where("email", /wexler/);

// myQuery.exec()
// .then(data => console.log(data))
// .catch(err => console.log(err));



// app.set("port", process.env.PORT || 3000);
// app.set("view engine", "ejs");

// app.use(express.static("public"));
// app.use(layouts);
// app.use(
//   express.urlencoded({
//     extended: false
//   })
// );
// app.use(express.json());
// // app.use(homeController.logRequestPaths);

// // app.get("/name", homeController.respondWithName);
// // app.get("/items/:vegetable", homeController.sendReqParam);

// app.post("/", (req, res) => {
//   console.log(req.body);
//   console.log(req.query);
//   res.send("POST Successful!");
// });

// // app.use(errorController.logErrors);
// // app.use(errorController.respondNoResourceFound);
// // app.use(errorController.respondInternalError);

// app.listen(app.get("port"), () => {
//   console.log(`Server running at http://localhost:${app.get("port")}`);
// });

