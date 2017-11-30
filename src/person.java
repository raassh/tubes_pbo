
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
public class person {
    private String nama;
    private String JK;
    private int umur;
    private Database trans;
    private Statement stmt = null;
    private Connection c = null;
    private ResultSet rs= null;
    public person(String nama, String JK, int umur) {
        this.nama = nama;
        this.JK = JK;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getJK() {
        return JK;
    }

    public int getUmur() {
        return umur;
    }
    
    public void insertPerson () throws SQLException{
        try{
            trans.buatKoneksi();
            String query ="INSERT INTO person (nama, jeniskelamin, umur) "+
                    "VALUES ('"+nama+"','"+JK+"','"+umur+"')";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
