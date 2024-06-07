package 사.메서드;

public class Test_1_14 {
    public static void main(String[] args) {
        test14(12);
    }
    public static void test14(int num){
        //삼항연산자
//        int a =
//        참 또는 거짓 (if) 10 > 5 // 앞에 있는 조건이 참일 때 실행 ? 1 // 조건이 거짓일때 실행 : 2;

        if (num % 2 == 0){
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }

        System.out.println(num % 2 == 0 ? "짝수" : "홀수");
    }
}
