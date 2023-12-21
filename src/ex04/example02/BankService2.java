package ex04.example02;

import ex04.example02.model2.Account3;

public class BankService2 {

    public static void transfer(Account3 senderAccount, Account3 receiverAccount, long amount) {
        if (amount <= 0) {
            System.out.println("0원 이하 금액을 이체할 수 없습니다.");
            return;
        }
        senderAccount.withdraw(amount);
        receiverAccount.deposit(amount);

    }
}
