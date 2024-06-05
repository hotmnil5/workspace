package 마.반복문.문제;

public class Test_1_5 {
    public static void main(String[] args) {
        int num = 2;

        while (num < 11){
            System.out.print(num + " ");
            num = num + 2;
        }

        System.out.println();

        int a = 2;
        while (a <= 10){
            if (a % 2 ==0){
                System.out.print(a + " ");
            }
            a = a + 1;
        }
    }
}
