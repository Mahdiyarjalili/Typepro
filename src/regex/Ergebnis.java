/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regex;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
/**
 *
 * @author Mahdiyar
 */
public class Ergebnis extends JPanel implements ActionListener{
    JLabel ergebnisLbl;
    JLabel ergebnisLblT;
    JLabel RecordT;
    JButton erneut;
    JButton Exit;
    int ExitRes;
    int WidthBtn=180;
    int HeightBtn=60;
    Timer timer;
    Font font;
    BufferedImage image;
    BufferedImage erneutIcon;
    BufferedImage exitIcon;
    Ergebnis() {
    setPreferredSize(new Dimension(1200,600));
    try{ 
        image=ImageIO.read(new File("Ergebnis.jpg"));
   erneutIcon=ImageIO.read(new File("Erneut.jpg"));
      exitIcon=ImageIO.read(new File("ExitBtn.jpg"));
        }
       catch(Exception e){
                  }
    timer=new Timer();
    timer.schedule(new TimerTask() {
    @Override
    public void run() {
    SwingUtilities.invokeLater(() -> setTypping());
         }
         }, 2000);
        ergebnisLbl=new JLabel();
        ergebnisLblT=new JLabel();
        RecordT=new JLabel();
        Exit=new JButton("Erneut Starten"){
        public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(exitIcon, 0,0,WidthBtn, HeightBtn, this);
        }
        };
        Exit.setBounds(530, 490, WidthBtn, HeightBtn);
        Exit.addActionListener(this);
        font=new Font("Arial", Font.CENTER_BASELINE,25);
        ergebnisLbl.setBounds(290, 200, 200, 200);
        ergebnisLbl.setText(""+Typping.getWpM());
        this.add(ergebnisLbl);
        ergebnisLblT.setBounds(100, 200, 200, 200);
        ergebnisLblT.setText("Dein Ergebnis =");
        ergebnisLblT.setFont(font);
        RecordT.setFont(font);
        ergebnisLbl.setFont(font);
        erneut=new JButton("Erneut"){
        public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(erneutIcon, 0,0,WidthBtn, HeightBtn, this);
        }
        };
        erneut.addActionListener(this);
        this.add(erneut);
        erneut.setBounds(530, 400, WidthBtn, HeightBtn);
        this.add(Exit);
        Exit.addActionListener(this);
        this.add(ergebnisLblT);
        this.setLayout(null);
           }
       public void paintComponent (Graphics g){
        this.requestFocus();
        super.paintComponent(g);
        g.drawImage(image, 0,0,1200, 600, this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==erneut){
            timer.cancel();
           setTypping();
        }
        if(e.getSource()==Exit){
                        timer.cancel();
            ExitRes=JOptionPane.showInternalConfirmDialog(null, "Bst du dir sicher?", "Exit", 0);
            if(ExitRes==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Auf Wiedersehen", "Schade!", 0);
                            System.exit(0);
            }
        }
    }
    public void setTypping(){
        this.setVisible(false);
        Regex.showTypping();
    }
}
