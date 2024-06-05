package 마.반복문;

public class Break_Continue {
    public static void main(String[] args) {
        // 반복문(while, for)에서의 continue 역할

        for (int a = 1; a < 11; a++){
            if (a == 5){
                break;
            }
            System.out.println(a);
        }
        /*for (int i = 1; i < 11; i++){
            System.out.println(i);

            if (i == 5){
                continue;
            }
        }*/
    }
}
