package ex06.example09;

public class LotteApp {
    public static void main(String[] args) {

        BurgerSet set = new BurgerSet(new Burger("불고기버거", 2000), new Coke("코카콜라", 1500));
        System.out.println("총가격" + set.getTotalPrice());

        // 결합코드
//        System.out.println(set.getBurger().getPrice());
//        System.out.println(set.getCoke().getPrice());


//        Burger b1 = new Burger("불고기 버거", 2000);
//        Coke c1 = new Coke("콜라", 1000);
//        System.out.println();

    }

}
