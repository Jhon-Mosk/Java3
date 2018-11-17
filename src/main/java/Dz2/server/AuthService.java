package Dz2.server;

import java.sql.*;

public class AuthService {

    private static Connection connection;
    private static Statement stmt;

    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:UserDB.db");
            stmt = connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static String getNickByLoginAndPass(String login, String pass) {

        String sql = String.format("select nickname FROM main where" +
                " login = '%s' and password = '%s'", login, pass);
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void setNickname (String newNickname, String login){
        try {
            String query = "UPDATE main SET nickname = ? where login = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newNickname);
            ps.setString(2, login);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void saveHistory(String login, String msg) {
        String sql = String.format("INSERT INTO history (post, nick) " +
                "VALUES ('%s', '%s')", msg, login);
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder getHistoryChat() {
        StringBuilder sb = new StringBuilder();
        String sql = String.format("SELECT nick, post FROM history ORDER BY id");
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                sb.append(rs.getString("nick") + " " + rs.getString("post") + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sb;
    }


    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
