package ex05;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("슈퍼슈프림");
        Pizza p2 = new Pizza("치즈");
        Pizza p3 = new Pizza("페퍼로니");
        int n = Pizza.count;
        System.out.println("지금까지 판매된 피자 개수 : " + n);


    }
}
