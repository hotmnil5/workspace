package 사.메서드;

import 마.반복문.문제.Test_1_9;

import java.util.Scanner;

public class Test_1_1_10 {
    public static void main(String[] args) {
//        test1("안녕하세요");
//        test2("반갑습니다 ");
//        test2("어서오세요");
//        test3(6);
//        test4("야옹");
//        test5(5, 6);
//        test6(2,3,4);
//        test7(5,3);
//        test8("야옹","티비");
//        test9_0("김형진"); test9_1(33); test9_2("울산");
//        test10("김형진",33,"울산");
    }
    // 1번 메서드
    public static void test1(String hello){
        System.out.println(hello);
    }
    // 2_1번 메서드
    public static void test2_1(String welcome){
        System.out.print(welcome);
    }
    // 3번 메서드
    public static void test3(int a){
        System.out.println(a);
    }
    // 4번 메서드
    public static void test4(String text){
        System.out.println(text);
    }
    // 5번 메서드
    public static void test5(int num2, int num3){
        System.out.println(num2 + num3);
    }
    // 6번 메서드
    public static void test6(int num4, int num5, int num6){
        System.out.println(num4 * num5 * num6);
    }
    // 7번 메서드
    public static void test7(int num7, int num8){
        System.out.println(num7 / num8);
        System.out.println(num7 % num8);
    }
    // 8번 메서드
    public static void test8(String text1, String text2){
        System.out.println(text1 + text2);
    }
    // 9번 메서드
    public static void test9_0(String name0){
        System.out.println("이름은 " + name0 + "입니다.");
    }
    public static void test9_1(int age0){
        System.out.println("나이는 " + age0 + "입니다.");
    }
    public static void test9_2(String addr0){
        System.out.println("주소는 " + addr0 + "입니다.");
    }
    // 10번 메서드
    public static void test10(String name, int age, String addr){
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "살입니다.");
        System.out.println("주소는 " + addr + "입니다.");
    }
}
