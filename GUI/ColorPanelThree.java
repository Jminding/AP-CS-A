import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColorPanelThree extends JPanel {
    private Dot[] dots = new Dot[50];

    public ColorPanelThree() {
        Random rand = new Random();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new Dot(500, 500, rand.nextInt(401), rand.nextInt(401), 50);
        }
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        for (Dot d : dots) {
            d.draw(g);
            d.update();
        }
    }
}