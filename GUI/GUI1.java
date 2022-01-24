import javax.swing.*; // JFrame and JPanel
import java.awt.*; // color, container, Gridlayout
public class GUI1 {
    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("First GUI Program");
        theGUI.setSize(500, 500);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 44, 120));
        
        Container pane = theGUI.getContentPane();
        pane.add(panel);
        
        theGUI.setVisible(true);
    }
}