package University.lab10;

import javax.swing.*;
import java.awt.*;

public class DropDown extends JFrame {
    public DropDown(){
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] items = {"Opcja1", "Opcja2", "Opcja3"};
        JComboBox<String> dropdown = new JComboBox<>(items);

        add(dropdown);

        setVisible(true);
    }
}
