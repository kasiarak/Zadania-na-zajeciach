package GUI.zadanie_10_02;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JButton button1 = new JButton();
        button1.setPreferredSize(new Dimension(120,30));
        JButton button2 = new JButton("Change title...");
        button2.setPreferredSize(new Dimension(120,30));
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,30));
        ChangeTitleButtonListener changeTitleButtonListener = new ChangeTitleButtonListener(this, textField);
        button2.addActionListener(changeTitleButtonListener);
        button1.addActionListener(e -> {
            textField.setText(button1.getText());
        });
        textField.addActionListener(e -> {
            button1.setText(textField.getText());
        });
        this.add(button1);
        this.add(button2);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
}
