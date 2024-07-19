/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author Mahdiyar
 */
public class Welcome extends JPanel implements ActionListener{
int Width=1200;
int height=600;
int WidthBtn=180;
int HeightBtn=60;
JButton next;
Menu menu;
Regex regex;
BufferedImage image;
BufferedImage nextIcon;
ImageIcon welcome;
Image welcome01;


    Welcome(){
    try {
        nextIcon=ImageIO.read(new File("Next.jpg"));
    } catch (IOException ex) {
        Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
    }
        this.setPreferredSize(new Dimension(Width,height));
       next=new JButton(){
        public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(nextIcon, 0,0,WidthBtn, HeightBtn, this);
        }
        };
        next.setBounds(1000, 520, WidthBtn, HeightBtn);
        this.add(next);
        next.addActionListener(this);

        try{
        image=ImageIO.read(new File("Welcome02.jpg"));
        
          }
        catch(IOException ex ){
ex.printStackTrace();
        }
                this.setLayout(new BorderLayout());
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image,  0, 0, Width, height, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==next) {
    this.setVisible(false);
    Regex.showMenu();
    
    
    
}
        
    }
}
