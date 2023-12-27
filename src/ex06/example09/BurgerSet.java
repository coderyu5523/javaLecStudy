package ex06.example09;

public class BurgerSet {   // has 버거 , has 콜라
    private Burger burger;  // 컴포지션 코드.  상태를 적는다.
    public Coke coke;

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println(burger.getName() + "세트가 만들어졌어요");
    }

    public int getTotalPrice() {
        return getBurger().getPrice() + getCoke().getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
