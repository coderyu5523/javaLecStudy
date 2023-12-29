package ex09.example;

import javax.swing.*;
import java.awt.*;

public class Example05 extends JFrame {


    public Example05() {


        getContentPane().setBackground(Color.ORANGE);
        setSize(350, 250);
        setTitle("BMI 계산기");
        setLayout(new FlowLayout());

        add(new JLabel("                 나의 BMI 지수는 얼마나 될까?                                          "));
        add(new JLabel("나의 체중(kg) :"));
        add(new JTextField(15));

        add(new JLabel("       나의 키(m):"));
        add(new JTextField(15));

        add(new JButton("BMI 확인하기"));

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {

        new Example05();

    }
}
