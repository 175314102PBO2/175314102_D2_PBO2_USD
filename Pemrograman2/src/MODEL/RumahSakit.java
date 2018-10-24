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
public class RumahSakit {
    private String nama;
    private String alamat;
   
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    private ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();

    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public static Pasien cariPasien(String noRM){
        return null;
     
    }
}
