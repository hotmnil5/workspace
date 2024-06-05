package 마.반복문.문제;

import java.sql.SQLOutput;

public class Test_1_11 {
    public static void main(String[] args) {
        int a = 1;
        int num = 0;

        while (a < 101){
            if (a % 3 == 0){
                num = num + 1;
            }
            a++;
        }
        System.out.println(num);
    }
}
