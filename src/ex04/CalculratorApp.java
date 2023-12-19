package ex04;

public class CalculratorApp {
    public static void main(String[] args) {
        Calculrator cal = new Calculrator();
        // 프로그램이 시작하기 전에 메모리에 띄우려면 static , 원할때 듸워려면 new static이 없는 클래스의 모든게 뜸
        double add1 = cal.add(50, 40);
        double minus1 = cal.minus(50, 40);
        double multi1 = cal.multi(50, 40);
        double divide1 = cal.divide(90, 40);
        System.out.println("add:" + add1);
        System.out.println("minus:" + minus1);
        System.out.println("multi:" + multi1);
        System.out.println("divide:" + divide1);

    }

}
