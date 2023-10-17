package OCP.Ch15;

import java.sql.*;

public class MyFirstDatabaseConnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement ps = conn.prepareStatement(
                     "SELECT name FROM exhibits");
             ResultSet rs = ps.executeQuery()) {
            System.out.println(conn);
            while (rs.next())
                System.out.println(rs.getString(1));
        }
    }
}
//class TestExternal { //doesn't function --> no postgresql
//    public static void main(String[] args) throws SQLException {
//        try (Connection conn = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5432/ocp-book",
//                "username",
//                "Password20182")) {
//            System.out.println(conn);
//        } } }
