package ex03;

import java.util.ArrayList;

public class ArraylistTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(); //ArraylistTest<> 자료형
        list.add("철수");
        list.add("영희");
        list.add("순신");
        list.add("지영");


        list.remove(3); // 인덱스 3을 삭제

        System.out.println(list.get(3));
    }


}

