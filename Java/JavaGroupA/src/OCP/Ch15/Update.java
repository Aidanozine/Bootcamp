package OCP.Ch15;

import java.sql.*;

public class Update {
    static Connection conn2;
        public static void main(String[] args) throws Exception {
            String url = "jdbc:hsqldb:file:zoo";
            try (Connection conn = DriverManager.getConnection(url);) {
                conn2 = conn;
                var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
                 var updateSql = "UPDATE exhibits SET name = '' " + "WHERE name = 'None'";
                 var deleteSql = "DELETE FROM exhibits WHERE id = 10";
                 var updateSql2 = "UPDATE names SET name = 'Elizabeth' " + "WHERE name = 'Elsa' ";

                var sql = "SELECT * FROM exhibits";
//                try (var ps = conn.prepareStatement(sql);
//                     ResultSet rs = ps.executeQuery() ) {
//                    while(rs.next()){
//                        System.out.println(rs.getString(3));
//                    }
//                }
//                try (var ps = conn.prepareStatement(updateSql2);){
//                     int r = ps.executeUpdate();
//                    System.out.println(r);
//                }

//                try (var ps = conn.prepareStatement(insertSql)) {
//                    int result = ps.executeUpdate();
//                    System.out.println(result); // 1
//                }
//
//                try (var ps = conn.prepareStatement(updateSql)) {
//                    int result = ps.executeUpdate();
//                    System.out.println(result); // 0
//                }

//                try (var ps = conn.prepareStatement(deleteSql)) { //Comment-out first 2+3 before running with delete
//                    int result = ps.executeUpdate();
//                    System.out.println(result); // 1
//                }

                 sql = "SELECT * FROM names";
                try (var ps = conn.prepareStatement(sql);
                     ResultSet rs = ps.executeQuery() ) {
                    while(rs.next()){
                        System.out.println(rs.getString(3));
                    }
                }
//                getResult(insertSql);
//                getResult(updateSql);
//                getResult(deleteSql);
//                getResult(updateSql2);
//                getResult("SELECT * FROM exhibits");
//                getResult("SELECT * FROM names");
//                var sql2 = "SELECT * FROM names"; // causes exception
//                try (var ps = conn.prepareStatement(sql2)) {
//                    var result = ps.executeUpdate();
//                }

                register(conn, 7, 2, "Allan");
                getResult("SELECT * FROM names");
            }
        }
    public static void getResult(String s) throws Exception {
            try (var ps = conn2.prepareStatement(s)){
                boolean isResultSet = ps.execute();
                if (isResultSet) {
                    try (ResultSet rs = ps.getResultSet()) {
                        System.out.println("ran a query");
                        while(rs.next()){
                            System.out.println(rs.getString(3));
                        }
                    }
                } else {
                    int result = ps.getUpdateCount();
                    System.out.println("ran an update");
                }
            }
    }

    public static void register(Connection conn, int key,
 int type, String name) throws SQLException {

         String sql = "INSERT INTO names VALUES(?, ?, ?)";

         try (PreparedStatement ps = conn.prepareStatement(sql)) {
             ps.setInt(1, key);
             ps.setString(3, name);
             ps.setInt(2, type);
             ps.executeUpdate();
             }
         }
}
