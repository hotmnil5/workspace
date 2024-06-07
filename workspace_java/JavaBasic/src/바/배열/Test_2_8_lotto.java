package 바.배열;

import java.util.Arrays;

public class Test_2_8_lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];


        for (int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random() * 45 + 1);
            for (int f = 0; f < lotto.length; f++){
                if (lotto[i] < lotto[f]){
                    int temp = lotto[i];
                    lotto[i] = lotto[f];
                    lotto[f] = temp;
                }
            }
            for (int j = 0; j<i; j++){
                if (lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(lotto));
        // 0.0 <= x < 1.0 실수 -> <46.0
        /*int r = (int)(Math.random() * 45 + 1);*/
    }
}
