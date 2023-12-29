package ex09;

import javax.swing.*;

public class TempConverter extends JFrame {

    public TempConverter() {
        JPanel panel = new JPanel();
        add(panel);

        JLabel label1 = new JLabel("화씨 온도");
        JLabel label2 = new JLabel("섭씨 온도");
        JLabel label3 = new JLabel(" 그냥 추가해봄");

        JTextField field1 = new JTextField(15);
        JTextField field2 = new JTextField(15);
        JTextField field3 = new JTextField(10);
        JButton button = new JButton("변환");

        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(button);

        setSize(400, 300);
        setTitle("온도 변환");

        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new TempConverter();

    }
}
