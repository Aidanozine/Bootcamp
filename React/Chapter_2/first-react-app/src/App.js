"use strict";

// import React, { Component } from "react";
// import Products from "./Products"; //Acts like const section
// class App extends Component {
//   render() {
//     return (
//       <div>
//         <h1>My Second React App!</h1>
//         <Products />
//       </div>
//     );
//   }
// }
// export default App;

// import React, { Component } from "react";
// import Products from "./Products"; //Acts like const section
// class App extends Component {
//   formatName(user) {
//     return user.firstName + " " + user.lastName;
//   }
//   render() {
//     const user = {
//       firstName: "Greg",
//       lastName: "Lim",
//     };
//     return (
//       <div>
//         <h1>Hello, {this.formatName(user)}</h1>
//       </div>
//     );
//   }
// }
// export default App;

import React, { Component } from "react";
import Products from "./Products"; //Acts like const section
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