package ex13;


class Account {
    public int balance = 1000;

    public void withdraw(int amount) {
        if (amount <= balance) {
            this.balance = balance - amount;
            System.out.println("출금완료" + amount);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}

public class DeadEx01 {
    public static void main(String[] args) {


        Account account = new Account();

        Thread subThread1 = new Thread(() -> {
            account.withdraw(1000);
        });
        subThread1.start();

        Thread subThread2 = new Thread(() -> {
            account.withdraw(1000);
        });
        subThread2.start();
    }
}

