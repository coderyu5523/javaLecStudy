package ex14.example2;

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
        data3.put("age", 15);

        List<Map<String, Object>> arr = Arrays.asList(data1, data2, data3);
        System.out.println(arr);

        List<Map<String, Object>> newArr = arr.stream().map(o -> {
            int newAge = (Integer) o.get("age") - 1;
            o.put("age", newAge);
            return o;
        }).toList();

        System.out.println(newArr);

    }
}
