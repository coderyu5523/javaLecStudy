package ex17.oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 10000);  // 클라이언트는 연결하려면 IP 와 포트번호가 필요함 "127.0.0.1" 키워드 IP(루프백, 로컬호스트)

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));   //BufferedWriter 버퍼   OutputStreamWriter 보조스트림 getOutputStream 소켓을 출력하기 위함, 한글로보내기 위해 UTF-8 설정
            bw.write("hello" + "\n");                                                                                         // 한글은 3byte, 영어는 1byte 전송되기 때문에 utf8 설정하지 않으면 한글 파일도 1byte로 읽음. 다 깨짐
            bw.write("hi\n");
            bw.flush();

        } catch (IOException e) {

            e.printStackTrace();   // 오류 코드가 자세하게 나옴
        }

    }
}
