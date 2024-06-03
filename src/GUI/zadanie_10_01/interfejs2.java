package GUI.zadanie_10_01;

import javax.swing.*;
import java.awt.*;

public class interfejs2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(500,300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,1,0,0));
        JTextArea jTextArea1 = new JTextArea("JTextArea 1");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3,1,2,2));
        gridPanel.add(new TextField("JTextField 1"));
        gridPanel.add(new TextField("JTextField 2"));
        gridPanel.add(new TextField("JTextField 3"));
        panel.add(gridPanel, BorderLayout.CENTER);
        JPanel buttonsPanel1 = new JPanel();
        buttonsPanel1.setLayout(new GridLayout(2,2,2,2));
        JPanel buttonsPanel2 = new JPanel();
        buttonsPanel2.setLayout(new GridLayout(2,2,2,2));
        for(int i=1; i <=8; i++){
            if(i<5) buttonsPanel1.add(new JButton("B0" + i));
            else buttonsPanel2.add(new JButton("B0" + i));
        }
        panel.add(buttonsPanel1, BorderLayout.WEST);
        panel.add(buttonsPanel2, BorderLayout.EAST);
        frame.add(jTextArea1);
        frame.add(panel);
        frame.setVisible(true);

    }
}
