const mongoose = require("mongoose");

const db = require("./models");

const createTutorial = function(tutorial) {
  return db.Tutorial.create(tutorial).then(docTutorial => {
    console.log("\n>> Created Tutorial:\n", docTutorial);
    return docTutorial;
  });
};

//-------------------------------images
const createImage = function(tutorialId, image) {
  return db.Image.create(image).then(docImage => {
    console.log("\n>> Created Image:\n", docImage);
    return db.Tutorial.findByIdAndUpdate(
      tutorialId,
      {
        $push: {
          images: {
            _id: docImage._id,
            url: docImage.url,
            caption: docImage.caption
          }
        }
      },
      { new: true, useFindAndModify: false }
    );
  });
};
//--------------------------------------

//------------------------------comments
const createComment = function(tutorialId, comment) {
  return db.Comment.create(comment).then(docComment => {
    console.log("\n>> Created Comment:\n", docComment);

    return db.Tutorial.findByIdAndUpdate(
      tutorialId,
      { $push: { comments: docComment._id } },
      { new: true, useFindAndModify: false }
    );
  });
};
//--------------------------------------

const getTutorialWithPopulate = function(id) {
  return db.Tutorial.findById(id).populate("comments", "-_id -__v");
};

const run = async function() {
  var tutorial = await createTutorial({
    title: "Tutorial #1",
    author: "bezkoder"
  });

  //-------------------------------images
  tutorial = await createImage(tutorial._id, {
    path: "sites/uploads/images/mongodb.png",
    url: "/images/mongodb.png",
    caption: "MongoDB Database",
    createdAt: Date.now()
  });
  console.log("\n>> Tutorial:\n", tutorial);

  tutorial = await createImage(tutorial._id, {
    path: "sites/uploads/images/one-to-many.png",
    url: "/images/one-to-many.png",
    caption: "One to Many Relationship",
    createdAt: Date.now()
  });
  console.log("\n>> Tutorial:\n", tutorial);
//--------------------------------------

//------------------------------comments
tutorial = await createComment(tutorial._id, {
  username: "jack",
  text: "This is a great tutorial.",
  createdAt: Date.now()
});
console.log("\n>> Tutorial:\n", tutorial);

tutorial = await createComment(tutorial._id, {
  username: "mary",
  text: "Thank you, it helps me alot.",
  createdAt: Date.now()
});
console.log("\n>> Tutorial:\n", tutorial);
//--------------------------------------

tutorial = await getTutorialWithPopulate(tutorial._id);
console.log("\n>> populated Tutorial:\n", tutorial);

};

mongoose
  .connect("mongodb://127.0.0.1:27017/bezkoder_db_case2", {
    useNewUrlParser: true,
    useUnifiedTopology: true
  })
  .then(() => console.log("Successfully connect to MongoDB."))
  .catch(err => console.error("Connection error", err));

run();