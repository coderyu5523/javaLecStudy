package ex06.example07.EX03;

class Sports {
    String getName() {
        return "아직 결정되지 않음.";
    }

    int getPlayers() {
        return 0;
    }
}

class Soccer extends Sports {
    String name;
    int players;

    public void getName(String name) {
        System.out.println("경기이름:" + name);
    }

    public void getPlayers(int players) {
        System.out.println("경기자수" + players);
    }

}


public class Result {
    public static void main(String[] args) {
        Soccer sc = new Soccer();
        sc.getName("축구");
        sc.getPlayers(11);

    }
}
