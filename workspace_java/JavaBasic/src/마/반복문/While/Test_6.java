package 마.반복문.While;

public class Test_6 {
    public static void main(String[] args) {
        int a = 1;

        while (a <= 100){
            if (a % 3 == 0){
                System.out.println(a);
            }
            a++;
        }
    }
}
