package ex04;

import javax.swing.*;

public class MyFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Hello");

        JButton btn1 = new JButton("클릭");
        jf.add(btn1);

        btn1.addActionListener(e -> {  // 버튼을 클릭하면 어떤 행위를 할지
            System.out.println("버튼 클릭됨"); //이벤트
        });

        jf.setSize(300, 500);
        jf.setVisible(true);

    }
}
