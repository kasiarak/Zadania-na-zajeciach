package GUI.zadanie_10_01;

import javax.swing.*;
import java.awt.*;

public class interfejs1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(500,300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(3,1,5,5));
        jPanel.add(new JTextField("JTextField 1"));
        jPanel.add(new JTextField("JTextField 2"));
        jPanel.add(new JTextField("JTextField 3"));
        JTextArea jTextArea = new JTextArea("JTextArea 1");
        jTextArea.setLayout(new BorderLayout());
        jTextArea.setPreferredSize(new Dimension(500, 100));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayout(3,3,5,5));
        for (int i = 1; i <= 9; i++) {
            jPanel2.add(new JButton("B0" + i));
        }
        frame.add(jPanel, BorderLayout.CENTER);
        frame.add(jTextArea, BorderLayout.SOUTH);
        jTextArea.add(jPanel2, BorderLayout.EAST);
        frame.setVisible(true);
    }
}
