package ex13.ex01;


public class Thread2 {

    public void sub1() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Start1 thread:" + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);

            }
        }
    }

    public void sub2() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Start2 thread:" + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);

            }
        }
    }

    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        Thread2 t2 = new Thread2();
        t1.sub1();
        t2.sub2();
    }
}
