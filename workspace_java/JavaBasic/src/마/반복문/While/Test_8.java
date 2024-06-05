package 마.반복문.While;

public class Test_8 {
    public static void main(String[] args) {
        int a = 1;
        int num = 0;
        while (a<=100){
            if (a % 5 == 0){
                System.out.println(a);
                num = num+1;
            }
            a++;
            System.out.println(num);
        }
    }
}
