//--------------------------------------------Chapter 6 =>
import app from "./server.js";
import mongodb from "mongodb";
import dotenv from "dotenv";
//--------------------------------------------Chapter 7 =>
import MoviesDAO from "./dao/moviesDAO.js";
//--------------------------------------------Chapter 7 <=
//--------------------------------------------Chapter 10 =>
import ReviewsDAO from "./dao/reviewsDAO.js";
//--------------------------------------------Chapter 10 <=

async function main() {
  dotenv.config();
  const client = new mongodb.MongoClient(process.env.MOVIEREVIEWS_DB_URI);
  const port = process.env.PORT || 8000;

  try {
    // Connect to the MongoDB cluster
    await client.connect();
    //--------------------------------------------Chapter 7 =>
    await MoviesDAO.injectDB(client);
    //--------------------------------------------Chapter 7 <=
    //--------------------------------------------Chapter 10 =>
    await ReviewsDAO.injectDB(client);
    //--------------------------------------------Chapter 10 <=
    app.listen(port, () => {
      console.log("server is running on port:" + port);
    });
  } catch (e) {
    console.error(e);
    process.exit(1);
  }
}
//--------------------------------------------Chapter 6 <=
main().catch(console.error);
