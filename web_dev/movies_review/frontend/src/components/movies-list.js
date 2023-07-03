//--------------------------------------------Chapter 17 =>
import React, {useState, useEffect } from 'react'
import MovieDataService from "../services/movies"
import { Link } from "react-router-dom"
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';
import Col from 'react-bootstrap/Col';
import Row from 'react-bootstrap/Row';
import Container from 'react-bootstrap/Container';
import Card from 'react-bootstrap/Card';

const MoviesList = props => { 
  
  const [movies, setMovies] = useState([])
  const [searchTitle, setSearchTitle] = useState("")
  const [searchRating, setSearchRating] = useState("")
  const [ratings, setRatings] = useState(["All Ratings"])
//--------------------------------------------Chapter 17 <=
//--------------------------------------------Chapter 14 =>
//--------------------------------------------Chapter 23 =>
  const [currentPage, setCurrentPage] = useState(0)
  const [entriesPerPage, setEntriesPerPage] = useState(0)
//--------------------------------------------Chapter 23 <=
//--------------------------------------------Chapter 24 =>
  const [currentSearchMode, setCurrentSearchMode] = useState("")
//--------------------------------------------Chapter 24 <=
//--------------------------------------------Chapter 17 =>
  useEffect(() =>{ 
    retrieveMovies()
    retrieveRatings()
  },[])
//--------------------------------------------Chapter 23 =>
  useEffect(() =>{ 
    retrieveNextPage()
  },[currentPage])
//--------------------------------------------Chapter 23 <=
//--------------------------------------------Chapter 24 =>
  useEffect(() =>{ 
    setCurrentPage(0)
  },[currentSearchMode])

  const retrieveNextPage = () => {
    if(currentSearchMode === "findByTitle")
      findByTitle()
    else if(currentSearchMode === "findByRating")
      findByRating()      
    else 
      retrieveMovies()
  }
//--------------------------------------------Chapter 24 <=
  const retrieveMovies = () =>{
//--------------------------------------------Chapter 24 =>
    setCurrentSearchMode("")
//--------------------------------------------Chapter 24 <=
    MovieDataService.getAll(currentPage)
      .then(response =>{
        console.log(response.data)
        setMovies(response.data.movies)
//--------------------------------------------Chapter 23 => 
        setCurrentPage(response.data.page)
        setEntriesPerPage(response.data.entries_per_page)
//--------------------------------------------Chapter 23 <=
      })
      .catch( e =>{
        console.log(e)
      })
  }

  const retrieveRatings = () =>{
    MovieDataService.getRatings()
      .then(response =>{
        console.log(response.data)
 	  //start with 'All ratings' if user doesn't specify any ratings
        setRatings(["All Ratings"].concat(response.data)) 
      })
      .catch( e =>{
        console.log(e)
      })
  }  

  const onChangeSearchTitle = e => {
    const searchTitle = e.target.value
    setSearchTitle(searchTitle);
  }

  const onChangeSearchRating = e => {
    const searchRating = e.target.value
    setSearchRating(searchRating);
  }  
//--------------------------------------------Chapter 17 <=
  const find =(query, by) =>{
    MovieDataService.find(query,by,currentPage)
      .then(response =>{
        console.log(response.data)
        setMovies(response.data.movies)
      })
      .catch(e =>{
        console.log(e)
      })
  }

  const findByTitle = () => {
//--------------------------------------------Chapter 24 =>
    setCurrentSearchMode("findByTitle")
//--------------------------------------------Chapter 24 <=
    find(searchTitle, "title")    
  }
  const findByRating = () => {
//--------------------------------------------Chapter 24 =>
    setCurrentSearchMode("findByRating")
//--------------------------------------------Chapter 24 <=
    if(searchRating === "All Ratings"){
      retrieveMovies()
    }
    else{
      find(searchRating, "rated")
    }
  }  

  return (
    <div className="App">   
      <Container>
        <Form>        
          <Row>
            <Col>
              <Form.Group>          
                <Form.Control 
                  type="text" 
                  placeholder="Search by title" 
                  value={searchTitle} 
                  onChange={onChangeSearchTitle} 
                />
              </Form.Group>        
              <Button 
                variant="primary" 
                type="button" 
                onClick={findByTitle}
              > 
                Search         
              </Button>
            </Col>
            <Col>
              <Form.Group>
                <Form.Control as="select" onChange={onChangeSearchRating} >
                  {ratings.map(rating =>{
                    return(
                      <option value={rating}>{rating}</option>
                    )
                  })}
                </Form.Control>       
              </Form.Group>    
              <Button 
                  variant="primary" 
                  type="button" 
                  onClick={findByRating}
              > 
                Search         
              </Button>  
            </Col>
          </Row> 
        </Form>
        {/* --------------------------------------------Chapter 17 => */} 
        <Row>
            {movies.map((movie) =>{
              return(
                <Col>
                  <Card style={{ width: '18rem' }}>
                    <Card.Img src={movie.poster+"/100px180"} />
                    <Card.Body>
                      <Card.Title>{movie.title}</Card.Title>
                      <Card.Text>
                        Rating: {movie.rated}                        
                      </Card.Text>
                      <Card.Text>{movie.plot}</Card.Text>                                            
                      <Link to={"/movies/"+movie._id} >View Reviews</Link>
                    </Card.Body>
                  </Card>            
                </Col>                
              )
            })}
        </Row>
        {/* --------------------------------------------Chapter 17 <= */}          
        <br /> 
        {/* --------------------------------------------Chapter 23 =>       */}
          Showing page: {currentPage}. 
          <Button 
            variant="link"             
            onClick={() => {setCurrentPage(currentPage + 1)}}       
          > 
            Get next {entriesPerPage} results         
          </Button>
        {/* --------------------------------------------Chapter 23 <= */}
      </Container>        
    </div>
  );

}
//--------------------------------------------Chapter 14 <=
export default MoviesList;

