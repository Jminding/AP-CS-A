import javax.swing.*;
import java.awt.*;
public class GUI5 {
    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("First GUI Program");
        theGUI.setSize(500, 500);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ColorPanelThree panel = new ColorPanelThree();
        
        Container pane = theGUI.getContentPane();
        pane.add(panel);
        
        theGUI.setVisible(true);
        
        while (true) {
            panel.repaint();
        }
    }
}