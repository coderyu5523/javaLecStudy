package ex10.exercise;

import javax.swing.*;

public class ExampleEX02 extends JFrame {
    //첫번째 정수 : 텍스트박스
    // 두번째 정수 : 텍스트 박스
    // 연산의 결과 : 텍스트 박스 + 텍스트 박스
    // ADD 버튼, Clear 버튼


    public ExampleEX02() {
        JPanel panel = new JPanel();
        add(panel);
        setTitle("Problem #2");
        setSize(400, 250);

        JLabel label1 = new JLabel("첫번째 정수");
        JLabel label2 = new JLabel("                         두번째 정수");
        JLabel label3 = new JLabel("연산의 결과");
        JTextField field1 = new JTextField(15);
        JTextField field2 = new JTextField(15);
        JTextField field3 = new JTextField(15);
        JButton button1 = new JButton("Add");
        JButton button2 = new JButton("Clear");


        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(field3);
        panel.add(button1);
        panel.add(button2);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        ExampleEX02 r = new ExampleEX02();
    }


}
