const mongoose = require("mongoose"),
    subscriberSchema = mongoose.Schema({
        name: String,
        email: {
          type: String,
          unique:true
        },
        zipCode: Number
    });

module.exports = mongoose.model("Subscriber", subscriberSchema);

// "use strict";

// const mongoose = require("mongoose"),
//   subscriberSchema = mongoose.Schema({
//     name: String,
//     email: String,
//     zipCode: Number
//   });

// module.exports = mongoose.model("Subscriber", subscriberSchema);