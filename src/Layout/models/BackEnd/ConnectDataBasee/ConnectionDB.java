package Layout.models.BackEnd.ConnectDataBasee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {
    private static final Logger LOGGER = Logger.getLogger(ConnectionDB.class.getName());

    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DEFAULT_DB_NAME = "data_base_java";
    private static final String USER = "root";
    private static final String PASS = "1234";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private Connection conn;
    private Statement stmt;

    public ConnectionDB() {
        this(DEFAULT_DB_NAME, USER, PASS);
    }

    public ConnectionDB(String dbName, String username, String password) {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(DB_URL + dbName, username, password);
            stmt = conn.createStatement();
            LOGGER.log(Level.INFO, "Connected to database: {0}", dbName);
        } catch (ClassNotFoundException | SQLException ex) {
            LOGGER.log(Level.SEVERE, "Failed to connect to database", ex);
        }
    }

    public ResultSet executeQuery(String query) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(query);
            LOGGER.log(Level.INFO, "Query executed successfully: {0}", query);
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error executing query", ex);
        }
        return rs;
    }

    public boolean executeUpdate(String query) {
        try {
            stmt.executeUpdate(query);
            LOGGER.log(Level.INFO, "Update executed successfully: {0}", query);
            return true;
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error executing update", ex);
            return false;
        }
    }

    public void close() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
                LOGGER.info("Connection closed.");
            }
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Failed to close connection", ex);
        }
    }

    public PreparedStatement prepareStatement(String query) throws SQLException {
        return conn.prepareStatement(query);
    }

}
