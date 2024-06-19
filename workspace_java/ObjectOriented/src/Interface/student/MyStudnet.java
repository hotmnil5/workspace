package Interface.student;

import java.lang.management.GarbageCollectorMXBean;

public class MyStudnet implements StudentUtil{
    @Override
    public String getGradeByStudentName(Student[] students, String name) {
        String grade = "등급없음";
        for (Student stu : students){
            if (stu.getName().equals(name)){
                double avg = stu.getKorScore() + stu.getMathScore() + stu.getEngScore();
               grade = getGradeByAvg(avg);
            }
        }
        return grade;
    }

    // 점수에 따라 등급 결정
    public String getGradeByAvg(double avg) {
        String grade = "등급없음";
        if (avg >= 90 && avg <= 100){
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        }
        else if (avg >= 70){
            grade = "C";
        }
        else{
            grade = "D";
        }
        return grade;
    }

    @Override
    // 매개변수로 받은 다수의 학생들의 총점을 배열로 리턴
    public int[] getTotalScoresToArray(Student[] students) {
        // 학생들의 총점이 저장될 배열 생성
        int[] totalScores = new int[students.length];

        for (int i = 0; i < students.length; i++){
            totalScores[i] = students[i].getKorScore() + students[i].getMathScore() + students[i].getEngScore();
        }
        return totalScores;
    }

    @Override
    public Student getHighScoreStudent(Student stu1, Student stu2) {
        int sum1 = stu1.getKorScore() + stu1.getMathScore() + stu2.getEngScore();
        int sum2 = stu2.getKorScore() + stu2.getMathScore() + stu2.getEngScore();

        return sum1 > sum2 ? stu1 : stu2;
        /*if (sum1 > sum2) {
            return stu1;
        } else {
            return stu2;
        }*/
    }
}
