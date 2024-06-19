package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
    public static void main(String[] args) {
        // ArrayList 객체 생성
        // String 데이터를 다수 저장하기 위한 list(통) 생성
        // 기본자료형은 사용 못 함 -> 래퍼 클래스 사용
        // ArrayList<String> list1 = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        //리스트에 데이터 저장하기
        list1.add("큰 오리");
        list1.add("작은 오리");
        list1.add("헬로키티");
        list1.add("감자");

        // 리스트에 저장된 데이터 읽기, 순번으로 접근
        String result1 = list1.get(1); // "c++"

        // 리스트에 저장된 데이터 삭제
        list1.remove(3);

        // 리스트에 저장된 데이터 수
        System.out.println(list1.size());

        // 리스트에 저장된 모든 데이터 출력
        for (int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
        // 정수 데이터를 다수 저장하기 위한 list(통) 생성
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
    }
}
