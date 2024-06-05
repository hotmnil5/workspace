package 사.메서드;

public class Test_1_1_6 {
    public static void main(String[] args) {
//        test1();
//        test2_1();
//        test2_2();
//        test3(5);
//        test4("먀옹");
//        test5(10, 20);
//        test6(1,2,3);
//        test7(10,3);
//        test8("집에","가고싶다");
        /*test9_1("꽥꽥이");
        test9_2(1);
        test9_3("은송이 마음속");*/
        test10("오리",10,"은송이 마음 속");

    }
    //1번 메서드
    public static void test1(){
        System.out.println("안녕하세요");
    }
    //2
    public static void test2_1(){
        System.out.print("반갑습니다. ");
    }
    //2_1
    public static void test2_2(){
        System.out.println("어서오세요.");
    }
    //3
    public static void test3(int num){
        System.out.println(num);
    }
    //4
    public static void test4(String str){
        System.out.println(str);
    }
    //5
    public static void test5(int a, int b){
        System.out.println(a + b);
    }
    //6
    public static void test6(int a, int b, int c){
        System.out.println(a * b * c);
    }
    //7
    public static void test7(int num1, int num2){
        System.out.println("몫 :" + num1/ num2);
        System.out.println("나머지 : " + num1 % num2);
    }
    //8
    public static void test8(String s1, String s2){
        System.out.println(s1 + s2);
    }
    //9
    public static void test9_1(String name){
        System.out.println(name);
    }
    public static void test9_2(int age){
        System.out.println(age);
    }
    public static void test9_3(String addr){
        System.out.println(addr);
    }
    //10
    public static void test10(String name, int age, String addr){
        test9_1(name);
        test9_2(age);
        test9_3(addr);
    }
}
