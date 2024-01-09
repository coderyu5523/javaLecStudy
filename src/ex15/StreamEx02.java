package ex15;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);  // ir 은 키보드에 연결된 객체
        char[] ch = new char[4];   // 객체는 ch라는 보조스트림으로부터 리드됨
        try {
            System.out.print("문자를 입력하세요:");
            ir.read(ch);
            for (char c : ch) {
                System.out.print(c + "");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
