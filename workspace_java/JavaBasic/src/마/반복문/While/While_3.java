package 마.반복문.While;

public class While_3 {
    public static void main(String[] args) {
//        int a = 10;
//
//        while (0<=a){
//            System.out.println(a);
//            --a;
//        }

        // 1부터 20까지의 수 중에서 짝수만 출력
//        int a = 1;
//
//        while (a <= 20){
//            System.out.println(a);
//            a = a + 2;
//        }

        // 1부터 5까지의 수 중에서 짝수만 출력
        int a = 1;

        while (a <= 5){
            if (a % 2 == 0){
                System.out.println(a);
            }
            a++;
        }
    }
}
