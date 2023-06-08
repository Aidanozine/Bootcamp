"use strict";

import React, { Component } from "react";
import { useParams, useNavigate } from "react-router-dom";
import { Button, Nav } from "react-bootstrap";
class GitHubUser extends Component {
  constructor(props) {
    super(props);
    this.handleClick = this.handleClick.bind(this);
  }

  handleClick(e) {
    this.props.history.push("/github");
  }

  render() {
    const { id, login } = this.props.params;
    return (
      <div>
        <h1>User Login: {login}</h1>
        <h2>User Id: {id}</h2>
        {/* <Button href="/github">
          Go to GitHub Users
        </Button> */}
        <Nav.Link href="/github">
          <Button>
          Go to GitHub Users
        </Button>
        </Nav.Link>
        {/*/ "Nav.Link" works same as button*/}
      </div>
    );
  }
}
export default (props) => <GitHubUser {...props} params={useParams()} />;

//useNavigate method of above
// import React from "react";
// import { useNavigate, useParams } from "react-router-dom";
// import { Button } from "react-bootstrap";

// const GitHubUser = () => {
//   const navigate = useNavigate();
//   const { id, login } = useParams();

//   const handleClick = () => {
//     navigate("/github");
//   };

//   return (
//     <div>
//       <h1>User Login: {login}</h1>
//       <h2>User Id: {id}</h2>
//       <Button variant="primary" onClick={handleClick}>
//         Go to GitHub Users
//       </Button>
//     </div>
//   );
// };

// export default GitHubUser;
