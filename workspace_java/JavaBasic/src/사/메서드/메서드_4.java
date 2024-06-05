package 사.메서드;

public class 메서드_4 {
    public static void main(String[] args) {
        introduce("야옹", 18, "울산광역시 남구");

        String a = "홍길동";
        int b = 40;
        String c = "서울";

        introduce(a, b, c);
    }

    public static void introduce(String name, int age, String addr){
        // String name = a;
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
    }
}
