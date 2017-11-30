
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
public class kelas {
    private String namaKelas;
    private int harga;
    private Database trans;
    private Statement stmt = null;
    private Connection c = null;
    private ResultSet rs= null;

    public kelas(String namaKelas, int harga) {
        this.namaKelas = namaKelas;
        this.harga = harga;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public int getHarga() {
        return harga;
    }
    public void insertKelas () throws SQLException{
        try{
            trans.buatKoneksi();
            String query ="INSERT INTO kelas (namaKelas, harga) "+
                    "VALUES ('"+namaKelas+"','"+harga+"')";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
