package Second_If_문제;

import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수 입력하삼");
        num1 = sc.nextInt();
        System.out.print("두번째 수 입력하삼");
        num2 = sc.nextInt();
        int max;
        int min;
        System.out.println("첫번째 수 : " + num1);
        System.out.println("두번째 수 : " + num2);


        if (num1 > num2){
           max = num1;
           min = num2;
        }
        else{
            max = num2;
            min = num1;
        }
        System.out.println(max + ">" + min);
    }
}
