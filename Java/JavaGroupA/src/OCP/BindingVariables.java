package OCP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BindingVariables {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:hsqldb:file:zoo";
        var sql = "SELECT id, name FROM exhibits WHERE name = ?"; //important to SELECT what you want to display
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "Zebra");
            try (var rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    System.out.println(id);
                    System.out.println(name);
                }
            }
        }
    }
}
