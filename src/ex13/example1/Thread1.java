package ex13.example1;


public class Thread1 {

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

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.sub1();
    }
}
