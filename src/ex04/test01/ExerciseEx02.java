package ex04.test01;

public class ExerciseEx02 {

    private boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String toString() {
        return "현재 상태는" + (isOn == true ? "켜짐" : "꺼짐");
    }
}
