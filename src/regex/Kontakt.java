/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regex;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Mahdiyar
 */
public class Kontakt extends JPanel implements ActionListener{
    int Width=1200;
    int height=600;
    JButton instaBtn;
    JButton telegramBtn;
    JButton previewsBtn;
    int WidthBtn=180;
    int HeightBtn=60;

    String instaUrl="https://www.instagram.com/mj.apps/";
    String telegramUrl="https://telegram.me/mahdiyarjalili";
    URI uri;
    Desktop desk;
    BufferedImage image;
    BufferedImage Instagram;
    BufferedImage Telegram;
    BufferedImage Previous;


    Kontakt(){
        try {
            image=ImageIO.read(new File("Kontakt.jpg"));
            Instagram=ImageIO.read(new File("Instagram.jpeg"));
            Telegram=ImageIO.read(new File("Telegram.jpeg"));
            Previous=ImageIO.read(new File("Previous.jpg"));
                    } catch (IOException ex) {
System.out.print("Wow");   
        }
desk=Desktop.getDesktop();
this.setPreferredSize(new Dimension(Width,height));
instaBtn= new JButton("Unser Instagram"){
    public void paintComponent(Graphics g){
   super.paintComponent(g);
    g.drawImage(Instagram, 0, 0,WidthBtn, HeightBtn, this);      
    }
};
telegramBtn= new JButton("Unser Telegram"){
    
    public void paintComponent(Graphics g){
   super.paintComponent(g);
    g.drawImage(Telegram, 0, 0,WidthBtn, HeightBtn, this);      
    }
};
previewsBtn=new JButton("Previews"){
    
    public void paintComponent(Graphics g){
   super.paintComponent(g);
    g.drawImage(Previous, 0, 0,WidthBtn, HeightBtn, this);      
    }
};
instaBtn.setBounds(520, 250, WidthBtn, HeightBtn);
telegramBtn.setBounds(520,350,WidthBtn,HeightBtn);
previewsBtn.setBounds(50, 520, WidthBtn, HeightBtn);

this.add(instaBtn);
this.add(telegramBtn);
this.add(previewsBtn);
instaBtn.addActionListener(this);
telegramBtn.addActionListener(this);
previewsBtn.addActionListener(this);
this.setVisible(true);
this.setLayout(null);

    }
public void paintComponent(Graphics g){
    
    super.paintComponent(g);
    g.drawImage(image, WIDTH, WIDTH, null);
    
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==instaBtn){
            try {
            uri=new URI(instaUrl);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Kontakt.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                desk.browse(uri);
            } catch (IOException ex) {
                Logger.getLogger(Kontakt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource()==telegramBtn){
            try {
            uri=new URI(telegramUrl);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Kontakt.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                desk.browse(uri);
            } catch (IOException ex) {
                Logger.getLogger(Kontakt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource()==previewsBtn){
            this.setVisible(false);
            Regex.welcome.setVisible(false);
            Regex.showMenu();
        }
    }
    
}
