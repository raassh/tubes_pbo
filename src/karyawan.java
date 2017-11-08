
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
    
    
}
