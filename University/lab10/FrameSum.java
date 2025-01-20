package University.lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameSum extends JFrame {
    JPanel fpanel = new JPanel(new GridLayout(2,1));
    JTextField text = new JTextField(10);
    JButton button = new JButton("Sum");
    JLabel answer = new JLabel("");
    float number = 0;
    public FrameSum() {
        super("Frame Sum");
        setLayout(new GridLayout(3, 1));
        fpanel.add(new JLabel("Podaj liczbe: "));
        fpanel.add(text);
        getContentPane().add(fpanel);
        add(new JPanel(new FlowLayout()).add(button));
        add(new JPanel(new FlowLayout()).add(answer));

        button.addActionListener(_ -> {
            try {
                number += Float.parseFloat(text.getText());
                answer.setText("Suma = " + number);
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "To nie jest liczba");
            }
        });


        setSize(900, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
