package MainMenu;

import VIEW.BukuView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JButton ButtonDataBuku;
    private JButton ButtonDataPembeli;
    private JButton ButtonDataTransaksi;
    private JPanel Pmenu;
    JFrame frame = new JFrame("SunBook Desktop APP");



    public Menu() {
        frame.add(Pmenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 720);
        frame.setVisible(true);
        frame.setResizable(false);

        ButtonDataBuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BukuView().setVisible(true);

            }
        });
    }


    public static void main(String[] args) {
        new Menu();
    }
}