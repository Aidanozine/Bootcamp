//--------------------------------------------Chapter 13 =>
import React from 'react'
import { Switch, Route, Link } from "react-router-dom"
import "bootstrap/dist/css/bootstrap.min.css"

import AddReview from "./components/add-review"
import MoviesList from "./components/movies-list"
import Movie from "./components/movie"
import Login from "./components/login" 

import Nav from 'react-bootstrap/Nav'
import Navbar from 'react-bootstrap/Navbar'

//--------------------------------------------Chapter 14 =>
function App() {
  const [user, setUser] = React.useState(null)

  async function login(user = null){// default user to null
    setUser(user)
  }

  async function logout(){
    setUser(null)
  }
//--------------------------------------------Chapter 14 <=

  return (
    <div className="App">
      <Navbar bg="light" expand="lg">
        <Navbar.Brand>Movie Reviews</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="mr-auto">            
            <Nav.Link>
              <Link to={"/movies"}>Movies</Link>
            </Nav.Link>            
            <Nav.Link>
              { user ? (
                //--------------------------------------------Chapter 14 =>
                <a onClick={logout}>Logout User</a>
                //--------------------------------------------Chapter 14 <=
              ) : (
                <Link to={"/login"}>Login</Link>
              )}              
            </Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Navbar>
      {/* --------------------------------------------Chapter 15 => */}
      <Switch>
        <Route exact path={["/", "/movies"]} component={MoviesList}>
        </Route>
        <Route path="/movies/:id/review" render={(props)=> 
          <AddReview {...props} user={user} />
        }>
        </Route>
        <Route path="/movies/:id/" render={(props)=> 
          <Movie {...props} user={user} />
        }>
        </Route>
        <Route path="/login" render={(props)=> 
          <Login {...props} login={login} />
        }>            
        </Route>          
      </Switch>           
      {/* --------------------------------------------Chapter 15 <= */}
      
    </div>
  );
}
//--------------------------------------------Chapter 13 <=
export default App;
