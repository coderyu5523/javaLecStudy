package ex14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StreamEx01 {
    public static void main(String[] args) {

        Map<String, Object> data1 = new HashMap<>();
        data1.put("name", "홍길동");
        data1.put("age", 20);

        Map<String, Object> data2 = new HashMap<>();
        data2.put("name", "장보고");
        data2.put("age", 15);

        Map<String, Object> data3 = new HashMap<>();
        data3.put("name", "이순신");
        data3.put("age", 30);

        // 연속적으로 데이터를 저장하고 싶으면 어레이리스트!
        List<Map<String, Object>> arr = Arrays.asList(data1, data2, data3);
        System.out.println(arr);

        List<Map<String, Object>> newArr = arr.stream().map(d -> {
            int newAge = (Integer) d.get("age") - 1;
            d.put("age", newAge);

            return d;
        }).toList();


        // 클래스를 안만들고 맵을 쓰면 편함. 클래스와는 다르게 메서드를 따로 만들 수 없음.
        // 근데 클래스랑 비교했을 때 맵은 키값에서 오타를 낼 수 있음 , 값을 리턴할 때 오브젝트로 나오기 때문에 다운캐스팅 해야됨.
        //맵을 만들어서 쓸 일은 없다. 데이터 자료형 만드려면 클래스로 만들면 된다. 다른 사람이 쓴걸 써야됨.


    }
}
