//--------------------------------------------Chapter 16 =>
import axios from "axios";

class MovieDataService{
    
   getAll(page = 0){ 
     return axios.get(`https://moviesreview-backend.onrender.com/api/v1/movies?page=${page}`)
   }

   get(id){ 
     return axios.get(`https://moviesreview-backend.onrender.com/api/v1/movies/id/${id}`)
   }   

   find(query, by = "title", page = 0){
     return axios.get(`https://moviesreview-backend.onrender.com/api/v1/movies?${by}=${query}&page=${page}`)
   }       

   createReview(data){
     return axios.post("https://moviesreview-backend.onrender.com/api/v1/movies/review", data)
   }
   updateReview(data){
     return axios.put("https://moviesreview-backend.onrender.com/api/v1/movies/review", data)
   }
   deleteReview(id, userId){
     return axios.delete("https://moviesreview-backend.onrender.com/api/v1/movies/review",
        {data:{review_id: id, user_id: userId}}
     )
   }
   getRatings(){
     return axios.get("https://moviesreview-backend.onrender.com/api/v1/movies/ratings")
   }    
}
export default new MovieDataService()
//--------------------------------------------Chapter 16 <=