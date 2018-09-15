/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author ACER
 */
public class Dokter {
    private String NomorPegawai;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggallahir;

    public String getNomorPegawai() {
        return NomorPegawai;
    }

    public void setNomorPegawai(String NomorPegawai) {
        this.NomorPegawai = NomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(int tanggallahir) {
        this.tanggallahir = tanggallahir;
    }
    
}
