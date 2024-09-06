package GUI;

import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setSize(420, 420);
        this.setTitle("First this");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLACK);
    }
}
