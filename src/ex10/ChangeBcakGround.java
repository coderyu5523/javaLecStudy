package ex10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBcakGround extends JFrame {
    private JButton button1;
    private JButton button2;
    private JPanel panel;
    MyListener listner = new MyListener();

    public ChangeBcakGround() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");
        panel = new JPanel();
        button1 = new JButton("파란색");
        button1.addActionListener(listner);
        panel.add(button1);

        button2 = new JButton("초록색");
        button2.addActionListener(listner);
        panel.add(button2);

        this.add(panel);
        this.setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                panel.setBackground(Color.BLUE);
            } else if (e.getSource() == button2) {
                panel.setBackground(Color.green);
            }


        }


    }


    public static void main(String[] args) {

        ChangeBcakGround t = new ChangeBcakGround();
    }
}
