package ex13;

class Box1 {
    static Object data; // static 은 메인 시작전에 뜨기 때문에 사용자가 타입을 정할 수 없음. 사용자가 뭘 쓸지 모를때는 데이터타입을 오브젝트로 만들 수 밖에 없음.오브젝트의 단점은 메서드사용할 때 다운캐스팅해야됨. 혼자 만드는거면 추상화해서 오버라이딩하면 되는데.
}


public class GenericEx02 {
    public static void main(String[] args) {
        Box1.data = 1;
        Box1.data = "1";
    }

}
