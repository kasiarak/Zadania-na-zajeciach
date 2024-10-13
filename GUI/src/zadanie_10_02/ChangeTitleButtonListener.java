package GUI.zadanie_10_02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeTitleButtonListener implements ActionListener {
    JFrame frame;
    JTextField textField;
    public ChangeTitleButtonListener(JFrame frame, JTextField textField){
        this.frame = frame;
        this.textField = textField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setTitle(textField.getText());
    }
}
