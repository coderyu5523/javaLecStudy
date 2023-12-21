package ex04.example02.model2;

public class User2 {
    int id;
    String name;
    String phone;

    public User2(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
