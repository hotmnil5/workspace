package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 999까지의 수 중 임의의 숫자를 입력 하세요 : ");
        int num = sc.nextInt();
        // 입력 받은 수가 0보다 작거나 999보다 클 때 재입력
        if (num < 0 || num > 999){
            System.out.print("1부터 999까지 입력 다시 하세요 : ");
            num = sc.nextInt();
        }

        // 100의 자리 수
        int hundred = num / 100;
        // 10의 자리 수
        int tens = (num%100) / 10;
        // 1의 자리 수
        int ones = (num%100) % 10;
        // 박수 횟수
        int clapCnt = 0;

        if (hundred == 3 || hundred == 6 || hundred ==9){
            clapCnt++;
        }
        if (tens == 3 || tens == 6 || tens == 9){
            clapCnt++;
        }
        if (ones == 3 || ones == 6 || ones == 9){
            clapCnt++;
        }
        switch (clapCnt){
            case 0 :
                System.out.println("박수 0번");
                break;
            case 1 :
                System.out.println("박수 1번");
                break;
            case 2 :
                System.out.println("박수 2번");
                break;
            case 3 :
                System.out.println("박수 3번");
                break;
        }

    }
}
