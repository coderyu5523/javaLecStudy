package ex08.example;

class User {
    String userName;
    String passward;

    public User(String userName, String passward) {
        this.userName = userName;
        this.passward = passward;
    }


    public String getUserName() {
        return userName;
    }

    public String getPassward() {
        return passward;
    }

    @Override
    public String toString() {
        return "user{" +
                "userName='" + userName + '\'' +
                ", passward='" + passward + '\'' +
                '}';
    }
}

public class StringEx02 {
    public static void main(String[] args) {

        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.naver.com?username=ssar&password=1234";


        String subString1 = "http://www.naver.com?username=ssar&password=1234".substring(21, 34);
        String subString2 = "http://www.naver.com?username=ssar&password=1234".substring(35, 48);

        String parse1[] = subString1.split("=");
        String parse2[] = subString2.split("=");

        // username값과, password값 찾아보기
        User user1 = new User(parse1[1], parse2[1]);
        System.out.println(user1.toString());

    }
}