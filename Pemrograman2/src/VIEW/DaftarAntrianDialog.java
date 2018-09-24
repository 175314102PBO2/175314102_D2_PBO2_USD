/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import MODEL.Pasien;
import java.awt.Color;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class DaftarAntrianDialog extends JFrame implements ActionListener {

    private JMenuBar MenuBar;
    private JMenu FileMenu;
    private JMenuItem ExitMenuItem;
    private JMenuItem TambahPasienMenu;
    private JLabel NamaLabel;
    private JLabel JudulLabel;
    private JLabel AlamatLabel;
    private JLabel Tanggallahir;
    private JLabel TempatLahir;
    private JLabel bulanlahir;
    private JLabel tahunlahir;
    private JLabel jeniskelamin;
    private JLabel NoRekamMedisLabel;
    private JTextField NoRekamMedisText;
    private JTextField AlamatText;
    private JTextField JudulText;
    private JTextField NIKText;
    private JTextField TempatLahirText;
    private JTextField NamaText;
    private JComboBox TanggalLahir, BulanLahir, TahunLahir, JenisKelamin;
    private JButton SaveButton;
    private Pasien Pasien;

    public DaftarAntrianDialog() {
        init();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == ExitMenuItem) {
            System.exit(0);
        }
        if (ae.getSource() == TambahPasienMenu) {
            this.setLayout(null);
            MODEL.Pasien.tambahPasienBaru(Pasien);
            JudulLabel = new JLabel(" Pasien Baru ");
            JudulLabel.setBounds(150, 10, 200, 10);
            this.add(JudulLabel);

        }
    }

    public void init() {
        MenuBar = new JMenuBar();
        this.setTitle(" PASIEN RUMAH SAKIT ");
        this.MenuBar.setBackground(Color.yellow);

        FileMenu = new JMenu(" File ");
        ExitMenuItem = new JMenuItem(" Exit ");
        TambahPasienMenu = new JMenuItem(" Tambah Pasien ");
        FileMenu.add(TambahPasienMenu);
        FileMenu.add(ExitMenuItem);
        MenuBar.add(FileMenu);

        ExitMenuItem.addActionListener(this);
        TambahPasienMenu.addActionListener(this);

        this.setJMenuBar(MenuBar);

        this.setLayout(null);
        JudulLabel = new JLabel(" DAFTAR NAMA PASIEN ");
        JudulLabel.setBounds(150, 10, 200, 10);
        this.add(JudulLabel);

        NamaLabel = new JLabel(" NAMA ");
        NamaLabel.setBounds(10, 40, 50, 25);
        this.add(NamaLabel);

        NamaText = new JTextField();
        NamaText.setBounds(70, 40, 100, 25);
        this.add(NamaText);

        NoRekamMedisLabel = new JLabel(" NOMOR REKAM MEDIS   ");
        NoRekamMedisLabel.setBounds(10, 70, 300, 25);
        this.add(NoRekamMedisLabel);

        NoRekamMedisText = new JTextField();
        NoRekamMedisText.setBounds(150, 70, 200, 25);
        this.add(NoRekamMedisText);

        JLabel TanggallahirLabel = new JLabel(" Tanggal ");
        TanggallahirLabel.setBounds(10, 80, 200, 65);
        this.add(TanggallahirLabel);

        JComboBox TanggalLahir = new JComboBox();
        for (int i = 1; i <= 31; i++) {
            TanggalLahir.addItem(i);
        }
        TanggalLahir.setBounds(80, 100, 67, 20);
        this.add(TanggalLahir);

        bulanlahir = new JLabel(" Bulan ");
        bulanlahir.setBounds(150, 80, 200, 65);
        this.add(bulanlahir);

        JComboBox bulanlahir = new JComboBox();
        bulanlahir.addItem(" Januari ");
        bulanlahir.addItem(" Febuari ");
        bulanlahir.addItem(" Maret ");
        bulanlahir.addItem(" April ");
        bulanlahir.addItem(" May ");
        bulanlahir.addItem(" Juni ");
        bulanlahir.addItem(" Juli ");
        bulanlahir.addItem(" Agustus ");
        bulanlahir.addItem(" September ");
        bulanlahir.addItem(" October ");
        bulanlahir.addItem(" November ");
        bulanlahir.addItem(" December ");
        bulanlahir.setBounds(190, 100, 80, 20);
        this.add(bulanlahir);

        tahunlahir = new JLabel(" Tahun ");
        tahunlahir.setBounds(270, 80, 100, 65);
        this.add(tahunlahir);

        JComboBox TahunLahir = new JComboBox();
        for (int i = 1960; i <= 2019; i++) {
            TahunLahir.addItem(i);
        }
        TahunLahir.setBounds(310, 100, 67, 20);
        this.add(TahunLahir);

        jeniskelamin = new JLabel(" Jenis Kelamin ");
        jeniskelamin.setBounds(10, 110, 100, 65);
        this.add(jeniskelamin);

        JComboBox JenisKelamin = new JComboBox();
        JenisKelamin.addItem(" Laki-Laki ");
        JenisKelamin.addItem(" Perempuan ");
        JenisKelamin.setBounds(100, 130, 100, 20);
        this.add(JenisKelamin);

        AlamatLabel = new JLabel(" ALAMAT ");;
        AlamatLabel.setBounds(10, 200, 60, 25);
        this.add(AlamatLabel);

        AlamatText = new JTextField();
        AlamatText.setBounds(80, 200, 200, 100);
        this.add(AlamatText);

        SaveButton = new JButton(" SIMPAN ");
        SaveButton.setBounds(150, 310, 90, 30);
        this.add(SaveButton);
        SaveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                Pasien pas = new Pasien(NamaText.getText(), AlamatText.getText(), TempatLahirText.getText(), TanggalLahir.getSelectedIndex(),
                        bulanlahir.getSelectedIndex(), TahunLahir.getSelectedIndex(), NIKText.getText());
            }
        });

    }

}
