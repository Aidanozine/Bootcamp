package Book8.chapter4;

import java.sql.*;
import java.text.NumberFormat;

public class ListMovies {

    private static Connection con;

    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        ResultSet movie = getMovies();
        try {
            while (movie.next()){
                Movie m = getMovie(movie);
                String msg = Integer.toString(m.year);
                msg += ": " + m.title;
                msg += " (" + cf.format(m.price) + ")";
                System.out.println(msg);
            }
        } catch(SQLException e){
            System.out.println(e);
        } try {
            con.close();
            System.out.println("Connection severed");
        } catch(Exception e){
            System.out.println("Failed to disconnect");
        }
    }

    private static ResultSet getMovies(){
        con = getConnection();
        try {
            Statement s = con.createStatement();
            String select = "Select title, year, price from movie order by year";
            ResultSet rows;
            rows = s.executeQuery(select);
            return rows;
        } catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }

    private static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Movies";
            String user = "root";
            String pw = "password";
            con = DriverManager.getConnection(url, user, pw);
        } catch(ClassNotFoundException e){
            System.out.println(e);
            System.exit(0);
        } catch(SQLException e){
            System.out.println(e);
            System.exit(0);
        }
        return con;
    }

    private static Movie getMovie(ResultSet movie){
        try {
            String title = movie.getString("Title");
            int year = movie.getInt("Year");
            Double price = movie.getDouble("Price");
            return new Movie(title, year, price);
        } catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }

    private static class Movie{
        public String title;
        public int year;
        public Double price;
        public Movie(String title, int year, Double price){
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}
