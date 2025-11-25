package Quiz.App;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class ScoreDAO {

    public void insertScore(String username, int score) {
        try {
            Connection con = DBconnection.getConnection();
            String sql = "INSERT INTO score(username, score) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setInt(2, score);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Insert Error: " + e.getMessage());
        }
    }
}

