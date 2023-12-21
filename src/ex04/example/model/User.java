package ex04.example.model;
// 모든 오브젝트는 고유번호가 있어야한다.
//

public class User {
    final int id;  // 고유번호 한번 초기화 되면 변경되지 않음. 그래서 final
    String name;
    String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
