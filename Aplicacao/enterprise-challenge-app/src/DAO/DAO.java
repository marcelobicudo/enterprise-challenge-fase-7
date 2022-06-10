package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection conn;

    public DAO () {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        openConnection();
        return this.conn;
    }
    private void openConnection() {
        try {
            if(this.conn == null) {
                this.conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm92248", "100702");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void closeConnection() {
        try {
            if(this.conn != null) {

                this.conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public int executeCommand(PreparedStatement stmt) {
        int j = 0;
        try {
            j = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            closeConnection();
        }
        return j;
    }

    public ResultSet getData(PreparedStatement stmt) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
