package Quiz.App;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ScoreDAO {

    public void insertScore(String name, int score) {

        String query = "INSERT INTO score(username, score) VALUES (?, ?)";

        try (Connection con = DBconnection.getConnection()) {

            if (con == null) {
                System.out.println("Connection not available. Score not saved.");
                return;
            }

            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setString(1, name);
                ps.setInt(2, score);
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println("Score insert failed");
        }
    }
}
