package javaExample2.member;

public class MemberTest {
    public static void main(String[] args) {
        Member member = new Member();
        member.setInfo("자바","java","abcd1234",20);
        member.showInfo();

        member.isLogin("java","abcd");
        if(member.isLogin("java","abcd1234")==true){
            System.out.println("로그인 가능");
        }
        else if (member.isLogin("java","abcd")==false){
            System.out.println("로그인 불가능");
        }
    }
}
