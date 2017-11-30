
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TOSHIBA
 */
public class rute {
    private String asal;
    private String tujuan;
    private Database trans;
    private Statement stmt = null;
    private Connection c = null;
    private ResultSet rs= null;

    public rute(String asal, String tujuan) {
        this.asal = asal;
        this.tujuan = tujuan;
    }

    
    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
    public void insertRute () throws SQLException{
        try{
            trans.buatKoneksi();
            String query ="INSERT INTO rute (asal, tujuan) "+
                    "VALUES ('"+asal+"','"+tujuan+"')";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
