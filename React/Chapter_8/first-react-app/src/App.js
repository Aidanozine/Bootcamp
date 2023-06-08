"use strict";

import React, { Component } from "react";
import GitHub from "./GitHub";
import { BrowserRouter, Route, Routes, Switch } from "react-router-dom";
import { Nav, Navbar } from "react-bootstrap";
import GitHubUser from './GitHubUser';
class App extends Component {
  render() {
    return (
      <div>
        <Header />
      </div>
    );
  }
}
export default App;

class Header extends Component {
  render() {
    return (
      <BrowserRouter>
        <div>
          <Navbar bg="light" expand="lg">
            <Navbar.Brand href="#home">React-Bootstrap</Navbar.Brand>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />
            <Navbar.Collapse id="basic-navbar-nav">
              <Nav className="mr-auto">
                <Nav.Link href="/">Home</Nav.Link>
                <Nav.Link href="/about">About</Nav.Link>
                <Nav.Link href="/github">GitHub</Nav.Link>
              </Nav>
            </Navbar.Collapse>
          </Navbar>
          <Routes>
          <Route exact path="/github/user/:login/:id" element={<GitHubUser />} />
            <Route path="/github" element={<GitHub />} />
            <Route path="/about" element={<About />} />
            <Route exact path="/" element={<Home />} />
            <Route path="/*" element={<NotFound />} />
          </Routes>
        </div>
      </BrowserRouter>
    );
  }
}
class Home extends Component {
  render() {
    return <div>Home</div>;
  }
}
class About extends Component {
  render() {
    return <div>About</div>
  }
}
class NotFound extends Component {
  render() {
    return <div>Not Found</div>;
  }
}