package GUI.zadanie_10_01;

import javax.swing.*;
import java.awt.*;

public class interfejs5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(2,5,2,2));
        buttons.add(new JButton("B01"));
        buttons.add(new JButton("B02"));
        buttons.add(new JButton("B03"));
        buttons.add(new JButton("B04"));
        buttons.add(new JButton("B05"));
        buttons.add(new JButton("B06"));
        buttons.add(new JButton("B07"));
        buttons.add(new JButton("B08"));
        buttons.add(new JButton("B09"));
        buttons.add(new JButton("B10"));
        JPanel textFields = new JPanel();
        textFields.setLayout(new GridLayout(3,1,5,5));
        textFields.add(new JTextField("JTextField 1"));
        textFields.add(new JTextField("JTextField 2"));
        textFields.add(new JTextField("JTextField 3"));
        JPanel buttonsContainer = new JPanel();
        buttonsContainer.setLayout(new FlowLayout());
        JPanel buttons2 = new JPanel();
        buttons2.setLayout(new GridLayout(1,3,5,5));
        buttons2.add(new JButton("B11"));
        buttons2.add(new JButton("B12"));
        buttons2.add(new JButton("B13"));
        buttonsContainer.add(buttons2);

        frame.add(buttons, BorderLayout.NORTH);
        frame.add(textFields, BorderLayout.CENTER);
        frame.add(buttonsContainer, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
