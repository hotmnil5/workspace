package 마.반복문.For;

public class Test_2_6 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;
        for (a = 1; a < 100; a++){
            sum = sum+a;
            if (sum > 300){
                break;
            }
        }
        System.out.println(a);
        System.out.println(sum);

    }
}
