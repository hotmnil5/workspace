package object;

public class String_2 {
    public static void main(String[] args) {
        // String 객체 생성 방법에 따른 차이점
        String name1 = "java";
        String name2 = "java";
        String name3 = new String("java");
        String name4 = new String("java");

        // '==' : 숫자(정수, 실수)에 사용하면 두 숫자가 같은 숫자인지 확인
        //       숫자를 제외한 나머지 자료형에 대해서는
        //       두 객체가 같은 객체인지 확인(두 객체가 같은 주소에 저장된 데이터인지)
        if (name1 == name2){
            System.out.println(1);
        }

        if (name3 == name4){
            System.out.println(2);
        }
    }
}
