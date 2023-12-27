package ex06.example09;

public class LotteApp {
    public static void main(String[] args) {

        Burger b1 = new Burger("데리버거", 2000);
        Burger b2 = new ShrimpBurger("새우버거", 2000, "새우");
        Coke c1 = new Coke("콜라", 1000);
        System.out.println();

        BurgerSet set = new BurgerSet(new Burger("데리버거", 2000), new Coke("사이다", 1500)); // 결합코드
//        System.out.println(set.getBurger().getPrice());
//        System.out.println(set.getCoke().getPrice());
        System.out.println("총 가격은:" + set.getTotalPrice());


    }

}
