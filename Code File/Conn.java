package travel.tourism.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                                      // "jdbc:mysql:///database_name", "username", "password"
            c = DriverManager.getConnection("jdbc:mysql://localhost/tms", "root", "rabbi162");
            s = c.createStatement();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

