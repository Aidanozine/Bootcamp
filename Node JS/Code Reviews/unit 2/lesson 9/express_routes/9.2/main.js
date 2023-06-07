"use strict";

const port = 3000,
  express = require("express"),
  app = express();
//----------------------------------------------9.2 start
app.use(
  express.urlencoded({
    extended: false
  })
);
app.use(express.json());
//----------------------------------------------9.2 end
app.use((req, res, next) => {
  console.log(`request made to: ${req.url}`);
  next();
});
//----------------------------------------------9.2 start
app.post("/", (req, res) => {
  console.log(req.body);
  console.log(req.query);
  res.send("POST Successful!");
});
//----------------------------------------------9.2 end
app.get("/items/:vegetable", (req, res) => {
  let veg = req.params.vegetable;
  res.send(`This is the page for ${veg}`);
});

app.listen(port, () => {
  console.log(`Server running on port: ${port}`);
});