package 다.연산자;

public class 연산자_2 {
    public static void main(String[] args) {
        // '!' 부정연산자 : 참 또는 거짓의 결과를 반대로 만듦.
        boolean b1 = true;
        System.out.println(!b1);
        System.out.println(b1);

        b1 = !b1;
        System.out.println(b1);
        System.out.println(!b1);

        // 대입연산자
        int num = 5;
        num = num+1;
        //num += 1;
        System.out.println(num);
    }
}
