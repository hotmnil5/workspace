package 라.조건문;

import java.util.Scanner;

public class Switch_예제_1 {
    public static void main(String[] args) {
        // 키보드로 정수 하나를 입력 받아.
        // 입력받은 값이 짝수이면 '1' 출력
        // 홀수면 '2' 출력
        // switch case break 문으로 해결

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력하삼");
        int num = sc.nextInt();
        // int mod = num % 2;

        //switch(mod){
            //case 0:
                //System.out.println(1);
                //break;
            //case 1:
                //System.out.println(2);
                //break;
            // default:
                //System.out.println(0);
        // }

        switch (num % 2){
            case 0 :
                System.out.println(1);
                break;
            case 1 :
                System.out.println(2);
                break;
            default:
                System.out.println(0);
        }

    }
}
