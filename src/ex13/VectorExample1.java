package ex13;


import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {

        Vector<String> vec = new Vector(); // 크기는 0, 오브젝트 타입, 제네릭을 써서 자료형 받을 수 있음
        vec.add("APPLE");
        vec.add("ORANGE");
        vec.add("MANGO");
        vec.add("STRAWBERRY");

        //크기
        System.out.println(vec.size());

        //인덱스 접근 .get(i) 로 인덱스값 확인할 수 있음
        System.out.println(vec.get(1));

        //정렬(오름차순)
        Collections.sort(vec);

        for (String s : vec) {
            System.out.print(s + " ");
        }
        //정렬(내림차순)
        Collections.sort(vec, Collections.reverseOrder());
        System.out.println();
        for (String s : vec) {
            System.out.print(s + " ");
        }

        //정렬 다른방법
        //Arrays.sort() 이거는 배열 정렬 , 컬렉션 정렬은 안됨
        System.out.println();
        //삭제
        String result = vec.remove(3);
        System.out.println(result);

        System.out.println(vec.size());

        //값 찾기


        boolean search = vec.contains("mango");
        System.out.println(search);
        // 값 찾기 (대소문자 구분 없이)
        String a = "Mango";

        boolean check = a.equalsIgnoreCase("mAngo");
        System.out.println(check);


    }
}
