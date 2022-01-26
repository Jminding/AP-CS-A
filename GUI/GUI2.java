import javax.swing.*;
import java.awt.*;

public class GUI2 {
    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("First GUI Program");
        theGUI.setSize(500, 500);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel nPanel = new JPanel();
        nPanel.setBackground(Color.red);

        JPanel sPanel = new JPanel();
        sPanel.setBackground(Color.blue);

        JPanel ePanel = new JPanel();
        ePanel.setBackground(Color.green);

        JPanel wPanel = new JPanel();
        wPanel.setBackground(Color.lightGray);

        Container pane = theGUI.getContentPane();
        pane.setLayout(new GridLayout(2, 2));

        pane.add(nPanel, BorderLayout.NORTH);
        pane.add(sPanel, BorderLayout.SOUTH);
        pane.add(ePanel, BorderLayout.EAST);
        pane.add(wPanel, BorderLayout.WEST);

        theGUI.setVisible(true);
    }
}