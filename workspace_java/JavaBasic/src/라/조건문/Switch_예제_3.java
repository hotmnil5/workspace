package 라.조건문;

import java.util.Scanner;

/*
    점수를 키보드로 입력받음(정수)
    키보드로 입력 받은 점수가
    90 <= x <= 100 'A'
    80 <= x <= 89 'B'
    70 <= x <= 79 'C'
    x < 70 'D'
*/
public class Switch_예제_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = sc.nextInt();

        // 정수와 정수의 연산 결과는 무조건 정수
        // 나누기
        switch (score / 10){
            case 9,10 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }
    }
}
