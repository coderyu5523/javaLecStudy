package ex05.example01;

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        System.out.println("balance=" + balance);

        this.balance = balance;
    }

    public void transfer(int amount, BankAccount otherAccount) {
        this.balance = this.balance - amount;
        balance = balance + amount;
    }

}


public class ex01 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(10000);
        BankAccount a2 = new BankAccount(0);

    }
}
