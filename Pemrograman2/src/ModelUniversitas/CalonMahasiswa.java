/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelUniversitas;

/**
 *
 * @author ACER
 */
public class CalonMahasiswa {
    private String NIK;
    private String nama;

    public CalonMahasiswa() {
    }

    public CalonMahasiswa(String NIK, String nama) {
        this.NIK = NIK;
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
