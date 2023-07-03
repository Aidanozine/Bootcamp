//--------------------------------------------Chapter 8 =>
import express from 'express'
import MoviesController from './movies.controller.js'
//--------------------------------------------Chapter 10 =>
import ReviewsController from './reviews.controller.js'
//--------------------------------------------Chapter 10 <= 

const router = express.Router() // get access to express router

//router.route('/').get((req,res) => res.send('hello world'))
router.route('/').get(MoviesController.apiGetMovies)
//--------------------------------------------Chapter 12 =>
router.route("/id/:id").get(MoviesController.apiGetMovieById)
router.route("/ratings").get(MoviesController.apiGetRatings)
//--------------------------------------------Chapter 12 <=
//--------------------------------------------Chapter 8 <=
//--------------------------------------------Chapter 10 =>
router
    .route("/review")
    .post(ReviewsController.apiPostReview)
    .put(ReviewsController.apiUpdateReview)
    .delete(ReviewsController.apiDeleteReview)
//--------------------------------------------Chapter 10 <=
export default router
