package ex13.example2;

class MyFile {

    // 하드디스크 기록
    public void write() {
        try {
            Thread.sleep(5000);
            System.out.println("파일쓰기 완료");
            //쓰레드는 멍때리는 시간을 줄일 수 있음, IO 가 오래걸리니까
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


public class ThreadEx02 {
    public static void main(String[] args) {
        new Thread(() -> {
            MyFile mf = new MyFile();                      // 타겟 . 새로운 쓰레드의 메서드 길이
            System.out.println("그림그리기 완료");

        }).start();


    }
}
