package 마.반복문.문제;
 // 1부터 10까지의 합
public class Test_1_9 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a < 11){
            sum = sum + a; // sum += a;
            a++;
        }
        System.out.print(sum);
    }
}
