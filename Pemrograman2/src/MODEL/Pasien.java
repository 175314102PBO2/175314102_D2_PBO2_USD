/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

    public Pasien() {

    }

    public Pasien(String noRekamMedis, String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.nik = nik;
    }

    public Pasien(String nama) {
        this.nama = nama;
    }

    public static void tambahPasienBaru(Pasien Pasien) {
        daftarPasienKlinik.add(Pasien);
    }

    @Override
    public String toString() {
        return nama + "\t" + alamat + "\n";
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
    public static Pasien cariPasien(String noRM) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            // jika norekam = daftarPasienKlinik yang memanggil fetNoRekamMedis maka
            // daftarPasienKlinik.get(i) akan direturn ke method cariPasien
            if (noRM == null ? daftarPasienKlinik.get(i).getNoRekamMedis() == null
                    : noRM.equals(daftarPasienKlinik.get(i).getNoRekamMedis())) {
                return daftarPasienKlinik.get(i);
            }
        }
        //Jika data tidak ditemukan maka akan direturn null
        return null;
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

    public void setNik(String nik) throws Exception {
        if (this.nik.length() == 16) {
            this.nik = nik;
        } else {
            throw new Exception("NIK terdiri dari 16 digit");
        }
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

    public void setBulanLahir(int bulanLahir) throws Exception {
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

    public static void simpanDaftarPasien(File file) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, true);
            for (int i = 0; i < daftarPasienKlinik.size(); i++) {
                String data = daftarPasienKlinik.get(i).toString();
                fos.write(data.getBytes());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        Pasien tampung = new Pasien();
        boolean nama = false;
        boolean alamat = false;
        String hasil = "";
        int data;
        try {
            fis = new FileInputStream(file);
            while ((data = fis.read()) > 0) {
                if ((char) data != '\n') {
                    if ((char) data != '\t') {
                        hasil = hasil + daftarPasienKlinik.add(tampung);
                    } else if (nama = false) {
                        tampung.setNama(hasil);
                        nama = true;
                        hasil = "";
                    }
                } else if (alamat = false) {
                    tampung.setAlamat(hasil);
                    alamat = true;
                    hasil = "";
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Object getDaftarPasien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
