package 마.반복문.For;

public class Test_6 {
    public static void main(String[] args) {

        int num = 0;
        for(int a = 1; a < 101; a++){
            if (a % 3 == 0){
                num++;
            }
        }
        System.out.println(num);

    }
}
