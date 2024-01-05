package Coffe;

import java.util.List;

public class Menu {
    private List<String> item;

    // 메뉴 아이템은 커스텀자료형, 데이터를 저장하기 위한 자료형
    // (아메리카노,100), (카푸치노,1500), (마끼아토,1500) (에스프레소,1000)
    public Menu(List<String> item) {
        this.item = item;
    }
}
