package 마.반복문.For;

import java.util.Scanner;

public class Test_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        int a = sc.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int b = sc.nextInt();
        int max, min;
        if (a > b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        int num=0;
        for (int i = min + 1; i < max; i++){
            num = num + i;
        }
        System.out.println(num);
    }
}
