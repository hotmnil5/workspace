package collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        Member mem = new Member();
        mem.setId("오리");
        mem.setPassword("love");
        mem.setName("작은오리");
        mem.setAge(6);

        Member mem1 = new Member("꽥꽥이", "mine", "큰오리", 9);
        Member mem2 = new Member("키티", "hello", "헬로키티", 16);

        memberList.add(mem);
        memberList.add(mem1);
        memberList.add(mem2);

        for (Member member : memberList){
            System.out.println(member);
        }

        int sum = 0;
        for (int i = 0; i < memberList.size(); i++){
            sum = sum + memberList.get(i).getAge();
        }
        System.out.println("나이의 합 : " + sum);

        int index = 0;
        for (int i = 0; i<memberList.size(); i++){
            if (memberList.get(i).getId().equals("키티")){
                index = i;
            }
        }
        memberList.remove(index);

        for (Member member : memberList){
            System.out.println(member);
        }

    }
}
