import javax.swing.*;
import java.awt.*;
public class GUI3 {
    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("First GUI Program");
        theGUI.setSize(500, 500);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ColorPanelOne panel = new ColorPanelOne(Color.cyan);
        
        Container pane = theGUI.getContentPane();
        pane.add(panel);
        
        theGUI.setVisible(true);
    }
}