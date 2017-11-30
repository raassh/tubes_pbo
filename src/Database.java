
import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TOSHIBA
 */
public class Database {
    private Statement stmt = null;
    private Connection c = null;
    private ResultSet rs= null;
    
    public void buatKoneksi() {
        try{
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tiketpesawat","root","");
            stmt=c.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void disconnect() throws SQLException{
        c.close();
    }
}

