/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regex;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import static regex.Main.regex;

/**
 * @author Mahdiyar
 */
public class Regex extends JFrame {
    static Menu menu;
    static Welcome welcome;
    static Kontakt kontakt;
    static Typping typing;
    static Ergebnis ergebnis;
    static Welcome01 welcome01;
    static JPanel center = new JPanel();
    JPanel Haupt = new JPanel();
    Image image;

    Regex() {
        try {
            image = ImageIO.read(new File("Icon.png"));
        } catch (IOException ex) {
            Logger.getLogger(Regex.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setSize(500, 500);
        this.add(Haupt);
        Haupt.setPreferredSize(new Dimension(2000, 2000));
        welcome01 = new Welcome01();
        center.add(welcome01);
        this.add(center);
        setTitle("Type");
        this.setIconImage(image);
        this.setResizable(false);
        this.setUndecorated(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }

    static public void showMenu() {
        menu = new Menu();
        center.add(menu);
    }

    static public void showWelcome() {
        welcome = new Welcome();
        center.add(welcome);
    }

    static public void showKontakt() {
        kontakt = new Kontakt();
        center.add(kontakt);
    }

    static public void showTypping() {

        typing = new Typping();
        center.add(typing);
    }

    static public void showErgebnis() {
        ergebnis = new Ergebnis();
        center.add(ergebnis);
    }

}