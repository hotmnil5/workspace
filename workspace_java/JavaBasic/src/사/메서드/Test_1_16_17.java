package 사.메서드;

public class Test_1_16_17 {
    public static void main(String[] args) {
//        test16(5);
//        test17(1,5);
    }
    public static void test16(int num){
        for (int i = 0; i < num + 1; i++){
            System.out.println(i);
        }
    }
    public static void test17(int num1, int num2){
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;

        for (int i = min + 1; i < max; i++){
            System.out.println(i);
        }
//        int min, max;
//        if (num1 > num2){
//            max = num1;
//            min = num2;
//        }
//        else{
//            max= num2;
//            min = num1;
//        }

    }
}
