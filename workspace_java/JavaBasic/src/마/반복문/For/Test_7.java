package 마.반복문.For;

public class Test_7 {
    public static void main(String[] args) {
        int num = 0;
        for (int a = 1; a < 101; a++){
            if (a % 5 == 0){
                System.out.println(a);
                num++;
            }
        }
        System.out.println(num);
    }
}
