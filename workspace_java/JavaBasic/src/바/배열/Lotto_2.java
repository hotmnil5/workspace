package 바.배열;

import java.util.Arrays;

public class Lotto_2 {
    public static void main(String[] args) {
        int [] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random() * 45 +1);
            for (int j = 0; j < lotto.length; j++){
                if (lotto[i] < lotto[j]){
                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
            for (int f = 0; f < i; f++){
                if (lotto[i] == lotto[f]){
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(lotto));
    }
}
