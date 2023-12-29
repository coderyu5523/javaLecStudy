package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example02 extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JTextField tfield;
    private JButton button;

    public Example02() {

        setSize(300, 150);
        setTitle("My Frame");
        setLayout(new FlowLayout());

        panel = new JPanel();
        label = new JLabel("카운터값");
        add(label);

        tfield = new JTextField(10);
        add(tfield);

        button = new JButton("증가");
        add(button);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {

        Example02 f = new Example02();

    }

}
