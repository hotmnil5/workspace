package 바.배열;

import java.util.Arrays;
import java.util.Scanner;

//간단한 성적처리 시스템 만들기
//국어, 영어, 수학점수를 입력받아 각 과목에 대한 점수 및 총점, 평균을 출력하는 프로그램
public class Test_1_12 {
    public static void main(String[] args) {
        //변수 선언
        Scanner sc = new Scanner(System.in);
        //0:국어, 1:영어, 2:수학, 3:총점
        int[] scores = new int[6];
        //과목명
        String[] subjects = {"국어","영어","수학","사회","과학"};
        //평균
        double avg;
        //점수입력(0~100점 입력까지 무한 입력)
        for(int i = 0; i < scores.length-1; i++){
            while (true){
                System.out.println(subjects[i] + " 점수 : ");
                scores[i] = sc.nextInt();

                if (scores[i] >=0 && scores[i] <= 100){
                    break;
                }
            }
        }
        //총점 및 평균 계산
        for (int i = 0; i < scores.length-1; i++){
            scores[scores.length-1] = scores[scores.length-1] + scores[i];
        }

        avg = scores[scores.length-1] / (double)(scores.length-1);

        //점수 및 총점 평균 출력
        System.out.println("--");
        for (int i = 0; i < subjects.length; i++){
            System.out.println(subjects[i] + " 점수 - " + scores[i]);
        }
        System.out.println("총점 - " + scores[scores.length-1]);
        System.out.println("평균 - " + avg);
    }
}
