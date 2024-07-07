package javaExample2.member;

public class Member {
    private String name;
    private String id;
    private String pw;
    private int age;

    public void setInfo(String name, String id, String pw, int age){
        this.name = name;
        this. id = id;
        this.pw = pw;
        this.age = age;

    }
    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + pw);
        System.out.println("나이 : " + age);
    }
    public static boolean isLogin(String id, String pw){
        if (id == "java" && pw == "abcd1234"){
            return true;
        }
        else if (id == "java" && pw == "abcd"){
        }
        return false;
    }
}
