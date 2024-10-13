package GUI.zadanie_10_01;

import javax.swing.*;
import java.awt.*;

public class interfejs6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());
        JPanel buttons1 = new JPanel();
        buttons1.setLayout(new GridLayout(1,4,2,2));
        buttons1.add(new JButton("01"));
        buttons1.add(new JButton("02"));
        buttons1.add(new JButton("03"));
        buttons1.add(new JButton("04"));
        JPanel textAreaAndTextFields = new JPanel();
        textAreaAndTextFields.setLayout(new GridLayout(1,2,0,0));
        textAreaAndTextFields.add(new JTextArea("JTextArea 1"));
        JPanel textFields = new JPanel();
        textFields.setLayout(new GridLayout(3,1,2,2));
        textFields.add(new JTextField("TextField 1"));
        textFields.add(new JTextField("TextField 2"));
        textFields.add(new JTextField("TextField 3"));
        textAreaAndTextFields.add(textFields);
        JPanel buttons2 = new JPanel();
        buttons2.setLayout(new GridLayout(1,4,2,2));
        buttons2.add(new JButton("05"));
        buttons2.add(new JButton("06"));
        buttons2.add(new JButton("07"));
        buttons2.add(new JButton("08"));

        frame.add(buttons1, BorderLayout.NORTH);
        frame.add(textAreaAndTextFields, BorderLayout.CENTER);
        frame.add(buttons2, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
