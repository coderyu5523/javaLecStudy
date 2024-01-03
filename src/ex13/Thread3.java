package ex13;

public class Thread3 {

    public void sub1() {
        try {
            Thread.sleep(5000);
            System.out.println("프로그램 구동");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void sub2() {
        try {
            Thread.sleep(1000);
            System.out.println("기본 화면 표시");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {

        Thread3 t = new Thread3();

        Thread thread1 = new Thread(() -> {
            t.sub1();
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            t.sub2();
        });
        thread2.start();
    }
}
