package 사.메서드;

public class Test_3_1_4 {
    public static void main(String[] args) {
//        test1(5);
//        test2(3);
//        System.out.println(test3());
        System.out.println(test4(4));

    }
    //test1
    public static void test1(int a){
        for (int i = 1; i < 10; i++){
            System.out.println(a + "*" + i + "=" + a*i);
        }
    }
    //test2
    public static void test2(int a){
        for (int i = 1; i < 101; i++){
            if (i % a == 0){
                System.out.println(i);
            }
        }
    }
    //test3
    public static int test3(){
        return (int)(Math.random() * 50 + 1);
    }
    //test4
    public static boolean test4(int a){
        return a % 2 == 0 ? true : false;
//        return a % 2 == 0;
    }
}
