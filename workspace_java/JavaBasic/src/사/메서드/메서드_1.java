package 사.메서드;

import java.awt.event.HierarchyBoundsAdapter;

// 메소드(Method) == 함수(Function)
// 메서드는 반복해서 실행하는 코드를 미리 하나의 기능으로 정의
// 메서드의 사용은 크게 메서드 정의 부분과 메서드호출 부분으로 나뉨.
// 메서드를 사용하려면 반드시 메서드 정의 후 호출을 해야 함!

// 메서드의 정의는 클래스 안 && 다른 메서드 밖에서 선언한다.
// 메서드는 필요한 만큼 무한정 정의할 수 있음
// 메서드명은 중복 불가(대소문자 구분)
// 메서드명 항상 소문자로 작명한다.

//메서드의 정의 문법
/*
    접근제한자 리턴타입 메서드명(매개변수정보){

    }

    public static void 메서드명(){

    }
*/
public class 메서드_1 {
    //메서드의 정의
    public static void hello(){
        System.out.println("hello");
    }

    public static void main(String[] args){
        //메서드의 호출
        hello();
    }
}
