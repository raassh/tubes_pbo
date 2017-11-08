/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TOSHIBA
 */
public class person {
    private String nama;
    private String JK;
    private int umur;

    public person(String nama, String JK, int umur) {
        this.nama = nama;
        this.JK = JK;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getJK() {
        return JK;
    }

    public int getUmur() {
        return umur;
    }
    
    
}
