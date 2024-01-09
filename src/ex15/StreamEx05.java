package ex15;


// 상대경로 : 내 파일(.class)의 위치를 기반으로 경로를 정하는 것
// 절대경로 : 루트에서 부터 경로를 찾는 것
// 윈도우 : c:\workspace\hello.txt
// 맥 리눅스 : /workspace/hello.txt

public class StreamEx05 {
    public static void main(String[] args) {
        System.out.println("안녕 난 \"홍길동\"이야"); // 자바에서 \의 뒤는 무시하게 됨
        System.out.println("c:\\workspace\\hello.txt"); // 그래서 자바에서는 파일 위치 찾을 떄 \\ 로 두번 써여됨
    }
}
