package 마.반복문.For;

public class For_1 {
    public static void main(String[] args) {
        /*int i = 1;
         while (i < 11){
             System.out.println(i);
             i++;
         }*/

        /*for(int i = 1; i < 11; i++){
            System.out.println(i);
        }*/

        // 1부터 10까지 합
        int sum = 0;
        for (int a = 1; a < 11; a++){
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
