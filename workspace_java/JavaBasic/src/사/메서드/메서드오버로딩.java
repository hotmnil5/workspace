package 사.메서드;

// overloding
// 메서드명은 원래 중복 불가!
// 하지만 매개변수의 정보가 다르면 중복 허용 == 오버로딩
// 매개변수 정보 : 매개변수의 자료형, 매개변수의 갯수
public class 메서드오버로딩 {
    public static void main(String[] args) {
        System.out.println();

        // 0.0 <= x < 1.0 실수 리턴하는 메서드
        // double a = Math.random();
        Math.random();
    }
    public static void println(){

    }
    public static void println(int a){

    }
    public static void println(String a){

    }
    public static void println(String a, int b){

    }
}
