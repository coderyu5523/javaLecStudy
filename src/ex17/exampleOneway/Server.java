package ex17.exampleOneway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("클라이언트 연결 중");
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트 연결됨");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
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
