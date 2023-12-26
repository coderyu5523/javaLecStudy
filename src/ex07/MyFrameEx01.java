package ex07;


import javax.swing.*;

class BasicFrame extends JFrame {  // 객체
    public BasicFrame() {
        setSize(300, 500);
        setVisible(true);
    }


}


public class MyFrameEx01 {
    static int num = 1;


    public static void main(String[] args) {
        JFrame jf = new JFrame();
        // jf.setLayout(new BorderLayout());
        jf.setSize(300, 500);
        JButton btn1 = new JButton("더하기");
        JButton btn2 = new JButton("빼기");
        JLabel la1 = new JLabel(num + "");


        jf.add("North", btn1);  // JButton 는 JComponent 의 구현체
        jf.add("South", btn2);  // JButton 는 JComponent 의 구현체
        jf.add("Center", la1);

        btn1.addActionListener(e -> {  // 컨트롤 + 스페이스 /라이브러리에 있는 구현체를 넣음1
            num++;
            la1.setText(num + "");
        });

        btn2.addActionListener(e -> {
            num--;
            if (num < 0) {
                num = 0;
            }
            la1.setText(num + "");
        });

        jf.setVisible(true);
    }
}
