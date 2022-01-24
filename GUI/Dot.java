import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Dot {
    private int xPos, yPos, xVel, yVel, radius, sWidth, sHeight;
    private Color c;
    public Dot(int w, int h, int initX, int initY, int radius) {
        Random rand = new Random();
        this.xVel = rand.nextInt(11);
        this.yVel = rand.nextInt(11);
        this.xPos = initX;
        this.yPos = initY;
        this.radius = radius;
        this.sWidth = w;
        this.sHeight = h;
        
        int R = rand.nextInt(256);
        int G = rand.nextInt(256);
        int B = rand.nextInt(256);
        c = new Color(R, G, B);
    }
    
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillOval(xPos, yPos, radius * 2, radius * 2);
        g.setColor(Color.black);
        g.drawOval(xPos, yPos, radius * 2, radius * 2);
    }
    
    public void update() {
        xPos += xVel;
        yPos += yVel;
        
        if (xPos + 2 * radius >= sWidth || xPos <= 0) {
            xVel = -xVel;
        }
        
        if (yPos + (2 * radius) >= sHeight || yPos <= 0) {
            yVel = -yVel;
        }
    }
}