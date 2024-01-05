package Coffe;

public class Customer {

    private Baristar baristar;

    public Customer(Baristar baristar) {
        this.baristar = baristar;         //여기서 고객의 주문을 넘겨받음
    }

    public void order(String menuName) {
        //고객은 주문의 책임
        // 메뉴가 있으면 바리스타에게 호출

        // Brista b = new Baristar(); 이거는 주문할 때 마다 바리스타가 만들어짐. 이미 메인에서 바리스타가 만들어져있음
        Coffe coffee = baristar.makeCuffe();

    }
}
