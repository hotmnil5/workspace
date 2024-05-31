package 라.조건문;

import java.util.Scanner;

public class 예제_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int num = sc.nextInt();

        if(num > 10){
            System.out.println("당신은 귀요미입니다.");
        }
    }
}
