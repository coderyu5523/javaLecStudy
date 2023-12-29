package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example03 extends JFrame {

    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;


    public Example03() {
        setSize(350, 150);
        setTitle("My Frame");
        setLayout(new FlowLayout());

        panel = new JPanel();
        JLabel label = new JLabel("자바호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요");
        add(label);

        button1 = new JButton("1일");
        button2 = new JButton("2일");
        button3 = new JButton("3일");
        button4 = new JButton("4일");
        button5 = new JButton("5일");
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        Example03 f = new Example03();


    }
}
