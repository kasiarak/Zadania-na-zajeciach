package GUI.zadanie_11_01;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);

        MainPanel mainPanel = new MainPanel();
        mainPanel.setFocusable(true);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
