package ex05;

//싱글톤/ 힙에 띄우면서도 한번만 뜨게 관리할 수 있다.
class President {

    static President instance = new President();  // 메인 실행 전 해당 라인  실행됨.

    private President() {

    }
}

public class SingleTonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance;  //
        System.out.println(p1.hashCode()); // 객체.hashCode 를 검색하면 객체 주소가 나옴.;

        President p2 = President.instance;
        System.out.println(p2.hashCode());


    }
}
