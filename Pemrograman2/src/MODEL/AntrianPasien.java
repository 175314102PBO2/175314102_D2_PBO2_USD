/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author RamaEka
 */
public class AntrianPasien {

    private int tanggalAntrian, bulanAntrian, tahunAntrian;
    private Klinik klinik;
    private Pasien daftarPasien[];

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

}
