package ex16.example;

import javax.swing.*;

public class ThreadEx04 extends JFrame {
    private boolean state1 = true;
    private boolean state2 = true;

    private int count = 0;
    private int count2 = 0;
    private JLabel countLabel;
    private JLabel count2Label;

    public ThreadEx04() {
        setTitle("숫자 카운터 프로그램");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 매니저 설정
        setLayout(null);

        // 숫자를 표시할 레이블 생성
        countLabel = new JLabel("숫자 1: " + count);
        count2Label = new JLabel("숫자 2: " + count2);
        countLabel.setLocation(75, 0);
        countLabel.setSize(60, 60);
        count2Label.setLocation(145, 0);
        count2Label.setSize(60, 60);
        add(countLabel);
        add(count2Label);

        // 멈춤 버튼 생성
        JButton stopButton1 = new JButton("멈춤1");
        stopButton1.setLocation(70, 40);
        stopButton1.setSize(65, 50);
        add(stopButton1);

        JButton stopButton2 = new JButton("멈춤2");
        stopButton2.setLocation(140, 40);
        stopButton2.setSize(65, 50);
        add(stopButton2);
        // 버튼에 액션 리스너 추가
        stopButton1.addActionListener(e -> {
            state1 = false;
        });

        stopButton2.addActionListener(e -> {
            state2 = false;
        });

        new Thread(() -> {
            while (state1) {
                try {
                    Thread.sleep(1000);
                    count++;
                    countLabel.setText("숫자 1: " + count);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();

        new Thread(() -> {
            while (state2) {
                try {
                    Thread.sleep(1000);
                    count2++;
                    count2Label.setText("숫자 2: " + count2);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();


        setVisible(true);


    }

    public static void main(String[] args) {
        new ThreadEx04();
    }
}

