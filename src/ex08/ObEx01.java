package ex08;


class Account { // 모든 클래스는 extends Object 가 생략되어있음
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {

        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}


public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("홍길동", 1111, 1000);
        System.out.println(account);
        System.out.println(account.toString());
        System.out.println(account.getClass());
        System.out.println(account.hashCode());

        if (account.toString() == account2.toString()) {
            System.out.println("같아요");
        }

        // account.equals(account2)  에서는 equals 의 타입이 object ( 주소를 비교).
        // account.toString -> equals 는 먼저 주소를 비교하고, 그 다음에 값을 비교함. int형인 account에서 toString 을 붙여서 문자형으로 만듬. 그럼 equals로 값을 비교할 수있음.
        if (account.toString().equals(account2.toString())) {
            System.out.println("같아요");
        }


    }
}
