package collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student stu = new Student("오리", 90, 90, 90);
        Student stu1 = new Student("감자", 0,0,10);
        Student stu2 = new Student("키티", 100,100,100);


        studentList.add(stu);
        studentList.add(stu1);
        studentList.add(stu2);

        for (int i = 0; i<studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getSumScore() > 151){
                System.out.println(studentList.get(i));
            }
        }
        int totalScore;
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i).getSumScore() / 3);
        }

    }
}
