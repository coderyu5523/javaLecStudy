package ex13.example1;


public class Hello {

    public static void start1() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Start1 thread:" + i);
                Thread.sleep(1000); //CPU가 풀로 돌고 있으면 간섭을 할 수가 없다. 그래서 맘추는 틈을 만들어주는게 sleep. 컨텍스트 스위칭
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void start2() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Start2 thread:" + i);
                Thread.sleep(1000); //CPU가 풀로 돌고 있으면 간섭을 할 수가 없다. 그래서 맘추는 틈을 만들어주는게 sleep. 컨텍스트 스위칭
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //메인 쓰레드.,os가 여기저기 프로세스 왔다갔다를 관리함.
    public static void main(String[] args) {
        // 실을 만드는 것.
        Thread t1 = new Thread(() -> {        // 콜백. 운영체제한테 메서드를 호출했는데 운영체제는 runable 메서드를 호출함
            start1();
        }); // () 안에 메서드 넣어야됨
        t1.start();   // 실을 시작하는 것

        // 메인쓰레드는 런만 호출함.


        Thread t2 = new Thread(() -> {
            start2();
        });
        t2.start();

        // 동기식 실행, 데이터의 일관성, 프로그래밍에서는 일의 순서가 있다는 것.  일을 다 끝내고 처리하는것을 타스트 task. 비동기적은 순서대로가 아니라 처리가 빨리 되 수 있는것을 먼저 처리하는 방식 같은.. 라운드로빈 방식 ,작은거 먼저 하는방식 ...
        // 웨이팅 시간을 줄이는 것. 비동기적으로 일하는게  cpu가 쉬는 시간을 줄임.


    }  // 메인스레드 종료. 자바는 스레드가 하나라도 살아있으면 종료 안됨 서브 스레드가 살아있기 때문에
}
