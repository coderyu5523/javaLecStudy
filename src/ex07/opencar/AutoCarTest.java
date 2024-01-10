package ex07.opencar;

public class AutoCarTest {
    public static void main(String[] args) {
        OperateCar obj = new AutoCar();
        obj.start();
        obj.stop();
        obj.setSpeed(30);
        obj.turn(15);


    }
}
