package 마.반복문.While;

import 라.조건문.Case_1;

public class Test_5 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;

        while (a < 10) {
            sum = sum + a;
            a++;
        }
        System.out.println(sum);
    }
}
