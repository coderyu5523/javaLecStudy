package ex06.example6;

abstract class Judge {
    public abstract void hearing();
}

abstract class Witness {
    public abstract void answer();
}

class King extends Judge {
    public void hearing() {
        System.out.println("왕은 심문한다.");
    }
}

class Queen extends Judge {
    public void hearing() {
        System.out.println("왕비는 심문한다.");
    }
}

class Hatter extends Witness {
    public void answer() {
        System.out.println("모자장수는 대답한다");
    }
}

class Rabbit extends Witness {
    public void answer() {
        System.out.println("토끼는 대답한다");
    }
}

public class AliceApp {
    public static void main(String[] args) {

        Judge king = new King();
        Judge queen = new Queen();
        Witness hatter = new Hatter();
        Witness rabbit = new Rabbit();

        queen.hearing();
        rabbit.answer();
    }
}
