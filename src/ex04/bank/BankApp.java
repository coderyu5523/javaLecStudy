package ex04.bank;

import ex04.bank.model.Account;
import ex04.bank.model.User;

public class BankApp {
    public static void main(String[] args) {

        User kim = new User(1, "kim", "01012345678");
        User han = new User(2, "han", "01012345547");
        User ohh = new User(3, "ohh", "01012531678");

        Account accountkim = new Account(1, 10000L, 1111);
        Account accounthan = new Account(2, 10000L, 2222);
        Account accountohh = new Account(3, 10000L, 3333);


        BankService.transfer(accountkim, accounthan, 1000L);
        System.out.println(accountkim);
        System.out.println(accounthan);
        System.out.println(accountohh);


    }
}
