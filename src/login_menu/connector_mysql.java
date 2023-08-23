package login_menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 
public class connector_mysql {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/witty_notes_database"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //show error from connection
        }
        return mysqlconfig;
    }    
}

