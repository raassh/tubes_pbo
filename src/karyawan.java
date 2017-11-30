
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
public class karyawan extends person{
    private String idKaryawan;
    private String jabatan;
    private double gaji;
    private ArrayList<transaksi> daftarTransaksi=new ArrayList<>();
    private int jumTransaksi;
    private Database trans;
    private Statement stmt = null;
    private Connection c = null;
    private ResultSet rs= null;
    private Statement stmtup = null;
    private Connection cup = null;
    private ResultSet rsup= null;
    
    
    public karyawan(String idKaryawan, String nama, String JK, int umur) {
        super(nama, JK, umur);
        this.idKaryawan = idKaryawan;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getGaji() {
        return gaji;
    }
    
    public void addTransaksi(transaksi t) {
        daftarTransaksi.add(t);
    }

    public transaksi getDaftarTransaksi(int i) {
        return daftarTransaksi.get(i);
    }

    public int getJumTransaksi() {
        return jumTransaksi;
    }
    
    public void insertKaryawan () throws SQLException{
        try{
            trans.buatKoneksi();
            String query ="INSERT INTO karyawan (idKaryawan, jabatan, gaji, idmanager) "+
                    "VALUES ('"+idKaryawan+"','"+jabatan+"','"+gaji+"','"+idmanager+"')";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void updateKaryawan(){
        try {
            trans.buatKoneksi();
            String query = "UPDATE karyawan set pass ='"+pass+"' where username='"+username+"'";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
