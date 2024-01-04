package ex07;


interface RemoteControl2 {
    public void turnOn();

    public void turnOff();


}

interface AdvancedRemoteControl extends RemoteControl2 {
    public void volumeUp();

    public void volumeDown();
}


public class Test {
    public static void main(String[] args) {

        AdvancedRemoteControl a = new AdvancedRemoteControl() {
            @Override
            public void volumeUp() {

            }

            @Override
            public void volumeDown() {

            }

            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }
        };

        a.volumeDown();


    }
}
