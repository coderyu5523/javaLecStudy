package ex13.examplesample;

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("출금완료");
        } else {
            System.out.println("잔액이 부족합니다");
        }
    }


    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}

public class DeadCall {
    public static void main(String[] args) {

        Account a = new Account(1000);


        new Thread(() -> {
            a.withdraw(1000);

        }).start();

        new Thread(() -> {
            a.withdraw(1000);
        }).start();


    }
}
