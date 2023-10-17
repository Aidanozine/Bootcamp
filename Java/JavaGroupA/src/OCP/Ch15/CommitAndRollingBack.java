package OCP.Ch15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CommitAndRollingBack {public static void main(String[] args) throws Exception {
    String url = "jdbc:hsqldb:file:zoo";
    var sql = "SELECT id, name FROM exhibits WHERE name = ?";
    try (Connection conn = DriverManager.getConnection(url);
         PreparedStatement ps = conn.prepareStatement(sql)) {

        conn.setAutoCommit(false);
        var elephantRowsUpdated = updateRow(conn, 5, "African Elephant");
        var zebraRowsUpdated = updateRow(conn, 5, "Zebra");
        if (!elephantRowsUpdated || !zebraRowsUpdated)
            conn.rollback();
        else {
            String selectSql = "SELECT COUNT(*) FROM exhibits WHERE num_acres <= 0";
            try (PreparedStatement prepstate = conn.prepareStatement(selectSql);
                 ResultSet rs = prepstate.executeQuery()) {
                rs.next();
                int count = rs.getInt(1);
                if (count == 0)
                    conn.commit();
                else
                    conn.rollback();
            }
        }
    }
}

    private static boolean updateRow(Connection conn, int numToAdd, String name) throws Exception {
        String updateSql = "UPDATE exhibits SET num_acres = num_acres + ? WHERE name = ?";
        try (PreparedStatement ps = conn.prepareStatement(updateSql)) {
            ps.setInt(1, numToAdd);
            ps.setString(2, name);
            return ps.executeUpdate() > 0;
        }
    }
}
