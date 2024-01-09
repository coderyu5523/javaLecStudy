package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("안녕\n");   // \n 내려쓰기 통신은 한번 읽을때 \n까지 읽음. \n 을 두번 쓰면 두번   readline 해야됨.
            bw.write("반가워\n");    // 통신에서 \n을 보내줘야 됨. \n 이 없으면 안읽어서 통신이 안됨. 가긴하는데 상대가 못읽음. 가장 마지막에 \n 은 넣어야됨
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
