"use strict";

// import React, { Component } from "react";
// import Rating from "./Rating";
// class App extends Component {
//   render() {
//     return (
//       <div>
//         <Rating rating="1" />
//         <Rating rating="2" />
//         <Rating rating="3" />
//         <Rating rating="4" />
//         <Rating rating="5" />
//       </div>
//     );
//   }
// }
// export default App;

import React, { Component } from "react";
import Products from "./Products";
class App extends Component {
  render() {
    return (
      <div>
        <Products />
      </div>
    );
  }
}
export default App;
