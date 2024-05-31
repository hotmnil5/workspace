package 다.연산자;

public class 연산자_1 {
    public static void main(String[] args) {
        // 산술 연산자 : +, -, /, *, %
        // % (나머지) mod 연산자
        System.out.println(10 / 4);
        System.out.println(10 % 4);
        System.out.println(10 % 3);

        System.out.println(+10);
        System.out.println(-10);

        // 비교 연산자
        // == 같다
        // != 같지 않다
        // > , >=, <, <=
        System.out.println(5 >= 3);

        // 논리 연산자(맞다(참), 틀리다(거짓))
        // && 그리고, || 그러나
        int x = 7;
        boolean r1 = x > 5 && x <=10;

//        int a = 10;
//        int b = 5;
//        boolean r2 = a>=b;

//        int a = 10;
//        int b = 20;
//        int c = 5;
//        boolean r3 = a<b && a>c;

//        int a = 8;
//        boolean r4 = a+3 != 10;

//        a는 10보다 크거나 b와 같다
        int a = 11;
        int b = 11;
            boolean r5 = a>10 || b==a;
    }
}
