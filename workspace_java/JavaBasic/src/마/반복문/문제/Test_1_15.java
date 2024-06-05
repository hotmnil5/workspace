package 마.반복문.문제;

import java.util.Scanner;

// 임의의 정수를 입력 받아 1부터 입력받은 수까지 중 짝수의 개수를 구하라
public class Test_1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        int a = 1;
        int cnt = 0;
        while (a < num+1){
            if (a % 2 == 0){
               cnt = cnt + 1;
            }
            a++;
        }
        System.out.println(cnt);
    }
}
