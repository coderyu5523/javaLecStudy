package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example04 extends JFrame {


    public Example04() {
        setSize(500, 350);
        setTitle("JLabel Test");
        setLayout(new FlowLayout());


        add(new JLabel("Red"));
        add(new JLabel("Yellow"));
        add(new JLabel("Green"));
        add(new JLabel("Blue"));


        JButton button1 = new JButton();
        setBackground(Color.red);
        JButton button2 = new JButton();
        setBackground(Color.yellow);
        JButton button3 = new JButton();
        setBackground(Color.green);
        JButton button4 = new JButton();
        setBackground(Color.BLUE);

        add(button1);
        add(button2);
        add(button3);
        add(button4);


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {

        new Example04();


    }
}
