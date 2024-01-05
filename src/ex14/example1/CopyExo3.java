package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class CopyExo3 {

    public static void main(String[] args) {
        //기존값을 유지하면서 복사

        List<Integer> list = Arrays.asList(1, 2, 3, 4);


        List<Integer> newList = list.stream().filter(i -> i < 3).toList();

//        List<Integer>list2= new ArrayList<>();
//        for(Integer i :list){
//            if (i < 3) {
//                list2.add(i);
//            }
//        }

        newList.stream().forEach(i -> System.out.println(i));  // 위의 주석 코드랑 같은 의미


    }
}
