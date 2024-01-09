package ex17.oneway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);  // 소켓 만드는 법 , 클라이언트가 접속하려면 ip 주소와 포트번호 알아야댐\
            Socket socket = serverSocket.accept(); // 리스너 , 누가 나한테 요청하는지 확인. 서버는 소켓이 최소 2개, 요청이 왔는지 계속 확인하면서 계속 실행됨
            System.out.println("클라이언트 연결됨");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

            while (true) {
                String msg = br.readLine();
                if (msg == null) break;
                System.out.println(msg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
