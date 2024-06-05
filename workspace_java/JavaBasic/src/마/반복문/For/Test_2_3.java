package 마.반복문.For;

public class Test_2_3 {
    public static void main(String[] args) {
        int i =0, k = 0;
        for (i = 1; i < 100; i++){
            k+= i;
            if (k > 100){
                break;
            }
        }
        System.out.println(i);
    }
}
