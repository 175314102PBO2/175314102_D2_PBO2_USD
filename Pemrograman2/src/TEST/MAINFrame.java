/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import VIEW.FrameUtama;
import javax.swing.JFrame;

/**
 *
 * @author melio
 */
public class MAINFrame {

    public static void main(String[] args) {
        FrameUtama tampilan = new FrameUtama();
        //Mengatur ukuran panel sebesar 400 dan 500
        tampilan.setSize(400, 500);        
        tampilan.setVisible(true);
        //Jika mengeklik tanda silang maka secara otomatis program akan berhenti
        tampilan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
