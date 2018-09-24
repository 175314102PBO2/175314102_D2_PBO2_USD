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
    private int bulanLahir;
    private int TahunLahir;

    public Dokter(String NomorPegawai, String nama, String alamat, String tempatLahir, int tanggallahir, int bulanLahir, int TahunLahir) {
        this.NomorPegawai = NomorPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggallahir = tanggallahir;
        this.bulanLahir = bulanLahir;
        this.TahunLahir = TahunLahir;
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    public int getTahunLahir() {
        return TahunLahir;
    }

    public void setTahunLahir(int TahunLahir) {
        this.TahunLahir = TahunLahir;
    }
    
    

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

    public void setTanggallahir(int tanggallahir) throws Exception {
        if (tanggallahir > 0) {
            if (tanggallahir <= 31) {
            }
        } else {
            throw new Exception("Tanggal Tidak Terdeteksi...");
        }
    }

}
