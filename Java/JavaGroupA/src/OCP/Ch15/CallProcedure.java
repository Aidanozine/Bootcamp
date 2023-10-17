package OCP.Ch15;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallProcedure {
//    public static void main(String[] args) throws Exception { //without params
//        String url = "jdbc:hsqldb:file:zoo";
//        String sql = "{call read_e_names()}";
//        try (Connection conn = DriverManager.getConnection(url);
//             CallableStatement cs = conn.prepareCall(sql);
//             ResultSet rs = cs.executeQuery()) {
//                 while (rs.next()) {
//                     System.out.println(rs.getString(3));
//                 }
//
//             }
//    }

    public static void main(String[] args) throws Exception { //with params
        String url = "jdbc:hsqldb:file:zoo";
        String sql = "{call read_names_by_letter(?)}";
        try (Connection conn = DriverManager.getConnection(url);
             CallableStatement cs = conn.prepareCall(sql)){
            cs.setString("prefix", "Z");
            try (var rs = cs.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString(3));
                }
            }
        }
    }
}
