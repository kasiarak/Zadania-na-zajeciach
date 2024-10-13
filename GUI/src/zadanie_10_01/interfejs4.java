package GUI.zadanie_10_01;

import javax.swing.*;
import java.awt.*;

public class interfejs4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(3,4,2,2));
        buttons.add(new JButton("01"));
        buttons.add(new JButton("02"));
        buttons.add(new JButton("03"));
        buttons.add(new JButton("04"));
        buttons.add(new JButton("05"));
        buttons.add(new JButton("06"));
        buttons.add(new JButton("07"));
        buttons.add(new JButton("08"));
        buttons.add(new JButton("09"));
        buttons.add(new JButton("10"));
        buttons.add(new JButton("11"));
        buttons.add(new JButton("12"));
        JTextArea jTextArea1 = new JTextArea("JTextArea 1");
        JTextArea jTextArea2 = new JTextArea("JTextArea 2");
        JTextField jTextField4 = new JTextField("JTextField 4");
        frame.add(buttons, BorderLayout.CENTER);
        frame.add(jTextArea1, BorderLayout.WEST);
        frame.add(jTextArea2, BorderLayout.EAST);
        frame.add(jTextField4, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
