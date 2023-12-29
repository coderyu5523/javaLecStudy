package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example01 extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton button1, button2;


    public Example01() {

        setSize(300, 150);
        setTitle("MyFrame");
        setLayout(new FlowLayout());

        label = new JLabel("자바는 재미있나요?");
        add(label);


        button1 = new JButton("yes");
        button2 = new JButton("no");
        add(button1);
        add(button2);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Example01 f = new Example01();
    }

}
