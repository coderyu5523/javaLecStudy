package ex04.example;

//


import ex04.example.model.Account;
import ex04.example.model.User;

public class BankApp3 {
    public static void main(String[] args) {
        // 고객 2명 생성

        User u1 = new User(1, "ssar", "ssar@nate.com");
        User u2 = new User(2, "cos", "sdf@naver.com");

        // 계좌 2개 생성

        Account a1 = new Account(1111, 1000L, 1);
        Account a2 = new Account(2222, 1000L, 2);




        //계좌 이체 하기 , balance >=0 조건이 필요함

        int amount = 1000;            // 이 세 정보는 고객에게 받는 것.
        int sender = 1111;
        int reseiver = 2222;

        //일의 최소 단위 == 트랜잭션
        // 이체금액 검증
        if (amount <= 0) {                     // 비정상을 if 에 넣어서 걸러내는 용도로 사용해야 깔끔해짐
            System.out.println("금액을 확인하세요");
            return;
        }


        // 잔액검증
        if (a1.balance < amount) {         // 비정상을 if 에 넣어서 걸러내는 용도로 사용해야 깔끔해짐
            System.out.println("잔액부족");
            return; // 메인 큐를 종료
        }
        //계좌검증
        if(a1.id !=sender){
            System.out.println("해당 계좌번호는 존재하지 않습니다.");
            return;
        }
        if(a2.id !=reseiver){
            System.out.println("받는 분의 계좌를 확인하세요");
        }

        // 이체
        a1.balance = a1.balance - amount;
        a2.balance = a2.balance + amount;
        // 이체 결과 확인
        System.out.println(a1);
        System.out.println(a2);


    }
}
