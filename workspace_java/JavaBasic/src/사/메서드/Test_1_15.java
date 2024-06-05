package 사.메서드;

public class Test_1_15 {
    public static void main(String[] args) {
        test15(5, 2);
    }
    public static void test15(int num1, int num2){
        if (num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("두 수는 짝수입니다.");
        }
        else if (num1 % 2 == 0 || num2 % 2 ==0){
            System.out.println("한 수만 짝수입니다.");
        }
        else {
            System.out.println("두 수는 홀수입니다.");
        }
    }
}
