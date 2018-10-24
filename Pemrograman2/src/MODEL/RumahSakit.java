/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import static MODEL.Pasien.daftarPasienKlinik;
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
}
