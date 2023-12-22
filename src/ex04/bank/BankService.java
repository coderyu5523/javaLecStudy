package ex04.bank;

import ex04.bank.model.Account;

public class BankService {

    public static void transfer(Account sendAccount, Account receiverAccount, long amount) {

        sendAccount.withdraw(amount);
        receiverAccount.deposit(amount);
    }

    public static void withdraw(Account sendAccount, long amount) {

        sendAccount.withdraw(amount);

    }

}
