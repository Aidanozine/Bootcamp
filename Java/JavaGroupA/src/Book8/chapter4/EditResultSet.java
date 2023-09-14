package Book8.chapter4;

import java.sql.*;

public class EditResultSet {
    public static void main(String[] args) {
        Connection con = getConnection();
        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            /*ResultSet rs = stmt.executeQuery("SELECT * FROM movie  WHERE id > 5");  //determines scope of ResultSet
            rs.absolute(2);
            rs.deleteRow();*/
            ResultSet rs = stmt.executeQuery("SELECT * FROM movie");  //determines scope of ResultSet
//            rs.absolute(6);
//            rs.updateInt("year", 1995);
//            rs.updateRow();
            rs.moveToInsertRow();
            rs.updateString("title", "Monte Python and the Holy Grail");
            rs.updateInt("year", 1975);
            rs.updateDouble("price", 13.95);
            rs.insertRow();
            rs.moveToCurrentRow();
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
