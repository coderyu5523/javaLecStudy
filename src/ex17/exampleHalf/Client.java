package ex17.exampleHalf;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("127.0.0.1", 3000);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("안녕 반가워");
            bw.write("연락 받았니?\n");
            bw.flush();

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
