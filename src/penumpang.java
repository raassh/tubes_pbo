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

    
    
}
