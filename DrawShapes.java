
package com.mycompany.drawshapes;
import java.awt.*;
import javax.swing.*;
public class DrawShapes extends Canvas {
    
    public void paint(Graphics d){
        
        d.setColor(new Color(34, 139, 34)); // Green color
        d.fillRect(195, 200, 10, 100);

        // Draw the petals
        d.setColor(Color.PINK);
        d.fillOval(150, 150, 50, 50); // Top left petal
        d.fillOval(200, 150, 50, 50); // Top right petal
        d.fillOval(150, 200, 50, 50); // Bottom left petal
        d.fillOval(200, 200, 50, 50); // Bottom right petal

        // Draw the center
        d.setColor(Color.YELLOW);
        d.fillOval(175, 175, 50, 50); // Center of the flower
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Shapes Exsample");
        DrawShapes canvas = new DrawShapes();
        
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.setVisible(true);
        
    }
}
