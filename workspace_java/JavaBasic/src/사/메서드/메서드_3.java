package 사.메서드;

import javax.naming.Name;

public class 메서드_3 {
    public static void main(String[] args) {
        tellYourName("자바");
        tellYourName("먀먕");

//        tellYourName(5); : 매개변수의 자료형이 일치하지 않아 오류! 자료형 일치 필요 !!
    }

    public static void tellYourName(String name){ // String name = "자바"; ...
        System.out.println("제 이름은 " + name + "입니다.");
    }
}
