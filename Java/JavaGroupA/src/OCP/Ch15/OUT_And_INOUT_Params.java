package OCP.Ch15;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class OUT_And_INOUT_Params {
//    public static void main(String[] args) throws Exception {
//        String url = "jdbc:hsqldb:file:zoo";
//        var sql = "{?= call magic_number(?) }";
//        try (Connection conn = DriverManager.getConnection(url);
//             CallableStatement cs = conn.prepareCall(sql)) {
//             cs.registerOutParameter(1, Types.INTEGER);
//             cs.execute();
//             System.out.println(cs.getInt("num"));
//        }
//    }

    public static void main(String[] args) throws Exception {
        String url = "jdbc:hsqldb:file:zoo";
        var sql = "{call double_number(?)}";
        try (Connection conn = DriverManager.getConnection(url);
             CallableStatement cs = conn.prepareCall(sql)) {
             cs.setInt(1, 16);
             cs.registerOutParameter(1, Types.INTEGER);
             cs.execute();
             System.out.println(cs.getInt("num"));
        }
    }
}
