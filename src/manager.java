
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TOSHIBA
 */
public class manager extends person {
    private String idManager;
    private double gaji;
    private ArrayList<karyawan> daftarKaryawan;
    private Database trans;
    private Statement stmt = null;
    private Connection c = null;
    private ResultSet rs= null;
    public manager(String idManager, String nama, String JK, int umur) {
        super(nama, JK, umur);
        this.idManager = idManager;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getIdManager() {
        return idManager;
    }
    
    public void addKaryawan(karyawan k) {
        daftarKaryawan.add(k);
    }
    public void insertManager () throws SQLException{
        try{
            trans.buatKoneksi();
            String query ="INSERT INTO manajer (idmanager, gaji, karyawan) "+
                    "VALUES ('"+idManager+"','"+gaji+"','"+daftarKaryawan+"')";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
