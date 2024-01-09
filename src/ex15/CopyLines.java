package ex15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// 상대 경로 : 내 파일(.class)에 위치를 기반으로 경로 정하는 것, 실행되는 위치(프로젝트폴더) src\ex15
// 절대 경로 : 루트에서 부터 경로를 찾는것
// 윈도우 : C:\\workspace\\hello.txt
// 맥,리눅스 : /workspace/hello.txt
public class CopyLines {  //자바에서 파일이 실행되면 jvm 기준으로 어디서 실행되는지 찾아야됨. 실행이되는 파일은 프로젝트 현재ㅡㄴ study
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\ex15\\hello.txt")); // 절대경로 D:\workspace\study\out\production\study\ex15\hello.txt  , 상대경로 : src\ex15\hello.txt
            String line = br.readLine();                                                            // 타겟 new FileReader("src\\ex15\\hello.txt"  , 버퍼의 어려운 점은 타겟 설정을 하는 것

            BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
            bw.write("안녕\n");
            bw.flush();

            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();


            System.out.println("ss\"s\"");
        }
    }
}