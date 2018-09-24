/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AntrianPasien {

    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private static ArrayList<Pasien> daftarPasienAntri = new ArrayList<>();
    public static ArrayList<AntrianPasien> daftarAntrian = new ArrayList<AntrianPasien>();

    public AntrianPasien() {
    }

    public AntrianPasien(int tanggalAntrian, int bulanAntrian) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
    }

    public int getTanggalAntrian() {
        //Pengembalian tanggalAntrian kepada method pemanggil getTanggalAntrian()
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        //tanggalAntrian dari variabel global sama dengan tanggalAntrian dari variabel lokal
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        //Pengembalian bulanAntrian kepada method pemanggil getBulanAntrian()
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {
        //bulanAntrian dari variabel global sama dengan bulanAntrian dari variabel lokal
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAntrian() {
        //Pengembalian tahunAntrian kepada method pemanggil getTahunAntrian()
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        //tahunAntrian dari variabel global sama dengan tahunAntrian dari variabel lokal
        this.tahunAntrian = tahunAntrian;
    }

    public Klinik getKlinik() {
        //Pengembalian klinik kepada method pemanggil getKlinik()
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        //klinik dari variabel global sama dengan klinik dari variabel lokal
        this.klinik = klinik;
    }

    public ArrayList<Pasien> getDaftarPasienAntri() {
        //Pengembalian daftarPasienAntri kepada method pemanggil getDaftarPasien()
        return daftarPasienAntri;
    }

    public void Mendaftar(Pasien pasien) {
        //daftarPasien memasukkan data array dengan add pasien
        daftarPasienAntri.add(pasien);
    }

    public Pasien PanggilPasein(int nomorPanggil) {
        //Pengembalian daftarPasienAntri yang memanggi data ke nomorPanggil
        return daftarPasienAntri.get(nomorPanggil);
    }

    public static int cariPasien(int tanggal, int bulan, int tahun, Klinik klinik) {
        // Pasien cari = new Pasien();
        for (int i = 0; i < daftarPasienAntri.size(); i++) {
            if (tanggal == daftarPasienAntri.get(i).getTanggalLahir()
                    && bulan == daftarPasienAntri.get(i).getBulanLahir()
                    && tahun == daftarPasienAntri.get(i).getTahunLahir()
                    && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())
                    && daftarAntrian.get(i).getKlinik().getNama().equalsIgnoreCase(klinik.getNama())) {
                return i;
            }
        }
        return -1;
    }

    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        AntrianPasien antrian = new AntrianPasien();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        if (cariPasien(tanggal, bulan, tahun, klinik) >= 0) {
            daftarAntrian.add(antrian);
        } else {
            JOptionPane.showMessageDialog(null, "Antrian Sudah Ada !");
        }

    }
}
