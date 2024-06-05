package 마.반복문.While;

public class Test_7 {
    public static void main(String[] args) {
        int a = 1;
        int num = 0;
        while (a<=100){
            if (a % 3 == 0){
                num = num+1;
            }
            a++;
        }
        System.out.println(num);
    }
}
