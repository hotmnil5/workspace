package 사.메서드;

import java.util.Scanner;

public class Test_1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수 입력 :");
        int x = sc.nextInt();
        System.out.print("두번째 수 입력 :");
        int y = sc.nextInt();
        test13(x, y);
    }
    public static void test13(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
