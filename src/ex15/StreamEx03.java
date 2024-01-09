package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx03 {
    public static void main(String[] args) {
        // 보조스트림을 버퍼로 만들기

        InputStreamReader ir = new InputStreamReader(System.in);  // 통신에서는 System.in 이게 상대 컴퓨터의 소켓을 입력함.
        BufferedReader br = new BufferedReader(ir);
        try {
            System.out.print("문자를 입력하세요:");
            String line = br.readLine(); // \n까지 읽음
            System.out.println(line);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
