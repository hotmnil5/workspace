package 마.반복문.For;

import java.util.Scanner;

public class Test_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int num1 = sc.nextInt();
        int sum = 0;
        for (int a = 1; a < num1+1; a++){
            if(a % 2 == 0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
