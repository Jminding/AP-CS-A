import javax.swing.*;
import java.awt.*;

public class ColorPanelTwo extends JPanel {
    private Dot dot;
    
    public ColorPanelTwo() {
        dot = new Dot(500, 500, 300, 300, 50);
        setBackground(Color.white);
    }
    
    public void paint(Graphics g) {
        super.paintComponent(g);
        
        dot.draw(g);
        dot.update();
        
        try {
            Thread.sleep(15);
        }
        catch (Exception e) {
            
        }
    }
}