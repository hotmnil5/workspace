package Second_If_문제;

import java.time.temporal.Temporal;
import java.util.Scanner;

public class Test2_3 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수 입력하삼");
        num1 = sc.nextInt();
        System.out.println("두번째 수 입력하삼");
        num2 = sc.nextInt();
        System.out.println("세번째 수 입력하삼");
        num3 = sc.nextInt();

        System.out.println();
        System.out.println("첫번째 수 : " + num1);
        System.out.println("두번째 수 : " + num2);
        System.out.println("세번째 수 : " + num3);

        if(num2 > num1 && num2 > num3){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        else if(num3 > num1 && num3 > num2){
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if(num3 > num2){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + ">" + num2 + ">" + num3);
    }
}
