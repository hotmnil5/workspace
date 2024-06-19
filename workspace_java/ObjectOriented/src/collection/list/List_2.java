package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_2 {
    public static void main(String[] args) {
        // 정수를 다수 저장할 수 있는 list 생성
        List<Integer> list_2 = new ArrayList<>();

        list_2.add(5);
        list_2.add(10);
        list_2.add(15);
        list_2.add(20);

        int a = list_2.get(1);
    }
}
