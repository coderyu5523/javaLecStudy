package ex04.example02;

import ex04.example02.model2.Account3;
import ex04.example02.model2.User2;

public class BankApp2 {
    public static void main(String[] args) {

        User2 userKim = new User2(1, "kim", "01012345678");
        User2 userHong = new User2(2, "hong", "01045678945");
        User2 userNam = new User2(3, "nam", "01057841457");

        Account3 accKim = new Account3(1, 10000L, 1111);
        Account3 accHong = new Account3(2, 10000L, 2222);
        Account3 accNam = new Account3(3, 10000L, 3333);

        BankService2.transfer(accKim, accHong, 1000L);
        System.out.println(accKim);
        System.out.println(accHong);
    }


}
