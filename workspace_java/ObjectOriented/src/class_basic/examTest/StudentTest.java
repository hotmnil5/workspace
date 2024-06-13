package class_basic.examTest;

public class StudentTest {
    public static void main(String[] args) {
        // 학생(student class)을 5명 저장할 수 있는 배열 생성
        Student[] students = new Student[5];

        // 배열에 저장할 학생 객체 생성
        Student s1 = new Student("꽥꽥", 20, 80);
        Student s2 = new Student("작오", 4, 85);
        Student s3 = new Student("큰오", 9, 90);
        Student s4 = new Student("키티", 14, 100);
        Student s5 = new Student("감자", 36, 10);

        // 배열 요소에 학생 저장
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        // 1. 배열에 저장된 모든 학생의 이름, 나이, 점수를 출력
        /*for (int i = 0; i < students.length; i++){
            students[i].print();
            System.out.println();
        }*/

        // 1번 문제를 for-each문으로 해결
       /* for (Student s : students){
            s.print();
        }*/

        // 2. 배열에 저장된 학생 중 점수가 80점 이상인 학생의 이름, 나이, 점수 출력
        /*for (int i = 0; i < students.length; i++){
            if (students[i].getScore() >= 80){
                students[i].print();
            }
        }*/

        // 3. 이름이 '오리'인 학생을 찾아 해당 학생의 나이를 10으로 변경
        for (int i = 0; i < students.length; i++){
            if (students[i].getName().equals("꽥꽥")){
                students[i].setAge(10);
                students[i].print();
            }
        }

        for (Student stu : students){
            if (stu.getName().equals("꽥꽥")){
                stu.setAge(10);
                stu.print();
            }
        }
    }
}
