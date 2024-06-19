package Interface.student;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyStudnet s = new MyStudnet();

        Student[] students1 = new Student[5];
        Student s1 = new Student("kim", 80, 70, 90);
        Student s2 = new Student("pack", 0, 0, 10);
        Student s3 = new Student("kitty", 80, 100, 90);
        Student s4 = new Student("seo", 100, 100, 100);
        Student s5 = new Student("duck", 100, 100, 90);
        students1[0] = s1;
        students1[1] = s2;
        students1[2] = s3;
        students1[3] = s4;
        students1[4] = s5;

        String result1 = s.getGradeByStudentName(students1, "may");
        System.out.println(result1);

        System.out.println();

        int [] result2 = s.getTotalScoresToArray(students1);
        System.out.println(Arrays.toString(result2));

        System.out.println();

        Student stu = s.getHighScoreStudent(s2, s5);
        System.out.println(stu.getName());
    }
}
