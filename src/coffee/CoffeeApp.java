package coffee;

public class CoffeeApp {
    public static void main(String[] args) {

        Baristar baristar = new Baristar();
        Customer customer = new Customer(baristar);

        customer.order("아메리카노");
        
    }
}
