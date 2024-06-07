package 사.메서드;

public class Test_1_18 {
    public static void main(String[] args) {
        test18(1,10);
        test19("집에가자 ",10);
    }
    public static void test18(int a, int b){
        int max = a > b ? a : b;
        int min = a < b ? a : b;

        int cnt = 0;
        for (int i = min + 1; i < max; i++){
            if (i % 5 == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void test19(String s, int num){
        String result = " ";
        for (int i = 0; i< num; i++){
            result = result + s;
        }
        System.out.println(result);
    }
}
