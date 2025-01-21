package University.kol2OficialW1.zad2;

import javax.swing.*;
import java.awt.*;


public class OknoOficjalnie extends JFrame {
    JPanel panel1 = new JPanel(new FlowLayout());
    JPanel panel2 = new JPanel(new FlowLayout());
    JPanel panel3 = new JPanel(new FlowLayout());
    JPanel panel4 = new JPanel(new FlowLayout());
    JLabel imieLabel = new JLabel("Imie: ");
    JLabel wiekLabel = new JLabel("Wiek: ");
    JTextField imie = new JTextField(10);
    JTextField wiek = new JTextField(10);
    JButton addButton = new JButton("dodaj");
    JButton show = new JButton("wyswietl");
    JComboBox<String> dropdown = new JComboBox<>();

    public OknoOficjalnie() {
        setLayout(new GridLayout(3, 2));
        panel1.add(imieLabel);
        panel1.add(imie);
        add(panel1);
        panel2.add(wiekLabel);
        panel2.add(wiek);
        add(panel2);
        panel3.add(addButton);
        panel4.add(show);
        add(panel3);
        add(panel4);
        addButton.addActionListener(_ -> {
            try {
                int test = Integer.parseInt(wiek.getText());

                dropdown.addItem(imie.getText() + " " + test);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Wprowadz jeszcze raz");
            }
        });
        dropdown.setVisible(false);
        add(dropdown);
        show.addActionListener(_ -> {

                    dropdown.setVisible(true);
                }
        );
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
