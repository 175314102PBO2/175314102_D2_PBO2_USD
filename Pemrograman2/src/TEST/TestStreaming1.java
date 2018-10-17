/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import java.io.FileInputStream;

/**
 *
 * @author admin
 */
public class TestStreaming1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        String hasilBaca ="";
        fis = new FileInputStream(file);
        int dataInt;
        while(dataInt=fis.read())!=1){
        hasilBaca = hasilBaca+(char) dataInt;
    }
        System.out.println(hasilBaca);
    }
    }
}
