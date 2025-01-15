package University.lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
    JTextField text = new JTextField(20);
    JButton button = new JButton("OK");
    JLabel label = new JLabel();
    public Frame() {
        super("Frame");
        setSize(900, 500);
        setLayout(new FlowLayout());
        add(new JLabel("Podaj imie:"));
        add(text);
        button.addActionListener(_ -> label.setText("Witaj " + text.getText()));
        text.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                text.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                text.setToolTipText("Tu daj imie cweluszku ");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Wracaj do mnie");
            }
        });
        add(button);
        add(label);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
