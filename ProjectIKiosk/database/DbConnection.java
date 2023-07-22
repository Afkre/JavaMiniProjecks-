package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbConnection {//Super Class
    
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DATABASE_NAME = "ikiosk_bordkarte";
    private final String USER = "root";
    private final String PASSWORD = "";

    protected Connection connection = null;
    protected Statement statement = null;
    
    public DbConnection(){
                    //jdbc:mysql://localhost:3306/ikiosk_bordkarte
        String url = "jdbc:mysql://" + this.HOST + ":" + this.PORT + "/" + this.DATABASE_NAME;
        
        try {
            this.connection = DriverManager.getConnection(url, this.USER, this.PASSWORD);
            System.out.println("Connection ist erfolgreich");
        } catch (SQLException ex) {
            System.out.println("Connection ist nicht erfolgreich");
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    public Connection getConnection(){
        return connection;
    }
    
}
