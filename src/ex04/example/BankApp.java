package ex04.example;

//


import ex04.example.model.Account;
import ex04.example.model.User;

public class BankApp {
    public static void main(String[] args) {
        // 고객 2명 생성

        User u1 = new User(1, "ssar", "ssar@nate.com");
        User u2 = new User(2, "cos", "sdf@naver.com");

        // 계좌 2개 생성

        Account a1 = new Account(1111, 1000L, 1);
        Account a2 = new Account(2222, 1000L, 2);

        //계좌 이체 하기
        int amount = 100;
        a1.balance = a1.balance - amount;
        a2.balance = a2.balance + amount;

        System.out.println(a1);
        System.out.println(a2);


    }
}
