/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import static MODEL.Pasien.daftarPasienKlinik;
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
        return null;
    }

    public void tambahPasienBaru(Pasien test) {
        daftarPasienKlinik.add(test);
    }

    public void simpanDaftarPasien(File file) {
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

    public void bacaDaftarPasien(File file) {
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
