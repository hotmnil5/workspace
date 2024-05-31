package 다.연산자;

import java.net.SocketTimeoutException;

public class 연산자_3 {
    public static void main(String[] args) {
        int a = 5;
        ++a; // a의 값을 1 증가시킴
        a++; // a의 값을 1 증가시킴
        --a; // a의 값을 1 감소시킴
        a--; // a의 값을 1 감소시킴
        System.out.println(a);

        System.out.println();

        /*증감연산자를 단독으로 사용하는지
          다른 코드와 함께 사용하는지에 따라서 결과가 달라짐.*/
        /* 다른 코드랑 함께 쓰는 경우
           ++a : 먼저 1 증가 후 다른 코드를 실행
           a++ : 다른 코드를 전부 시행 후에 마지막에 1증가*/
        int b = 5;
        System.out.println(++b);
        int c = 5;
        System.out.println(c++);
        System.out.println(c);

        int num1 = 10;
        int result = 10 + num1++;
        System.out.println(result);
        System.out.println(num1);



    }
}
