/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author admin
 */
public class FrameUtama extends JFrame implements ActionListener {

    private JMenuBar MenuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem TambahPasien;
    private JMenuItem TambahAntrian;

    public FrameUtama() {
        init();
    }

    public void init() {
        //membuat menuBar dengan nama Pasien
        MenuBar = new JMenuBar();
        fileMenu = new JMenu("Pasien");

        MenuBar.add(fileMenu);
        this.setJMenuBar(MenuBar);
        //menambah MenuBar dengan ini TambahPasien, TambahAntrian, exitMenuItem
        exitMenuItem = new JMenuItem("Exit");
        TambahPasien = new JMenuItem("Tambah Pasien Baru");
        TambahAntrian = new JMenuItem("Tambah Antrian");

        fileMenu.add(TambahPasien);
        fileMenu.add(TambahAntrian);
        fileMenu.add(exitMenuItem);
        MenuBar.add(fileMenu);

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        TambahPasien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TambahPasienBaruDialog tampil = new TambahPasienBaruDialog();
                tampil.setSize(400, 500);
                tampil.setVisible(true);
            }
        });
        TambahAntrian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TambahAntrianDialog tampil = new TambahAntrianDialog();
                tampil.setSize(400, 500);
                tampil.setVisible(true);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
