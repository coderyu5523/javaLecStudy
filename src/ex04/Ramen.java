package ex04;

interface 행위 {
    void start();
}


class 라면끓이기 {

    public void 물끓이기() {
    }

    public void 면넣기() {
    }

    public void 스프넣기() {
    }

    public void 계란넣기() {
    }


}


public class Ramen {
    public static void main(String[] args) {
        라면끓이기 la1 = new 라면끓이기();
        la1.물끓이기();
        la1.면넣기();
        la1.스프넣기();
        la1.계란넣기();

    }
}
