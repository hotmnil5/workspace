package 마.반복문.문제;

import 마.반복문.While.While_1;

// 1~100까지의 숫자 중 5의 배수인 수를 모두 출력하고,
 // 5의 배수인 수의 개수도 출력
public class Test_1_13 {
    public static void main(String[] args) {
        int a = 1;
        int cnt = 0;
        while (a < 101){
            if (a % 5 == 0){
                cnt = cnt + 1;
                System.out.print(a + " ");
            }
            a++;
        }
        System.out.println();
        System.out.println("5의 배수인 수의 개수 : " + cnt);
    }
}
