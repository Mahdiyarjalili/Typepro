/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regex;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Mahdiyar
 */
public class Welcome01 extends JPanel{
    int Width=1200;
int height=600;
BufferedImage Welcome02;
Timer timer;
Welcome01(){
        this.setPreferredSize(new Dimension(Width,height));
        try {
            Welcome02=ImageIO.read(new File("Welcome01.jpg"));
        } catch (IOException ex) {
System.out.print("MMMMMMM");  
        }
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                   SwingUtilities.invokeLater(() -> showwelcome01());

                       }
        
            
        }, 2000);
    this.setLayout(null);
}

   public void paintComponent(Graphics g){
       super.paintComponent(g);
       g.drawImage(Welcome02, 0, 0, null);
   }
   public void showwelcome01(){
       this.setVisible(false);
       Regex.showWelcome();
   }
}
