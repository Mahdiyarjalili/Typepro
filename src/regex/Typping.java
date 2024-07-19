/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regex;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/**
 *
 * @author Mahdiyar Jalili
 */
public class Typping extends JPanel implements KeyListener, ActionListener{
    int index;
    int WidthBtn=180;
    int HeightBtn=60;
    int i;
    int Words;
    Font font;
    Font font01;
    String text= new String("hallo is gut");
    String[] texts=new String[101];
    String textf;
    JLabel field;
    JTextArea textArea;
    JTextArea showTextArea;
    JButton Exit;
    double timeStart;
    double timeEnd;
    int b;
    double timeFinish;
    static double WpM;
    double timeFinishMin;
    Random random;
    String textm;
    BufferedImage imageBack;
        BufferedImage ExitIcon;

Typping(){
       setPreferredSize(new Dimension(1200,600));
       font=new Font("Arial", Font.BOLD, 20);
       font01=new Font("Arial", Font.BOLD, 20);
       random=new Random();
       i=random.nextInt(0, 101);
       Words=1;
       index=0;
        try{
        imageBack=ImageIO.read(new File("Menu.jpg"));
        ExitIcon=ImageIO.read(new File("ExitBtn.jpg"));
        }
        catch(IOException ex ){
        }
Exit=new JButton(){
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(ExitIcon, 0, 0 ,WidthBtn, HeightBtn, this);
    }
};
Exit.setBounds(530, 520, WidthBtn, HeightBtn);
this .add(Exit);
Exit.addActionListener(this);
textm=new String(getText(i));
       textArea = new JTextArea(10, 0);
       textArea.setWrapStyleWord(true);
       textArea.setLineWrap(true);
       textArea.setBounds(10, 10, 1150, 100);
       textArea.setText(getText(i));
       textArea.setFont(font);
       Color backgroundColor = new Color(00, 0, 0, 128);
       add(textArea);
       field=new JLabel();
       field.setBounds(10, -28, 1000, 100);
       add(field);
       showTextArea=new JTextArea(10,0);
       showTextArea.requestFocus();
       showTextArea.setBounds(10, 10, 1150, 100);
        try {
       showTextArea.setFont(font01);
       showTextArea.setOpaque(false);
       textArea.setOpaque(false);
       textArea.setForeground(backgroundColor);
       showTextArea.setForeground(Color.black);
       showTextArea.setWrapStyleWord(true);
       showTextArea.setLineWrap(true);
        } catch (Exception ex) {
        }
        add(showTextArea);
       field.setFont(font);
       setLayout(null);
       this.addKeyListener(this);
       setFocusable(true);
      
        }
     public String getText(int j){
     b=j;
    switch(b){
        case 0:
        texts[0]="manipulating materials at the nanoscale holds promise for innovations in medicine electronics and materials science with applications ranging from drug delivery to quantum computing The intricate interplay between genetics"; 
        break;
         case 1:
        texts[1]="The convoluted history of ancient civilizations such as the Mesopotamians and the Egyptians reveals profound insights into early human culture governance and technological achievements Nanotechnology"; 
        break;
        case 2:
        texts[2]=" geometry delves into the complexity of selfsimilar patterns and structures demonstrating the ubiquity of fractals in natural phenomena like coastlines and clouds Artificial";
        break;
        
          case 3:
        texts[3]="Quantum physics a branch of theoretical physics explores the behavior of matter and energy at the smallest scales revealing a universe governed by probabilistic phenomena and waveparticle duality In the realm of mathematics fractal";
        break;
        
        
        case 4:
        texts[4]="symbolism conveys profound theological messages inviting contemplation and spiritual reflection The intricate web of international diplomacy marked by treaty negotiations"; 
        break;
        
          case 5:
        texts[5]="Quantum entanglement a phenomenon in quantum physics challenges classical notions of causality as entangled particles can instantaneously influence each others states regardless of distance Byzantine art with its intricate mosaics and religious"; 
        break;
        
        case 6:
        texts[6]="The convoluted narrative structures of postmodern literature often employ metafictional devices challenging readers to deconstruct and reinterpret the boundaries of reality and fiction The intricate relationships between neurons and synapses"; 
        break;
        
         case 7:
        texts[7]=" in neuroscience underlie the processes of learning memory formation and neural network adaptation The multifaceted dimensions of economic globalization from trade"; 
        break;
        
        
        case 8:
        texts[8]="The interplay between supply chain management and logistics in the global economy necessitates resilient strategies and digital innovation to ensure efficient operations and responsiveness The dynamic interplay between inflation"; 
        break;
        
        case 9:
        texts[9]="monetary policy and economic growth shapes macroeconomic stability and central banking strategies influencing interest rates and price levels Political polarizations profound"; 
        break;
        
        case 10:
        texts[10]="The complex interactions of particles and forces in particle physics as explored in particle accelerators deepen our understanding of fundamental physical laws and the origins of matter The convoluted legal";
        break;
        
        case 11:
        texts[11]="intricacies of international treaties and agreements necessitate diplomatic negotiation enforcement mechanisms and adherence to international law The multifaceted challenges of climate change ";
        break;
        
        case 12:
        texts[12]="The complex trajectory of urbanization raises issues of sustainable infrastructure resource allocation and societal wellbeing necessitating urban planning and smart city initiatives The enigmatic origins of life on Earth explored in astrobiology";
        break;
        
        case 13:
        texts[13]=" prompt investigations into extraterrestrial life possibilities and extremophiles adaptations to extreme environments The intricate processes of memory";
        break;
        
        case 14:
        texts[14]="The intricate analysis of historical archives reveals hidden narratives perspectives and social dynamics of bygone eras enriching our understanding of history and culture The labyrinthine history of Byzantine politics"; 
        break;
        
        case 15:
        texts[15]=" characterized by dynastic intrigues and ecclesiastical disputes has left an enduring legacy on the Eastern Orthodox tradition The profound implications of artificial intelligence"; 
        break;
        
        
        case 16:
        texts[16]="The complex interplay between cultural diversity and globalization engenders crosscultural communication challenges highlighting the need for cultural competence and intercultural understanding";
        break;
        
        
         case 17:
        texts[17]="The intricate role of memory consolidation in cognitive psychology elucidates memory formation processes and retrieval mechanisms shedding light on learning and cognitive functioning";
        break;
        
        case 18:
        texts[18]="from autonomous vehicles to chatbots permeate various sectors demanding ethical considerations and regulatory frameworks The intricate dance of celestial bodies in astrophysics encompasses";
        break;
        
        
        case 19:
        texts[19]="gravitational interactions planetary orbits and cosmic phenomena the mysteries of the universe The enigmatic properties of  materials with zero electrical resistance hold promise for technologies like magnetic levitation and efficient energy transmission";
        break;
        
        case 20:
        texts[20]="The multifaceted challenges of climate change from rising to extreme weather events  the imperative for global cooperation and  resource management International agreements like the Paris  aim to mitigate climate changes impacts";
        break;
        
              
         case 21:
        texts[21]="like the Paris Agreement aim to mitigate climate changes impacts";
        break;
        
        
        case 22:
        texts[22]="The complex interplay between cultural diversity and globalization engenders crosscultural communication challenges highlighting the need for cultural competence and intercultural understanding Effective communication";
        break;
        
        case 23:
        texts[23]="across cultures is essential in todays interconnected world The intricate role of memory consolidation in cognitive psychology elucidates memory formation mechanisms";
        break;
        
        
        case 24:
        texts[24]="cconsolidation in cognitive psychology elucidate memory formation mechanisms and the brains role in encoding and retrieving information The enigmatic nature of dark web anonymity and cybersecurity";
        break;
        
        
            case 25:
        texts[25]="challenges law enforcement privacy advocates and ethical considerations regarding online privacy and digital security The dynamic interplay between genes and environmental factors in developmental";
        break;
        
         case 26:
        texts[26]="psychology informs the nature nurture debate exploring how genetics and upbringing shape human development";
        break;
        
        
        case 27:
        texts[27]="from rising temperatures to extreme weather events underscore the imperative for global cooperation and sustainable resource management Quantum chromodynamics a subfield of theoretical physics";
        break;
        
        
        
        case 28:
        texts[28]="delves into the complex interactions between quarks and gluons within the framework of the strong nuclear force The intricate symbiosis between mycorrhizal fungi and plant roots enhances nutrient uptake and soil health in ecology facilitating plant growth and ecosystem stability";
        break;
        
        
        
        case 29:
        texts[29]="societal implications encompass ideological divides echo chambers and the erosion of civil discourse posing challenges to democratic governance The intricate ecosystem dynamics of rainforests";
        break;
        
        
        case 30:
        texts[30]="with their intricate food webs and biodiversity underscore the importance of conservation efforts and sustainable practices The enigma of consciousness remains a central question in neuroscience and philosophy prompting investigations into perception selfawareness and the nature of subjective experience";
        break;
        
        
        
        case 31:
        texts[31]="geopolitical considerations shapes the landscape of global governance and conflict resolution The labyrinthine complexities of healthcare systems worldwide encompass issues of access affordability and quality";
        break;
        
          case 32:
        texts[32]="necessitating healthcare reforms and policy interventions The ethical ramifications of gene editing technologies like CRISPRCas span concerns about unintended genetic consequences designer babies and equitable access to genetic enhancements";
        break;
        
        case 33:
        texts[33]="liberalization to the flow of capital have farreaching implications for income inequality and social justice stic expression in avantgarde movements like surrealism and dadaism esoterically challenges traditional aesthetic";
        break;
        
        case 34:
        texts[34]="norms inviting viewers to question and reinterpret artistic paradigms The enigmatic properties of dark matter and dark energy in astrophysics continue to baffle scientists prompting fundamental inquiries into the nature of the universe";
        break;
        
        case 35:
        texts[35]="ntelligence characterized by machine learning algorithms and neural networks has revolutionized data analysis enabling predictive modeling and decisionmaking across industriesEpidemiology";
        break;
        
        case 36:
        texts[36]=" a multidisciplinary field of the distribution of diseases providing crucial insights for public health interventions and disease control Postcolonial literature through its  the legacies of colonialism identity challenges Eurocentric  and  marginalized voices";
        break;
        
        
                
        case 37:
        texts[37]="epigenetics underscores the multifaceted nature of heredity wherein environmental factors modulate gene expression and contribute to phenotypic diversity The dialectical tension between";
        break;
        
        case 38:
        texts[38]="collectivism and individualism shapes  discourse prompting  about state intervention and individual liberties Astrophysics  the dynamics of celestial  mysteries of the cosmos from of black holes to the birth and death of stars";
        break;
        
        
        case 39:
        texts[39]="The multifaceted implications of artificial intelligence from autonomous vehicles to chatbots permeate various sectors demanding ethical considerations and regulatory frameworks";
        break;
        
        
          case 40:
        texts[40]=" The intricate analysis of historical archives reveals  narratives perspectives and  dynamics of bygone eras enriching of history and culture The labyrinthine by dynastic intrigues and  disputes has left an enduring legacy on the Eastern  tradition";
        break;
        
        
        case 41:
        texts[41]="The profound implications of artificial intelligence from autonomous vehicles to chatbots permeate various sectors demanding ethical considerations and regulatory frameworks ";
        break;
        
        
         case 42:
        texts[42]="The intricate dance of celestial bodies in astrophysics encompasses gravitational interactions planetary orbits and cosmic phenomena unveiling the mysteries of the universe The enigmatic properties of superconductors";
        break;
        
        case 43:
        texts[43]="The rapid proliferation of information technology in recent decades has precipitated a paradigm shift in how we communicate work and access information Technological advancements have facilitated globalization";
        break;
        
        
         case 44:
        texts[44]="fostering  across cultures and economies with profound for industries and  The convergence of artificial  machine learning and big data analytics has  sectors like healthcare enabling predictive and treatments";
        break;
        
        
        case 45:
        texts[45]="he multifaceted challenges of climate change from rising temperatures to biodiversity loss necessitate concerted global efforts to mitigate environmental degradation Quantum computings potential to exponentially";
        break;
        
        
        case 46:
        texts[46]="Speed up complex calculations poses both  and threats especially and cybersecurity The intricate interplay between genetics and  underscores the complexity of heredity with  factors  to phenotypic diversity";
        break;
        
        
        
        case 47:
        texts[47]="Postmodern philosophys rejection of metanarratives challenges established paradigms emphasizing pluralistic interpretations and decentering authorial intent Anthropogenic climate change evident";
        break;
        
        case 48:
        texts[48]="in sea level rise and extreme weather events underscores the urgency of sustainable resource management and international cooperation Neuropharmacologys interdisciplinary approach elucidates";
        break;
        
        
        case 49:
        texts[49]="Nanotechnologys manipulation of materials at the nanoscale promises transformative breakthroughs in medicine electronics and materials science The enigmatic properties of dark matter and dark energy in astrophysics continue to confound";
        break;
        
        case 50:
        texts[50]="scientists prompting fundamental questions about the universes nature The dialectical tension between collectivism and individualism shapes political discourse debating the states role in safeguarding liberties and addressing inequalities";
        break;
        
        
        case 51:
        texts[51]="Postmodern literatures convoluted narrative structure challenges conventions employing metafiction to blur reality and fiction boundaries International diplomacys complex web of multilateral agreements";
        break;
        
        
         case 52:
        texts[52]="and geopolitical considerations influences global governance and conflict resolution Quantum chromodynamics explores quark and gluon interactions underpinning the strong nuclear force in theoretical physics";
        break;
        
        
        case 53:
        texts[53]="Byzantine politics convoluted history marked by dynastic intrigues and ecclesiastical disputes endures in the Eastern Orthodox tradition Ethical concerns regarding gene editing technologies like";
        break;
        
        
          case 54:
        texts[54]="span unintended genetic consequences and designer baby prospects Avant garde art movements surrealism and dadaism esoterically challenge aesthetics inviting reinterpretation and questioning";
        break;
        
        
        
        case 55:
        texts[55]="Godels incompleteness theorems intricate mathematical proofs bear profound implications for mathematics foundations and formal systems limits Coral reefs ecosystem dynamics encompassing";
        break;
        
        
        case 56:
        texts[56]="coralmicroorganism symbiosis face existential threats from ocean acidification and bleaching Byzantine iconographys intricate nuances convey theological truths with religious symbolism and liturgical significance";
        break;
        
        case 57:
        texts[57]="Economic indicators fiscal policies and market sentiments complex interplay shapes financial market volatility necessitating astute risk management Political polarizations";
        break;
        
        case 58:
        texts[58]="profound societal implications encompass divides echo chambers and erosion of civil discourse  literature explores the legacy of colonialism examining power dynamics identity and  hybridity";
        break;
        
                
        
        case 59:
        texts[59]="The intricate dance of subatomic particles in particle physics uncovers fundamental building blocks properties and interactions The enigma of consciousness remains a central";
        break;
        
        case 60:
        texts[60]="question in neuroscience and philosophy prompting explorations of perception and selfawareness The interplay between supply chains logistics and ecommerce in the global economy demands resilient strategies and digital innovation";
        break;
        
        
        case 61:
        texts[61]="Artificial neural networks inspired by the human brain underpin machine learning algorithms enabling pattern recognition and decision making The intricacies of conflict resolution in international relations";
        break;
        
        
        case 62:
        texts[62]="encompass diplomacy negotiation and peacekeeping efforts The complex trajectory of urbanization raises issues of sustainable infrastructure resource allocation and societal wellbeing";
        break;
        
        case 63:
        texts[63]="The fractal geometry of nature exemplified in coastlines and snowflakes underscores mathematics presence in natural phenomena The intricate mechanism of antibiotic resistance";
       break;
       
       case 64:
        texts[64]="in microbiology necessitates innovative antimicrobial strategies and stewardship The dynamic interplay between inflation monetary policy and economic  shapes  stability and central banking strategies";
       break;
       
        case 65:
        texts[65]="The confluence of cultural diversity and globalization engenders crosscultural communication challenges highlighting the need for cultural competence The intricate";
        break;
        
        
        case 66:
        texts[66]="role of memory consolidation in cognitive psychology elucidates memory formation processes and retrieval  The labyrinthine history of ancient civilizations from Mesopotamia";
        break;
        
        case 67:
        texts[67]="The intricate choreography of ballet combines artistic expression with physical prowess conveying narratives through movement and emotion The profound implications of quantum";
        break;
        
        
        case 68:
        texts[68]="entanglement as explored in quantum physics challenge classical interplay between social institutions such as education and healthcare significantly  societal wellbeing and equality";
        break;
        
        
        
        case 69:
        texts[69]="The enigmatic properties of superconductors materials with zero electrical resistance hold promise for transformative technologies like magnetic levitation The intricate processes of synaptic plasticity";
        break; 
        
        
        case 70:
        texts[70]="in neuroscience underpin learning memory formation and neural network adaptation The intricate analysis of historical archives reveals hidden narratives perspectives and social dynamics of bygone eras";
        break;
        
        
        case 71:
        texts[71]="The convoluted legal intricacies of international treaties and agreements require diplomatic negotiation and enforcement mechanisms The multifaceted implications of artificial intelligence";
        break;
        
          case 72:
        texts[72]="from autonomous vehicles to chatbots permeate various sectors demanding ethical  The intricate dance of  bodies in astrophysics  gravitational  planetary orbits and cosmic phenomena";
        break;
        
        
        case 73:
        texts[73]="The enigma of dark web anonymity and cybersecurity challenges law enforcement and privacy advocates alike The dynamic interplay between genes and environmental factors in developmental psychology";
        break;
        
        
         case 74:
        texts[74]="elucidates the nature nurture debate The intricate symbiosis between mycorrhizal fungi and plant roots enhances nutrient uptake and soil health in ecology";
        break;
        
        
        case 75:
        texts[75]="The complex interplay between economic globalization and income inequality spurs debates on social justice and wealth redistribution The enigmatic origins of life on Earth ";
        break;
        
         case 76:
        texts[76]="explored in astrobiology prompt investigations into extraterrestrial life possibilities and extremophiles";
        break;
        
        case 77:
        texts[77]="Nanotechnology with its capacity to manipulate materials at the nanoscale holds tremendous potential for groundbreaking innovations in fields"; 
        break;
        
        case 78:
        texts[78]="materials science Applications range from targeted drug delivery to quantum computing Postcolonial literature through its exploration of the legacies of colonialism"; 
        break;
        
        case 79:
        texts[79]="The labyrinthine complexities of healthcare systems worldwide encompass issues of access affordability and quality necessitating comprehensive";
        break;
        
        case 80:
        texts[80]="healthcare reforms and policy interventions Ensuring equitable access to healthcare remains a global challenge";
        break;
        
        
        case 81:
        texts[81]="The convoluted narrative structures of postmodern literature often employ metafictional devices challenging readers to deconstruct and reinterpret the boundaries of reality";
        break;
        
        case 82:
        texts[82]="and fiction Writers experiment with narrative form inviting readers to question traditional storytelling conventions";
        break;
        
        
        case 83:
        texts[83]="The intricate relationships between neurons and synapses in neuroscience underlie the processes of learning memory formation and neural network adaptation";
        break;
        
        case 84:
        texts[84]="Researchers seek to unlock the secrets of the brains plasticity and cognitive functions The multifaceted dimensions of economic globalization from trade liberalization";
        break;
        
        case 85:
        texts[85]="Policymakers grapple with the intricate task of balancing economic growth and equitable wealth distribution within their nations Artistic expression in avantgarde movements";
        break;
        
        
        case 86:
        texts[86]="like surrealism and dadaism esoterically challenges traditional aesthetic norms inviting viewers to question and reinterpret artistic paradigms These movements redefine";
        break;
        
        case 87:
        texts[87]="The enigmatic properties of dark matter and dark energy in astrophysics continue to baffle scientists prompting fundamental inquiries into the nature of the universe";
        break;
        
        
        
        case 88:
        texts[89]="Researchers employ cuttingedge technology and observational data to investigate these cosmic mysteries";
        break;
        
        
        case 89:
        texts[89]="The interplay between supply chain management and logistics in the global economy necessitates resilient strategies and digital innovation to ensure efficient operations and responsiveness";
        break;
        
        
         case 90:
        texts[90]="Businesses adapt to dynamic market demands through streamlined supply chain processes";
        break;
        
        
        case 91:
        texts[91]="The dynamic interplay between inflation monetary policy and economic growth shapes macroeconomic stability and central banking strategies influencing interest rates and price levels";      
        break;
        
        
        case 92:
        texts[92]="Central banks are tasked with maintaining price stability while fostering economic growth";      
        break;
        
        
        case 93:
        texts[93]="Political polarizations profound societal implications encompass ideological divides echo chambers and the erosion of civil discourse posing challenges to democratic";
        break;
        
         case 94:
        texts[94]="governance Efforts to bridge divisions and restore constructive dialogue are essential for democratic societies";
        break;
        
        case 95:
        texts[95]="The intricate ecosystem dynamics of rainforests with their intricate food webs and biodiversity underscore the importance of conservation efforts and sustainable practices Protecting these vital";
        break;
        
        case 96:
        texts[96]="ecosystems is crucial for biodiversity preservation The enigma of consciousness remains a central question in neuroscience and philosophy";
        break;
        
        case 97:
        texts[97]="prompting investigations into perception selfawareness and the nature of subjective experience Researchers explore the neural correlates of consciousness The complex interactions of particles and";
        break;
        
         case 98:
        texts[98]=" forces in particle physics as explored in particle accelerators deepen our understanding of fundamental physical laws and the origins of matter Experiments at facilities like CERN probe the subatomic realm";
        break;
        
        case 99:
        texts[99]="The convoluted legal intricacies of international treaties and agreements necessitate diplomatic negotiation enforcement mechanisms and";
        break;
        
        case 100:
        texts[100]=" adherence to international law International diplomacy aims to address global challenges through cooperation";
        break;
    }
    textm=texts[b];
    return textm;
}
        public void paintComponent(Graphics g){
        requestFocus();
        super.paintComponent(g);
        g.drawImage(imageBack, 0,0,1200, 600, this);
        }
        @Override
        public void keyTyped(KeyEvent e) {
        }
        @Override
        public void keyPressed(KeyEvent e) {
if(index==0){
    timeStart=System.currentTimeMillis();
}
    if(e.getKeyCode()==KeyEvent.VK_A&&e.getKeyChar()==textm.charAt(index)) {
    showTextArea.setText(showTextArea.getText()+textm.charAt(index));
    field.setForeground(Color.red);
    if(index!=textm.length()){
      index++;  
    }
    }
    else if(e.getKeyCode()==KeyEvent.VK_B&&e.getKeyChar()==textm.charAt(index)) {
   showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
  else if(e.getKeyCode()==KeyEvent.VK_C&&e.getKeyChar()==textm.charAt(index)) {
      showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_D&&e.getKeyChar()==textm.charAt(index)) {
     showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_E&&e.getKeyChar()==textm.charAt(index)) {
   showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_F&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_G&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_H&&e.getKeyChar()==textm.charAt(index)) {
      showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_I&&e.getKeyChar()==textm.charAt(index)) {
        showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_J&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_K&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_L&&e.getKeyChar()==textm.charAt(index)) {
      showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_M&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_N&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_O&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_P&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_Q&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));

   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_R&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_S&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_T&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   if(index!=text.length()){
      index++;  
    }
}
else if(e.getKeyCode()==KeyEvent.VK_U&&e.getKeyChar()==textm.charAt(index)) {
      showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_V&&e.getKeyChar()==textm.charAt(index)) {
     showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_W&&e.getKeyChar()==textm.charAt(index)) {
       showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_X&&e.getKeyChar()==textm.charAt(index)) {
      showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_Y&&e.getKeyChar()==textm.charAt(index)) {
      showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_Z&&e.getKeyChar()==textm.charAt(index)) {
      showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   index++;
}
else if(e.getKeyCode()==KeyEvent.VK_SPACE&&e.getKeyChar()==textm.charAt(index)){
        showTextArea.setText(showTextArea.getText()+textm.charAt(index));
   if(index!=textm.length()){
      index++;  
      Words++;
    }
}
else if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE){
    textf=new String(showTextArea.getText());
    showTextArea.setText(textf.substring(0, index-1));
   index--;
  }
else{
    }
    if(index==getText(i).length()){
          this.setVisible(false);
          index=0;
          timeEnd=System.currentTimeMillis();
          timeFinish= timeEnd-timeStart;
          timeFinishMin=timeFinish/60000;
          WpM=Words/timeFinishMin;
          Regex.showErgebnis();
    }
         }    
    @Override
    public void keyReleased(KeyEvent e) {
    }
   static public double getWpM(){
      return WpM; 
   }
    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==Exit){
    this.setVisible(false);
    Regex.showMenu();
}
    }

      }
              
