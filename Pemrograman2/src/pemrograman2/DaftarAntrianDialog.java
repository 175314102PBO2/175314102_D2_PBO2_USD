/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman2;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarAntrianDialog extends JDialog{
    private JLabel NamaLabel;
    private JLabel JudulLabel;
    private JTextField NamaText;
    private JButton SaveButton;

    public DaftarAntrianDialog() {
        init();
    }
    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }
    public void init() {
        this.setLayout(null);
        JudulLabel = new JLabel (" DAFTAR NAMA PASIEN ");
        JudulLabel.setBounds(50, 100, 20, 10);
        
        this.add(JudulLabel);
        NamaLabel = new JLabel("Nama");
        NamaLabel.setBounds(50, 250, 50, 10);
        this.add(NamaLabel);
    }
}
    

