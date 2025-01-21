package University.kol2OficialW1.zad2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okienko extends JFrame {
    JTextField imie = new JTextField(20);
    JTextField wiek = new JTextField(20);
    JButton wyslij = new JButton("Add");
    JRadioButton radioButton = new JRadioButton("asd");
    JRadioButton radioButton2 = new JRadioButton("asd");
    ButtonGroup bg = new ButtonGroup();
    JLabel wynik = new JLabel("");
    JPanel panel = new JPanel(new FlowLayout());
    Osoba o;
    public Okienko(){
        setLayout(new FlowLayout());
        radioButton.setSelected(true);
        panel.add(radioButton);
        add(panel);
        String[] slow = {"slo2", "slow1"};
        JComboBox<String> dropdown = new JComboBox<>(slow);
        add(dropdown);

        bg.add(radioButton);
        bg.add(radioButton2);
        add(radioButton);
        add(radioButton2);
        add(new JLabel("Imie: "));
        add(imie);
        add(new JLabel("Wiek: "));
        add(wiek);
        add(wyslij);
        wyslij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(slow[dropdown.getSelectedIndex()]);
                if(radioButton.isSelected()){
                    System.out.println("cosik ");
                }
                try{
                    int test = Integer.parseInt(wiek.getText());
                    o = new Osoba(imie.getText(), test);
                    wynik.setText(o.toString());
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "wprowadz jeszcze raz");
                }

            }
        });
        add(wynik);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
    }
}
