package 상속;

import java.sql.SQLOutput;

// 병원에 강아지, 고양이, 송아지 3종류의 동물 관리
// 병원에는 총 10개의 케이지가 존재
// 단, 3종류의 동물 수는 항상 변함
class                                           Animal{
    // 자식 클래스에서 실행하고자 하는 메서드를 오버라이딩 시켜주면
    // 자식 클래스의 메서드를 강제로 실행시킬 수 있다.
    // 오버라이딩 : 상위 클래스가 가지고 있는 메서드를 하위 클래스가 재정의해서 사용하는 것
    // 메서드 명을 같게 해주면 됨.
    public void bark(){
        System.out.println("동물들이 웁니다");
    }
}

// @~~~ : 어노테이션(Annotation) 주석 비슷
// 어노테이션은 개발자의 실수 방지를 위해 사용함.
// 컴파일러에게 코드 작성 문법 에러를 체크하도록 정보를 제공함.
public class Dog extends Animal {
    @Override
    public void bark(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public void bark(){
        System.out.println("야옹");
    }
}

class Cow extends Animal {
    public void bark(){
        System.out.println("음메");
    }
}
