package javaExample;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        // 로또 번호 생성
        for (int i = 0; i<lotto.length; i++){
            lotto[i] = (int)(Math.random() * 45 + 1);
            for (int j = 0; j<lotto.length; j++){
                if (lotto[i]<lotto[j]){
                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(lotto));
    }
}
