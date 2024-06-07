package 사.메서드;

public class Test_2_5 {
    public static void main(String[] args) {
        System.out.println(test(80));
    }
    public static String test (int a){
        if (a >= 90){
            return "A";
        }
        else if (a >= 70){
            return "B";
        }
        else {
            return "c";
        }

    }
}
