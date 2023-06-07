"use strict";

const port = 3000,
  express = require("express"),
  app = express();
  //------------------------------------------8.3 start
app
  .get("/", (req, res) => {
    console.log(req.params);
    console.log(req.body);
    console.log(req.url);
    console.log(req.query);
    res.send("Hello, Universe!");
  })
  //------------------------------------------8.3 end
  .listen(port, () => {
    console.log(`The Express.js server has started and is listening on port number: ${port}`);
  });