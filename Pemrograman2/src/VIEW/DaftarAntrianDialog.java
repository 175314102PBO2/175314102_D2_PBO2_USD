/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarAntrianDialog extends JFrame implements ActionListener{
    private JMenuBar MenuBar;
    private JMenu FileMenu;
    private JMenuItem ExitMenuItem;
    private JMenuItem TambahPasienMenu;
    private JLabel NamaLabel;
    private JLabel JudulLabel;
    private JLabel AlamatLabel;
    private JLabel NoRekamMedisLabel;
    private JTextField NoRekamMedisText;
    private JTextField AlamatText;
    private JTextField JudulText;
    private JTextField NamaText;
    private JButton SaveButton;

    public DaftarAntrianDialog() {
        init();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == ExitMenuItem){
            System.exit(0);
        }
        if(ae.getSource() == TambahPasienMenu){
            this.setLayout(null);
            JudulLabel = new JLabel(" Pasien Baru ");
            JudulLabel.setBounds(150, 10, 200, 10);
            this.add(JudulLabel);
            
        }
    }
    
    public void init() {
        MenuBar = new JMenuBar();
        this.setTitle(" PASIEN RUMAH SAKIT ");
        
        FileMenu = new JMenu(" File ");
        ExitMenuItem = new JMenuItem(" Exit ");
        TambahPasienMenu = new JMenuItem(" Tambah Pasien Baru ");
        FileMenu.add(TambahPasienMenu);
        FileMenu.add(ExitMenuItem);
        MenuBar.add(FileMenu);
        
        ExitMenuItem.addActionListener(this);
        TambahPasienMenu.addActionListener(this);
        
        this.setJMenuBar(MenuBar);
        
        this.setLayout(null);
        JudulLabel = new JLabel (" DAFTAR NAMA PASIEN ");
        JudulLabel.setBounds(98, 10, 200, 10); 
        this.add(JudulLabel);
        
        NamaLabel = new JLabel(" NAMA ");
        NamaLabel.setBounds(10, 40, 50, 25);
        this.add(NamaLabel);
        
        NamaText = new JTextField();
        NamaText.setBounds(70, 40, 100, 25);
        this.add(NamaText);
        
        
        NoRekamMedisLabel = new JLabel (" NOMOR REKAM MEDIS   ");
        NoRekamMedisLabel.setBounds(10, 70, 300, 25);
        this.add(NoRekamMedisLabel);
        
        NoRekamMedisText = new JTextField();
        NoRekamMedisText.setBounds(150, 70, 200, 25);
        this.add(NoRekamMedisText);
        
        AlamatLabel = new JLabel (" ALAMAT ");;
        AlamatLabel.setBounds(10, 90, 60, 25);
        this.add(AlamatLabel);
        
        AlamatText = new JTextField();
        AlamatText.setBounds(80, 90, 60, 25);
        this.add(AlamatText);
        
        SaveButton = new JButton(" SIMPAN ");
        SaveButton.setBounds(150, 150, 90, 30);
        this.add(SaveButton);
        
    }

    
}
    

