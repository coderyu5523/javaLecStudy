package ex08;

// 책임 : 데이터베이스 상호작용
class Repository {
    String insert(String id, String pw) {
        if (id.length() < 4) {
            return "id의 길이가 4자 이상이어야 합니다.";
        }

        System.out.println("레포지토리 insert 호출됨");
        return "DB에 정상 insert 되었습니다.";
    }

    void select() {

    }
}

// 책임 : 유효성 검사
class Cotroller {
    String join(String id, String pw) {

        if (id.length() < 4) {
            return "id의 길이가 4자 이상이 되어야 합니다.";
        }

        System.out.println("컨트롤러 회원가입 호출됨");
        Repository repo = new Repository();
        String message = repo.insert(id, pw);

        if (!message.equals("DB에 정상 insert 되었습니다.")) {
            return message;
        }


        return "회원가입이 완료되었습니다";
    }

    void login() {
        System.out.println("컨트롤러 로그인 호출됨");
    }

}


public class TryEx03 {
    public static void main(String[] args) {
        Cotroller con = new Cotroller();
        String message = con.join("ssa", "1234");
        System.out.println(message);

    }
}
