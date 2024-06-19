package Interface.array;

public class MyArray implements MyArrayUtil {
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        int t = 0;
        int t1 = 0;
        for (int i = 0; i < arr1.length; i++){
            t = t+arr1[i];
        }
        for (int i1 = 0; i1 < arr2.length; i1++){
            t1 = t1+arr2[i1];
        }
        return (double)(t1 + t) / (arr1.length+arr2.length);
    }

    @Override
    public boolean isEvenArray(int[] array) {
       for (int e : array){
           if (e % 2 == 1){
               return false;
           }
       }
       return true;
    }
}
