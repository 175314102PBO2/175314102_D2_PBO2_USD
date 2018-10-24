/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import static MODEL.Pasien.daftarPasienKlinik;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class RumahSakit {

    private String nama;
    private String alamat;

    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public Pasien cariPasien(String noRM) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (noRM == null ? daftarPasienKlinik.get(i).getNoRekamMedis() == null : noRM.equals(daftarPasienKlinik.get(i).getNoRekamMedis())) {
                return daftarPasienKlinik.get(i);
            }
        }
        //Jika data tidak ditemukan maka akan direturn null
        return null;
    }

    public void tambahPasienBaru(Pasien test) {

    }

    public void simpanDaftarPasien(File file) {

    }

    public void bacaDaftarPasien(File file) {

    }

    public void simpanObjekRumahSakit(File file) {

    }

    public void bacaObjekRumahSakit(File file) {

    }

    public ArrayList<Pasien> getDaftarpasien() {
        return daftarPasienKlinik;
    }

    public void setDaftarpasien(ArrayList<Pasien> daftarPasien) {

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

    public void tambahKlinik(Klinik klinik) {

    }

    public Klinik cariKlinik(String namaKlinik) {
        return null;
    }

    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {

    }

    public int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        return 0;
    }

    public void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {

    }

    public ArrayList<AntrianKlinik> getDaftarAntrianKlinik() {
        return null;

    }

    public void setDaftarAntrianKlinik(ArrayList<AntrianKlinik> daftarAntrianKlinik) {

    }

    public ArrayList<AntrianKlinik> getDaftarKlinik() {
        return null;

    }

    public void setDaftarKlinik(ArrayList<AntrianKlinik> daftarKlinik) {

    }

}
