package Coffe;

public class CoffeeApp {
    public static void main(String[] args) {
        //바리스타, 고객은 누가 new를 하지 않기 때문에 메인에서 new 를 해야 됨

        Baristar bar1 = new Baristar();
        Customer cus1 = new Customer(bar1);  // 고객이 바리스타에게 요청함. 고객은 바리스타한테 의존적이다. 그래서 메인에서 뉴해서 바리스타에게 넘김. 의존적인 관계에서는 생성자를 통해 전달받음

        cus1.order("아메리카노");

        ;

    }
}
