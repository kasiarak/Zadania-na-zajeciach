package GUI.zadanie_11_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class MainPanel extends JPanel {
    List<Shape> shapes = new ArrayList<>();
    Color color = Color.RED;
    boolean circles = true;
    boolean isFilled = false;
    public MainPanel(){
        this.setFocusable(true);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int size = (int)(20+Math.random()*30);
                    System.out.println(size);
                    int x = e.getX();
                    int y = e.getY();
                    shapes.add(new Shape(circles, x,y,size,color,isFilled));
                    repaint();
                }
            }
        });
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case KeyEvent.VK_SPACE:
                        circles = !circles;
                        break;
                    case KeyEvent.VK_SHIFT:
                        isFilled = true;
                        break;
                    case KeyEvent.VK_G:
                        color = Color.GREEN;
                        break;
                    case KeyEvent.VK_R:
                        color = Color.RED;
                        break;
                    case KeyEvent.VK_O:
                        color = Color.ORANGE;
                        break;
                }
                repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_SHIFT){
                    isFilled = false;
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        requestFocusInWindow();
        Graphics2D g2D = (Graphics2D)g;
        for(Shape shape : shapes){
            g2D.setColor(shape.color);
            if(shape.isCircle){
                if(shape.isFilled){
                    g2D.fillOval(shape.x, shape.y,shape.size,shape.size);
                }else g2D.drawOval(shape.x, shape.y, shape.size, shape.size);
            }else {
                if(shape.isFilled){
                    g2D.fillRect(shape.x,shape.y,shape.size,shape.size);
                }else {
                    g2D.drawRect(shape.x, shape.y, shape.size, shape.size);
                }
            }
        }
    }
}
