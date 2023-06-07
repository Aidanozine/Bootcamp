// import React, { Component } from 'react';
// import { Jumbotron, Button } from 'react-bootstrap';
// class JumboTronComponent extends Component {
// render() {
// return (
// <div>
// <Jumbotron>
// <h1>Hello, world!</h1>
// <p>This is a simple hero unit, a simple jumbotron-style component for
// calling extra attention to featured content or information.</p>
// <p><Button variant="primary">Learn more</Button></p>
// </Jumbotron>
// </div>
// );
// }
// }
// export default JumboTronComponent;

import React, { Component } from "react";
import { Jumbotron, Button } from "react-bootstrap";
class JumboTronComponent extends Component {
  constructor(props) {
    super(props);
  }
  render() {
    return (
      <div>
        <Jumbotron>
          <h1>Hello, world!</h1>
          {/* children depends on the name used in App.js */}
          <p>{this.props.children}</p>
        </Jumbotron>
      </div>
    );
  }
}
export default JumboTronComponent;
