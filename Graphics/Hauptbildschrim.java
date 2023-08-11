package Graphics;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Hauptbildschrim extends JFrame {

    public Hauptbildschrim(String title) throws HeadlessException {
        super(title);
    }
   
    public static void main(String[] args) {
        GraphikUsage graphik = new GraphikUsage();
        
        
        Hauptbildschrim  = new Hauptbildschrim("Grafik Usage");
        
        bildschrim.setVisible(true);
        bildschrim.setResizable(true);
        bildschrim.setSize(800,600);
        bildschrim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bildschrim.add(graphik);
        
              
    }
    
}
