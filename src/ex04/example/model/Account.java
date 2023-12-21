package ex04.example.model;

public class Account {
    public final int id; // 계좌번호 (제약조건 숫자 4자리로 만들어져있다). 계좌번호는 숫자지만 연산도 하지 않고 길기 때문에 String으로. 지금은 int로 함
    // final 코드는 new로 초기화 되는 코드가 있어야 됨. 생성자를 만들면 오류가 나지 않음.
    public long balance; // 잔액
    public int userId;  // 누구의 계좌인지

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;

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
