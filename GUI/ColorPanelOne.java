import javax.swing.*;
import java.awt.*;

public class ColorPanelOne extends JPanel {
    public ColorPanelOne(Color c) {
        setBackground(c);
    }
    
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.drawRect(200, 300, 120, 20);
        g.setColor(Color.red);
        
        Font font = new Font("Open Sans", Font.BOLD + Font.ITALIC, 80);
        g.setFont(font);
        g.drawString("Hello, World!", 20, 125);
        
        int x = getWidth() / 2 - 50;
        int y = getHeight() / 2 - 50;
        
        g.setColor(Color.magenta);
        g.fillOval(x, y, 100, 100);
    }
}