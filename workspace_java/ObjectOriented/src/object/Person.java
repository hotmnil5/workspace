package object;

public class Person {
    String name;
    int age;

    // 부모클래스의 메서드를 오버라이딩
    // 오버라이딩이 되려면 메서드명 일치, 매개변수 정보 일치, 리턴 타입 일치

    @Override
    public boolean equals(Object obj) { // Object obj = p2;
        // return super.equals(obj);
        // String 클래스 안에 equals 메서드가 존재하기 때문에 name. + equals 작성 가능
        // Object class : 부모 클래스 -> equals 메서드 상속
        if (name.equals( ((Person)obj).name) && age == ((Person)obj).age){
            return true;
        }
        else {
            return false;
        }
    }

    // ctrl + o = 오버라이딩 단축키
    // Alt + Insert = Generate 단축키
    // toString() 오버라이딩
    // 객체를 문자열로 표현 -> 모든 맴버변수의 값을 문자열로 표현

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
