//--------------------------------------------Chapter 14 =>
import React, { useState } from 'react'
import MovieDataService from "../services/movies"
import { Link } from "react-router-dom"
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';

const AddReview = props => {

  let editing = false
  let initialReviewState = ""
//--------------------------------------------Chapter 21 =>
  if(props.location.state && props.location.state.currentReview){
    editing = true
    initialReviewState = props.location.state.currentReview.review
  }
//--------------------------------------------Chapter 21 <=

  const [review, setReview] = useState(initialReviewState)
  // keeps track if review is submitted
  const [submitted, setSubmitted] = useState(false)

  const onChangeReview = e => {
    const review = e.target.value
    setReview(review);
  } 
 
  const saveReview = () => {
    var data = {
      review: review,
      name: props.user.name,
      user_id: props.user.id,
      movie_id: props.match.params.id // get movie id direct from url
    }
//--------------------------------------------Chapter 21 =>
    if(editing){
        // get existing review id
        data.review_id = props.location.state.currentReview._id
        MovieDataService.updateReview(data)
          .then(response =>{
            setSubmitted(true);
            console.log(response.data)
          })
          .catch(e =>{
            console.log(e);
          })
      }
      else{
//--------------------------------------------Chapter 21 <=
        MovieDataService.createReview(data)
          .then(response => {
            setSubmitted(true)
            console.log(response.data)
          })
          .catch(e =>{
            console.log(e);
          })    
      }
    }
//--------------------------------------------Chapter 21 =>
  return(
    <div>
      {submitted ? (
        <div>
          <h4>Review submitted successfully</h4>
          <Link to={"/movies/"+props.match.params.id}>
            Back to Movie
          </Link> 
        </div>
      ):(
        <Form>
          <Form.Group>
            <Form.Label>{editing ? "Edit" : "Create"} Review</Form.Label>
            <Form.Control 
              type="text" 
              required
              value={review} 
              onChange={onChangeReview}
            />
          </Form.Group> 
          <Button variant="primary" onClick={saveReview}>
            Submit
          </Button>
        </Form>    
      )}
    </div>
  )
//--------------------------------------------Chapter 21 <=
}
//--------------------------------------------Chapter 14 <=
export default AddReview;
