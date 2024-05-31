package 다.연산자;

import java.util.Scanner;

public class 연습문제 {
    public static void main(String[] args) {

    String name;
    int kor, eng, math;
    int totalScore;
    double avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        name = sc.next();
        // int korScore, engScore, mathScore;
        System.out.print("국어 점수 : ");
        kor = sc.nextInt();
        System.out.print("영어 점수 : ");
        eng = sc.nextInt();
        System.out.print("수학 점수 : ");
        math = sc.nextInt();

        totalScore = kor + eng + math;
        avg = totalScore / 3.0;

        System.out.println("이름 : = " + name);
        System.out.println("국어 점수 : = " + kor);
        System.out.println("영어 점수 : = " + eng);
        System.out.println("수학 점수 : = " + math);
        System.out.println("총점 : = " + totalScore);
        System.out.println("평균 : = " + avg);
    }
}
