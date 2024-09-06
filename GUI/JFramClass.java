package GUI;

import javax.swing.*;
import java.awt.Color;
import java.util.jar.JarEntry;


public class JFramClass {
    public static void main(String[] args) {
        /*
        JFrame frame = new JFrame();//creates a frame
        frame.setSize(420, 420);
        frame.setTitle("First frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application (HIDE_ON_CLOSE)(DO_NOTHING_ON_CLOSE)
        frame.setResizable(false);//can't change size of frame when working
        frame.setVisible(true);//make frame visible
//        ImageIcon image = new ImageIcon("filename"); // create an ImageIcon
//        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(Color.BLACK);
        //frame.getContentPane().setBackground(new Color(230, 233, 244));
        */
        MyFrame myFrame = new MyFrame();
        JLabel label = new JLabel();
        label.setText("What? ");
        label.setForeground(Color.RED);
        myFrame.add(label);



    }
}
