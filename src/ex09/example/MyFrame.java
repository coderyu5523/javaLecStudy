package ex09.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        JPanel panel = new JPanel();
        panel.setBackground(Color.blue);

        JPanel panelA = new JPanel();
        panelA.setBackground(Color.green);
        JPanel panelB = new JPanel();
        panelB.setBackground(Color.red);

        JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다.");
        label1.setBackground(Color.blue);

        panelA.add(label1);

        JButton button1 = new JButton("콤보피자");
        JButton button2 = new JButton("포테이토피자");
        JButton button3 = new JButton("불고기피자");

        panelB.add(button1);
        panelB.add(button2);
        panelB.add(button3);

        JLabel label2 = new JLabel("개수");
        JTextField field1 = new JTextField(10);
        panelB.add(label2);
        panelB.add(field1);

        panel.add(panelA);
        panel.add(panelB);
        add(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
