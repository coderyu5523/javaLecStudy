package ex17.exampleHalf;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            System.out.println("클라이언트 연결 중");
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트 연결 완료");

            BufferedReader br1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {

                String msg = br1.readLine();
                if (msg == null) break;
                System.out.println(msg);

                BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bw1.write("check\n");
                bw1.flush();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
