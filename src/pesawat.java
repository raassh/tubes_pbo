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
    
    
}
