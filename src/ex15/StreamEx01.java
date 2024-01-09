package ex15;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {

        InputStream input = System.in; // 하드디스크 입장에서 인풋은 들고오는 것.  System.in 는 키보드로 입력받는 것, 인풋스트림
        try {
            System.out.print("문자를 입력하세요:");
            int value = input.read();
            System.out.println("받은 값:" + (char) value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
