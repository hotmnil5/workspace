package 다.연산자;

/*534자루의 연필을 30명의 학생들에게 똑같이 나누어 주었을 때 학생들이 각자 갖게
  되는 연필 개수와 남은 연필의 개수는?*/
public class 초등산수문제 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

//        int pencilsPerStudent = pencils / students;
//        System.out.println(pencilsPerStudent);

//        int pencilsLeft = pencils % students;
//        System.out.println(pencilsLeft);

        System.out.println(pencils / students);
        System.out.println(pencils % students);

    }
}
