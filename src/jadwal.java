
import java.sql.Connection;
import java.sql.Date;
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
public class jadwal {
    private String idPenerbangan;
    private Date departure;
    private Date arrival;
    private rute rutePerjalanan;
    private pesawat dataPesawat;
    private double harga;
    private Database trans;
    private Statement stmt = null;
    private Connection c = null;
    private ResultSet rs= null;
    
    public jadwal(String idPenerbangan, Date departure, Date arrival, rute rutePerjalanan, pesawat dataPesawat, double harga) {
        this.idPenerbangan = idPenerbangan;
        this.departure = departure;
        this.arrival = arrival;
        this.rutePerjalanan = rutePerjalanan;
        this.dataPesawat = dataPesawat;
        this.harga = harga;
    }
    
    
    public void setIdPenerbangan(String idPenerbangan) {
        this.idPenerbangan = idPenerbangan;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getIdPenerbangan() {
        return idPenerbangan;
    }

    public Date getDeparture() {
        return departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public rute getRutePerjalanan() {
        return rutePerjalanan;
    }

    public pesawat getDataPesawat() {
        return dataPesawat;
    }
    public double getHarga() {
        return harga;
    }
    
    public void insertJadwal () throws SQLException{
        try{
            trans.buatKoneksi();
            String query ="INSERT INTO jadwal (idPenerbangan, departure,arrival, rutePerjalanan, dataPesawat, harga) "+
                    "VALUES ('"+idPenerbangan+"','"+departure+"','"+arrival+"','"+rutePerjalanan+"','"+dataPesawat+"','"+harga+"')";
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            c.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

}
