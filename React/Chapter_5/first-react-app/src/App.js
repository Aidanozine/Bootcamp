"use strict";

// import React, { Component } from "react";
// import Products from "./Products";
// class App extends Component {
//   render() {
//     return (
//       <div>
//         <Products />
//       </div>
//     );
//   }
// }
// export default App;

// import React, { Component } from "react";
// import JumboTronComponent from "./JumboTronComponent";
// class App extends Component {
//   render() {
//     return (
//       <div>
//         <JumboTronComponent>
//         "This is a long sentence, and I want to insert content into the
//           jumbotron component from the outside."
//         </JumboTronComponent>
//       </div>
//     );
//   }
// }
// export default App;

import React, { Component } from "react";
import JumboTronComponent from "./JumboTronComponent";
class App extends Component {
  render() {
    return (
      <div>
        {/* attribute can be any name */}
        <JumboTronComponent children="This is a long sentence, and I want to insert content into the
          jumbotron component from the outside."/>
      </div>
    );
  }
}
export default App;