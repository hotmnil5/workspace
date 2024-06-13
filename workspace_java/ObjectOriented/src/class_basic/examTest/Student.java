package class_basic.examTest;

public class Student {
    private String name;
    private int age;
    private int score;

    // 매개변수를 받아 모든 맴버변수의 값을 변경하는 생성자
    public Student(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // getter, setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setScore(int score){
        this.score = score;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getScore(){
        return score;
    }

    // 모든 맴버변수의 값을 출력하는 메서드
    public void print(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("점수 : " + score);
    }
}
