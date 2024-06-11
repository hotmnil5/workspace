package class_basic.book;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("java", "kim", 1000);
        Book book2 = new Book("python", "lee", 2000);

        Book book3 = book1;
        System.out.println(book1.title);
        System.out.println(book3.title);
        book1.title = "c++";
        System.out.println(book1.title);
        System.out.println(book3.title);

        //기본자료형
        int num = 5;
        int num2 = num;
        double num3 = num2; //(자동형변환, 자료형이 달라도 정수는 실수에 넣을 수 있음)

        /*double num4 = 5.5;
        int num 5 = num4;*/ // 자료형이 달라서 저장 X

        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = arr1;
//        String arr3  = arr3; // 자료형이 달라서 저장 X
    }
}
