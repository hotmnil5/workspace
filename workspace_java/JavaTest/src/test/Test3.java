package test;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int max = array[0];
        int min = array[0];

        for (int i = 0; i<array.length; i++){
            // 큰 값 구하기
            if (max<array[i]){
                max=array[i];
            }
            // 작은 값 구하기
            if (min>array[i]){
                min=array[i];
            }
        }
        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);

    }
}
