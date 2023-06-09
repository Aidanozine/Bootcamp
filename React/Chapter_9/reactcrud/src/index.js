import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import firebase from 'firebase/compat/app';
import 'firebase/compat/auth';
import 'firebase/compat/firestore';

var firebaseConfig = {
  apiKey: "AIzaSyAjEcufZpm5TIXy-MPTimL4h3F5daM2qDQ",
  authDomain: "crudproject-fe816.firebaseapp.com",
  projectId: "crudproject-fe816",
  storageBucket: "crudproject-fe816.appspot.com",
  messagingSenderId: "698868298743",
  appId: "1:698868298743:web:e8ed5975f39c69069034f2",
  measurementId: "G-L7RHQ8CNZY"
};
firebase.initializeApp(firebaseConfig);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
