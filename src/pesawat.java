
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
public class pesawat {
    private String idPesawat;
    private String namaPesawat;
    private String jenis;
    private int tiket;
    private Database trans;
    private Statement stmt = null;
    private Connection c = null;
    private ResultSet rs= null;

    public pesawat(String idPesawat, String namaPesawat, String jenis, int tiket) {
        this.idPesawat = idPesawat;
        this.namaPesawat = namaPesawat;
        this.jenis = jenis;
        this.tiket = tiket;
    }

    public String getIdPesawat() {
        return idPesawat;
    }

    public String getNamaPesawat() {
        return namaPesawat;
    }

    public String getJenis() {
        return jenis;
    }

    public int getTiket() {
        return tiket;
    }
    
    public void insertPesawat () throws SQLException{
        try{
            trans.buatKoneksi();
            String query ="INSERT INTO pesawat (idPesawat, namaPesawat, jenis, tiket) "+
                    "VALUES ('"+idPesawat+"','"+namaPesawat+"','"+jenis+"','"+tiket+"')";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
