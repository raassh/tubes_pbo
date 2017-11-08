
import java.sql.Date;

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
    

}
