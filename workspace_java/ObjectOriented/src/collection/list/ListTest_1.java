package collection.list;

import Interface.math.MathUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest_1 {
    public static void main(String[] args) {
//        1번 문제
        /*List<String> list = new ArrayList<>();

        list.add("오리");
        list.add("보고");
        list.add("싶어");

        for (int a = 0; a < list.size(); a++){
            System.out.println(list.get(a));
        }*/

//        2번 문제
        /*Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int a = 0; a<5; a++){

            System.out.println("정수 입력 : ");
            int num = sc.nextInt();

            list.add(num);
        }
        int c = 0;
        for (int i = 0; i < list.size(); i++){
            c = c + list.get(i);
        }
        System.out.println(c);*/
//        3번 문제
        /*List<String> list = new ArrayList<>();

        list.add("오리");
        list.add("홍길동");
        list.add("큰오리");
        list.add("작은오리");

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == "홍길동"){
                System.out.println("해당 이름이 존재합니다.");
            }
        }*/
//        4번 문제
        /*List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            int rand = (int)(Math.random() * 100 + 1);
            list.add(rand);
        }
        int cnt = 0;
        for ( int e : list ){
            if( e % 2 == 0 ){
                cnt ++;
                System.out.println(e);
            }
        }
        System.out.println("cnt : " + cnt);*/
    }

}
