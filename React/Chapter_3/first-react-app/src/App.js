"use strict";

// import React, { Component } from "react";
// import Products from "./Products"; //Acts like const section
// import { Button } from 'react-bootstrap';
// class App extends Component {
//   render() {
//     return (
//       <div>
//         <Products />
//         <Button>Clickety Click</Button>
//       </div>
//     );
//   }
// }
// export default App;

// import React, { Component } from "react";
// import Products from "./Products"; //Acts like const section
// import { Button } from 'react-bootstrap';
// class App extends Component {
//   render() {
//     return (
//       <div>
//         <Products />
//         <Button variant="danger">Clickety Click</Button>
//       </div>
//     );
//   }
// }
// export default App;

// import React, { Component } from "react";
// import Products from "./Products"; //Acts like const section
// import { Button } from 'react-bootstrap';
// class App extends Component {
//   render() {
//     return (
//       <div>
//         <Products />
//         <Button variant="primary" disabled>Clickety Click</Button>
//       </div>
//     );
//   }
// }
// export default App;

// import React, { Component } from "react";
// import Products from "./Products"; //Acts like const section
// import { Button } from 'react-bootstrap';
// class App extends Component {
//   render() {
//     const isValid = true;
//     return (
//       <div>
//         <Products />
//         <Button variant="primary" disabled={!isValid}>Clickety Click</Button>
//       </div>
//     );
//   }
// }
// export default App;

import React, { Component } from "react";
import Rating from "./Rating";
class App extends Component {
  render() {
    return (
      <div>
        <Rating rating="1" />
        <Rating rating="2" />
        <Rating rating="3" />
        <Rating rating="4" />
        <Rating rating="5" />
      </div>
    );
  }
}
export default App;
