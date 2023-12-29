package ex08.example;

class user1 {
    String username;
    String password;

    public user1(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "user1{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class String3 {
    public static void main(String[] args) {

        String url = "http://www.naver.com?username=ssar&password=1234";

        String[] arr = url.split("");


    }


}
