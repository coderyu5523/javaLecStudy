package ex04.example02.model2;

public class Account3 {
    int id;
    long balance;
    int userId;

    public Account3(int id, long balance, int userId) {
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
        return "Account3{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
