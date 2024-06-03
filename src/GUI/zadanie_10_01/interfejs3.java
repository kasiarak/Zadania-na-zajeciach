package GUI.zadanie_10_01;

import javax.swing.*;
import java.awt.*;

public class interfejs3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());
        JPanel textFields = new JPanel();
        textFields.setPreferredSize(new Dimension(500,150));
        textFields.setLayout(new GridLayout(3,1,2,2));
        textFields.add(new TextField("JTextField1"));
        textFields.add(new TextField("JTextField2"));
        textFields.add(new TextField("JTextField3"));
        JPanel textAreas = new JPanel();
        textAreas.setPreferredSize(new Dimension(500,100));
        textAreas.setLayout(new GridLayout(1,2,2,0));
        textAreas.add(new JTextArea("JTextArea 1"));
        textAreas.add(new JTextArea("JTextArea 2"));
        JPanel buttons = new JPanel();
        buttons.setPreferredSize(new Dimension(500,50));
        buttons.setLayout(new GridLayout(1,5,5,5));
        buttons.add(new JButton("01"));
        buttons.add(new JButton("02"));
        buttons.add(new JButton("03"));
        buttons.add(new JButton("04"));
        buttons.add(new JButton("05"));
        frame.add(textFields, BorderLayout.NORTH);
        frame.add(textAreas, BorderLayout.CENTER);
        frame.add(buttons, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
