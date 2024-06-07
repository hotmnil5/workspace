package 사.메서드;

import java.util.Arrays;

public class Test_3_6_9 {
    public static void main(String[] args) {
        /*int[] arr = {1,7,5,3,2};
        int max = test6(arr);
        System.out.println(max);*/

        /*String[] ar = {"먀","아앙","냥"};
        String result = test7(ar);
        System.out.println(result);*/

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] result = test9(array);
        System.out.println(Arrays.toString(result));
    }

    //test6
    public static int test6(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //test7
    public static String test7(String[] arry) {
        String result = "";
        for (int i = 0; i < arry.length; i++) {
            result = result + arry[i];
        }
        return result;
    }

    //test9
    public static int[] test9(int[] arr) {
        // 매개변수로 넘어온 배열 요소 중 짝수의 개수
        int cnt = 0;
        for (int e : arr) {
            if (e % 2 == 0) {
                cnt++;
            }
        }
        //짝수만 저장될 배열 생성
        int[] resultArr = new int[cnt];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                resultArr[index] = arr[i];
                index++;
            }
        }
        return resultArr;
    }
}