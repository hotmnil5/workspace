package 바.배열;

public class Test_1_11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        /*int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);*/
        int cnt = 0;
        for (int e :arr){
            if (e % 2 ==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}


