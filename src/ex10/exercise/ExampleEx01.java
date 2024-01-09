package ex10.exercise;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// 버튼 추가 " 버튼을 눌러보세요"
// 하단에 클릭 횟수 : count 값 +1 씩 추가


public class ExampleEx01 extends JFrame {
    private JPanel panel;
    private JButton button;
    private JLabel label;
    int count = 0;

    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            count++;
            label.setText("클릭 횟수:" + count);
        }
    }

    public ExampleEx01() {
        setSize(400, 170);
        setTitle("Program #1");
        panel = new JPanel();
        panel.setLayout(null);

        button = new JButton("버튼을 눌러보세요");
        button.setLocation(40, 30);
        button.setSize(320, 30);
        button.addActionListener(new MyListener());
        add(button);

        label = new JLabel("클릭 횟수:" + count);
        label.setLocation(100, 0);

        add(label);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        ExampleEx01 e = new ExampleEx01();

    }
}
