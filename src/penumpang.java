
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
public class penumpang extends person {
    private String idPelanggan;
    private String noKtp;
    private Database trans;
    private Statement stmt = null;
    private Connection c = null;
    private ResultSet rs= null;

    public penumpang(String idPelanggan, String noKtp, String nama, String JK, int umur) {
        super(nama, JK, umur);
        this.idPelanggan = idPelanggan;
        this.noKtp = noKtp;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void insertPenumpang () throws SQLException{
        try{
            trans.buatKoneksi();
            String query ="INSERT INTO penumpang (idPelanggan, noKtp) "+
                    "VALUES ('"+idPelanggan+"','"+noKtp+"')";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
