import { useState } from "react";
import WeatherInfo from "./WeatherInfo";
import axios from 'axios';

function WeatherApp() {
  const[cityName, setCityName] = useState("");
  const [weatherData, setWeatherData] = useState({})
  const changeCityInput =(e) =>{
     setCityName(e.target.value);
  }
    const fetchWeatherAPI = async() =>{
      const APIurl = `https://api.openweathermap.org/data/2.5/weather?q=${cityName}&units=metric&appid=7bd05afdd4be4ce2c4b00bdfdba3decc`;
      // const resp = await fetch(APIurl);
      // const respJson = await resp.json();
      const res = await axios.get(APIurl);
      setWeatherData(res.data);
      
       
    }
let handleMouseOut =(e) =>{
  
    fetchWeatherAPI();
}
  return (
    <>
   <div className="container">
   <div className="row">
       <div className="col-sm-4">
       <h3 className="text-center text-success"> React Weather App</h3>
       <div className="form-group">
         <input type="text" className="form-control" placeholder="Enter City Name" onChange={changeCityInput} onMouseOut={handleMouseOut} value={cityName}/>
       </div>
      {/* Weather app info*/}
      <WeatherInfo cityName={cityName} weatherData={weatherData}/>
      {/* Weather app info*/} 
       </div>
      
   </div>
   </div>
   </>
   
  );
}
export default WeatherApp;