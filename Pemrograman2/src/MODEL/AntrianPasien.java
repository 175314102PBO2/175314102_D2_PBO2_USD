/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;
 
import java.util.ArrayList;

public class AntrianPasien {
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private static ArrayList<Pasien> daftarPasienAntri = new ArrayList<>();
    public static ArrayList<AntrianPasien> daftarAntrian = new ArrayList<AntrianPasien>();
    
    
//    public static void Mendaftar(Pasien pasien, int Bulan, int Tahun){
//        Pasien.tambahPasienBaru(pasien);
//    }
//    public AntrianPasien cariPasien(String noRM){
//        Pasien[] p = getDaftarPasienAntri();
//        
//        return null;
//    }
//    public static Pasien cariPasien(String noRM, int Tanggal, int Bulan, int Tahun){
//     return null;   
//    }
//    public static void buatAntrian (int Tanggal, int Bulan, int Tahun, Klinik klinik){
//        
//    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasienAntri() {
        return daftarPasienAntri;
    }

    public void setDaftarPasienAntri(Pasien[] daftarPasienAntri) {
        this.daftarPasienAntri = daftarPasienAntri;
    }

}
