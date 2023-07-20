import axios from "axios";

const BASE_URL = "http://localhost:5000/api/";

let token;
try {
    token = JSON.parse(JSON.parse(localStorage.getItem("persist:root")).user).currentUser.accessToken    
} catch(error) {
    token =" ";
}

export const publicRequest = axios.create({
  baseURL: BASE_URL,
});

export const userRequest = axios.create({
  baseURL: BASE_URL,
  headers: { token: `Bearer ${token}` },
});