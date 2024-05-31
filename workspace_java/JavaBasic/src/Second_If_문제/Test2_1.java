package Second_If_문제;

import java.util.Scanner;

public class Test2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor, eng, math;
        int totalscore;
        double avg;

        System.out.print("국어 점수 :");
        kor = sc.nextInt();
        System.out.print("영어 점수 :");
        eng = sc.nextInt();
        System.out.print("수학 점수 :");
        math = sc.nextInt();

        totalscore = kor+eng+math;
        avg= totalscore / 3.0;
        System.out.println("국어점수 : " + kor);
        System.out.println("영어점수 : " + eng);
        System.out.println("수학점수 : " + math);
        System.out.println("총점 : " + totalscore);
        System.out.println("평균 : " + avg);


    }
}
