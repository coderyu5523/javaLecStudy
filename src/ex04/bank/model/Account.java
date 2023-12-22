package ex04.bank.model;

public class Account {
    private int id;
    private long balance;
    private int userId;

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    public void withdraw(long amount) {
        this.balance = this.balance - amount;
    }

    public void deposit(long amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
