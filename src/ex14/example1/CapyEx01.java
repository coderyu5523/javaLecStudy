package ex14.example1;

import java.util.ArrayList;
import java.util.List;

public class CapyEx01 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(); // var 타입형은 자료가 들어올 떄 타입이 결정됨
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //새로운 객체를 복사해서 자료를 그대로 받고 싶을 떄

//        var newList = new ArrayList<>();             // 스트림 이전의 자료 복사 방법
//        for (int i = 0; i < list2.size(); i++) {
//            newList.add(list2.get(i));
//        }
        var newList = list.stream().toList();  // list2.stream 자료를 흩뿌림. map 은 흩뿌려진 자료를 순서대로 순회, var 은 스트링타입으로 변환됨.

        System.out.println(list.hashCode());
        System.out.println(newList.hashCode());

        list.add(6);

        System.out.println(list.hashCode());
        System.out.println(newList.hashCode());

        //컬렉션 복사
        List<Integer> newList1 = new ArrayList<>(list);

        System.out.println(newList1);

        System.out.println(list.size());

    }
}
