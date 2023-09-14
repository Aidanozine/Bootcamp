package Book8.chapter4;

import java.sql.*;

public class SQLUpdate {
    private static Connection con;

    public static void main(String[] args) {
        loanMovie(1, "den Hoed", "Aidan");
    }

    private  static void loanMovie(int id, String lastName, String firstName){
        con = getConnection();
        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String Insert = "insert into friend (lastName, firstName, movieId) values (\"" + lastName + "\", \""
                    + firstName + "\", " +
                    + id + ")";
            int result = stmt.executeUpdate(Insert);
            if (result == 1){
                System.out.println("Loan recorded successfully");
            } else {
                System.out.println("Loan not recorded");
            }
            con.close();
        } catch(SQLException e){
            System.out.println(e);
            System.exit(0);
        }
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
}
