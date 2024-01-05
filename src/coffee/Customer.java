package coffee;

public class Customer {
    private Baristar baristar;

    public Customer(Baristar baristar) {
        this.baristar = baristar;
    }

    public void order(String menuName) {
        // 커피 메뉴를 주문하면 바리스타를 호출해야됨. 바리스타를 new 할 순 없음

        baristar.makeCoffe();
        System.out.println(new Coffee1().name + "를 주문완료했습니다.");


    }

}
