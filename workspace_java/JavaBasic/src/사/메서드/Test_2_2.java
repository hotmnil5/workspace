package 사.메서드;

import java.util.Scanner;

public class Test_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 작성하세요");
        int a = sc.nextInt();
        System.out.print("두번째 정수를 작성하세요");
        int b = sc.nextInt();
        System.out.println(num(a,b));
    }
    public static int num(int i, int f){
        return i*f;
    }
}
