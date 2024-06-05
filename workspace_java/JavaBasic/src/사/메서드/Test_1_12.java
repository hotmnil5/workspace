package 사.메서드;

import java.util.Scanner;

public class Test_1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = sc.next();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("주소 입력 : ");
        String addr = sc.next();
        test12(name,age,addr);
    }
    public static void test12(String name1, int age1, String addr1){
        System.out.println("이름은 " + name1 + "입니다.");
        System.out.println("나이는 " + age1 + "살입니다.");
        System.out.println("주소는 " + addr1 + "입니다.");
    }
}
