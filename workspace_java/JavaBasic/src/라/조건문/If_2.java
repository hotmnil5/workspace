package 라.조건문;

public class If_2 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        int x = 7;

        // x의 값이 7이면 '1' 출력, 그렇지 않으면 '2'를 출력

        // 만약에 ~~가 ~~라면 (그렇다면)
        if(x == 7){
            System.out.println(1);
        }
        // ~~가 ~~지 않다면 (그렇지 않으면)
        else{
            System.out.println(2);
        }


        System.out.println("프로그램 종료");
    }
}
