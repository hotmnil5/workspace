package 사.메서드;

public class Test_2_9 {
    public static void main(String[] args) {
        System.out.println(num(5));
    }
    public static int num(int a){
        int sum = 0;
            for (int i = 1; i < a+1; i++){
                if (i % 2 != 0){
                    sum = sum + i;
                }
            }
            return sum;
    }
}
