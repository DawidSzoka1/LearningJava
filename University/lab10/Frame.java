package University.lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
    JTextField text = new JTextField(20);
    JButton button = new JButton("OK");
    JLabel label = new JLabel();
    ButtonGroup radioButton = new ButtonGroup();
    JRadioButton pl = new JRadioButton("PL");
    JRadioButton eng  = new JRadioButton("ENg");
    public Frame() {
        super("Frame");
        setSize(900, 500);
        setLayout(new FlowLayout());
        add(new JLabel("Podaj imie:"));
        add(text);

        pl.setSelected(true);
        radioButton.add(pl);
        radioButton.add(eng);
        add(pl);
        add(eng);
        button.addActionListener(_ ->{
            if(pl.isSelected()){
                label.setText("Witaj " + text.getText());
            }else if(eng.isSelected()){
                label.setText("hello " + text.getText());
            }else{
                label.setText("Nic " + text.getText());
            }
        } );
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
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
