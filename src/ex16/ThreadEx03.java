package ex16;

import javax.swing.*;

public class ThreadEx03 extends JFrame {
    private boolean state = true; // 스레드를 제어하는 코드,

    private int count = 0;
    private int count2 = 0;
    private JLabel countLabel;
    private JLabel count2Label;

    public ThreadEx03() {
        setTitle("숫자 카운터 프로그램");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 매니저 설정
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // 숫자를 표시할 레이블 생성
        countLabel = new JLabel("숫자 1: " + count);
        count2Label = new JLabel("숫자 2: " + count2);
        countLabel.setAlignmentX(CENTER_ALIGNMENT);
        count2Label.setAlignmentX(CENTER_ALIGNMENT);
        add(countLabel);
        add(count2Label);

        // 멈춤 버튼 생성
        JButton increaseButton = new JButton("멈춤");
        increaseButton.setAlignmentX(CENTER_ALIGNMENT);
        add(increaseButton);

        // 버튼에 액션 리스너 추가
        increaseButton.addActionListener(e -> {
            state = false;        // 상태값으로 스레드를 제어함
        });


        new Thread(() -> {
            while (state) {    // (ture) 상태에서 state 로 변경
                try {
                    Thread.sleep(1000);
                    count++;
                    countLabel.setText("숫자 1: " + count);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();   // 새로운 스레드 2개 생성
        new Thread(() -> {
            while (state) {
                try {
                    Thread.sleep(1000);
                    count2++;
                    count2Label.setText("숫자 2: " + count2);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }).start();   // 런너블은 인터페이스, new가 안됨 new Runnable 안됨 . 그래서 class 를 만들어야 new를 할 수 있음. 그래서 클래스나 메서드 없이 람다식만 넣으면 됨.
        // while 이 있는 스레드는 데몬 스레드. 끝나지 않음.
        // IO 를 줄여야 좋은 프로그램이 됨.
        setVisible(true);


    }
    //  반복문이 종료되지 않아 그 아래 코드는 도달할 수 없는 코드가 됨. 그래서 그 아래를 실행하려면 서브 스레드를 만들어야 됨.
    //메인 스레드는 그림그리는 스레드로 사용. 서브 스레드를 2개 만들기

    public static void main(String[] args) {
        new ThreadEx03();
    }
}
