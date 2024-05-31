package First_If_문제;

public class Test_5 {
    public static void main(String[] args) {
        int x = 90;
        String grade;

        if(x>90 && x<=100){
            grade = "A";
        }
        else if(x>80){
            grade = "B";
        }
        else{
            grade = "C";
        }
        System.out.println("학점은 " + grade + "입니다.");
    }
}
