import java.awt.*;
import javax.swing.*;

public class BinaryClock {
    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("Binary Clock");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        theGUI.setSize(width, height);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container pane = theGUI.getContentPane();
        BinaryClockColorPanel panel = new BinaryClockColorPanel();
        pane.add(panel);

        theGUI.setVisible(true);

        while (true) panel.repaint();
    }
}