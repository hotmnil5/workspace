package javaExample;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수 입력 : ");
        num1=sc.nextInt();
        System.out.print("두번째 수 입력 : ");
        num2=sc.nextInt();
        System.out.print("세번째 수 입력 : ");
        num3=sc.nextInt();

        if (num2 > num1&&num2 > num3){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        else if (num3 > num1&&num3 > num2){
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num3 > num2){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + ">" + num2 + ">" + num3);
    }
}
