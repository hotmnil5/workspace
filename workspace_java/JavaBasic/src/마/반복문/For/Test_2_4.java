package 마.반복문.For;

public class Test_2_4 {
    public static void main(String[] args) {
        for (int a = 1; a < 100; a++){
            if (a % 7==0 || a % 9==0){
                System.out.println(a);
            }
        }
    }
}
