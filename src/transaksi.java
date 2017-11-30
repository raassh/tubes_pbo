
import java.sql.Connection;
import java.sql.Date;
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
public class transaksi {
    private Date hariTanggal;
    private penumpang dataPenumpang;
    private jadwal dataPerjalanan;
    private karyawan karyawan;
    private Database trans;
    private Statement stmt = null;
    private Connection c = null;
    private ResultSet rs= null;

    public void setHariTanggal(Date hariTanggal) {
        this.hariTanggal = hariTanggal;
    }

    public Date getHariTanggal() {
        return hariTanggal;
    }

    
    public penumpang getDataPenumpang() {
        return dataPenumpang;
    }

    public jadwal getDataPerjalanan() {
        return dataPerjalanan;
    }
    
    public void insertTransaksi () throws SQLException{
        try{
            trans.buatKoneksi();
            String query ="INSERT INTO transaksi (hariTanggal, dataPenumpang,dataPerjalanan, karyawan) "+
                    "VALUES ('"+ hariTanggal+"','"+dataPenumpang+"','"+dataPerjalanan+"','"+karyawan+"')";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

}
