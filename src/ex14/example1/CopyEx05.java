package ex14.example1;

import java.time.LocalDateTime;

// Data Transfer Object
class JoinDTO {
    private String userName;
    private String password;
    private String email;

    public JoinDTO(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}


class Member {
    private int no;
    private String userName;
    private String password;
    private String email;
    private LocalDateTime createdAt; // 생성시간

    public Member(User user) {
        this.no = no;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.createdAt = createdAt;
    }

    public Member(int no, String userName, String password, String email, LocalDateTime createdAt) {
        this.no = no;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.createdAt = createdAt;
    }

    public Member(int no, JoinDTO user, LocalDateTime createdAt) {
        this.no = no;
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.createdAt = createdAt;
    }

    public int getNo() {
        return no;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", 생성시간=" + createdAt +
                '}';
    }
}


public class CopyEx05 {
    public static void main(String[] args) {

        //d1 을 멤버에 옮기고 d1를 멤버에 옮김
        //

        JoinDTO d1 = new JoinDTO("ssar", "1234", "ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos", "1234", "cos@nate.com");

        Member m1 = new Member(1, d1.getUserName(), d1.getPassword(), d1.getEmail(), LocalDateTime.now());
        Member m2 = new Member(1, d1, LocalDateTime.now());

        Member m3 = new Member(2, d2.getUserName(), d2.getPassword(), d2.getEmail(), LocalDateTime.now());
        Member m4 = new Member(2, d2, LocalDateTime.now());


        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//    }
    }
}
