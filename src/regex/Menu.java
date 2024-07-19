/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regex;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * @author Mahdiyar
 */
public class Menu extends JPanel implements ActionListener {
    int Width = 1200;
    int height = 600;
    int WidthBtn = 180;
    int HeightBtn = 60;
    JButton Type;
    Desktop desk;
    JButton previews;
    BufferedImage image;
    Image image01;
    BufferedImage KontaktIcon;
    BufferedImage TypeIcon;
    BufferedImage ExitIcon;
    BufferedImage Previous;

    int widthBtn;
    int heightBtn;
    JButton Kontakt;
    JButton Exit;
    int ExitRes;

    Menu() {
        try {
            image01 = ImageIO.read(new File("Menu.jpg"));
            KontaktIcon = ImageIO.read(new File("KontaktBtn.jpg"));
            TypeIcon = ImageIO.read(new File("TypeBtn.pg.jpg"));
            ExitIcon = ImageIO.read(new File("ExitBtn.jpg"));
            Previous = ImageIO.read(new File("Previous.jpg"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        this.setPreferredSize(new Dimension(Width, height));
        desk = Desktop.getDesktop();
        this.setVisible(true);
        Type = new JButton() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(TypeIcon, 0, 0, WidthBtn, HeightBtn, this);
            }
        };
        Type.setBounds(530, 120, WidthBtn, HeightBtn);
        add(Type);
        Type.addActionListener(this);
        Kontakt = new JButton("Contact") {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(KontaktIcon, 0, 0, WidthBtn, HeightBtn, this);
            }
        };
        Kontakt.setBounds(530, 230, WidthBtn, HeightBtn);
        this.add(Kontakt);
        Kontakt.addActionListener(this);

        Exit = new JButton() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(ExitIcon, 0, 0, WidthBtn, HeightBtn, this);
            }
        };
        Exit.setBounds(530, 340, WidthBtn, HeightBtn);
        add(Exit);
        Exit.addActionListener(this);
        this.setLayout(null);

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image01, 0, 0, Width, height, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Type) {
            this.setVisible(false);
            Regex.showTypping();
        }
        if (e.getSource() == Kontakt) {
            this.setVisible(false);
            Regex.showKontakt();
        }
        if (e.getSource() == previews) {
            this.setVisible(false);
            Regex.showWelcome();
        }
        if (e.getSource() == Exit) {
            ExitRes = JOptionPane.showInternalConfirmDialog(null, "Bist du dir sicher, dass du aufhören möchtest, weiter zu tippen?", "Exit", 0);
            if (ExitRes == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Danke dir für deine Zeit", "Unsere Nachricht", 0);
                System.exit(0);
            }
        }
    }
}