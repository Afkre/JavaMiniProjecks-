package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GraphicsUsage extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.red);
        
        
        g.drawRect(100, 10, 30, 40);
        
        g.fillRect(200, 100, 30,40);
        
        g.setColor(Color.blue);
        
        g.drawOval(200, 200,60,30);
        
        g.fillOval(300, 300, 40,40);
        
        
        g.setColor(Color.yellow);
        
        g.drawLine(100, 100, 300, 300);
        
    }

    public GraphicsUsage() {
        
        setBackground(Color.black);
        
    }
        
}
