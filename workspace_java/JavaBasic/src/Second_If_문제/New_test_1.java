package Second_If_문제;

import java.util.Scanner;

public class New_test_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수 ");
        int num1 = sc.nextInt();
        System.out.print("두번째 수 ");
        int num2 = sc.nextInt();
        System.out.print("연산자 ");
        String s1 = sc.next();

        if (s1.equals("+")){
            System.out.println(num1 + s1 + num2 + " = " + (num1 + num2));
        }
        else if (s1.equals("-")){
            System.out.println(num1 + s1 + num2 + " = " + (num1 - num2));
        }
        else if (s1.equals("*")){
            System.out.println(num1 + s1 + num2 + " = " + (num1 * num2));
        }
        else if (s1.equals("/")){
            System.out.println(num1 + s1 + num2 + " = " + ((double) num1 / (double) num2));
        }
        else {
            System.out.println("연산자를 잘못 입력하였습니다.");
        }

    }
}
