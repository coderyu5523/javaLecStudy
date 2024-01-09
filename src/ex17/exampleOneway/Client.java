package ex17.exampleOneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 5000);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("안녕" + "\n");
            bw.write("반가워\n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
