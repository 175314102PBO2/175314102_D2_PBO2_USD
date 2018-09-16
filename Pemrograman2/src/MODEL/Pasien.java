/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Pasien {

    private String noRekamMedis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String nik;

    public static ArrayList<Pasien> daftarPasienKlinik =
            new ArrayList<Pasien>();

    public static void tambahPasienBaru(Pasien Pasien) {
        daftarPasienKlinik.add(Pasien);

    }
//dibawah ini adalah cara lain untuk cari pasien
//    public static Pasien cariPasien(String string) {
//        for (int i = 0; i <= daftarPasienKlinik.size();i++) {
//            if (daftarPasienKlinik.get(i).noRekamMedis== string) {
//                return daftarPasienKlinik.get(i);
//            }
//            
//        }
//        return null;
//    }
        public static Pasien cariPasien(String NoRM) {
        Pasien result = null;
        boolean found = false;
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).getNik().equals(NoRM)) {
                found = true;
                result = daftarPasienKlinik.get(i);
            }
        }
            return result;
    }

    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = noRekamMedis;
    }

    

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) throws NumberFormatException {
        if (noRekamMedis.toCharArray().length >= 6) {
            this.noRekamMedis = noRekamMedis;
        } else {
            throw new NumberFormatException("Nomor Rekam Medis Salah");
        }
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

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0 && tanggalLahir < 31) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception(" Salah ");
        }
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception{
          if (bulanLahir > 0 && bulanLahir < 13) {
            this.bulanLahir = bulanLahir;
        } else {
            throw new Exception(" Bulan Lahir Anda Tidak Terdeteksi "); 
        }
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

}
