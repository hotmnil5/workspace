package Interface.array;

public class ArrayTest {
    public static void main(String[] args) {
        MyArrayUtil arr = new MyArray();
        int[] arr1 = {1,3,4};
        int[] arr2 = {2,3,5};
        System.out.println(arr.getTwoArrayAvg(arr1 , arr2));
        int[] array = {2,4,8,10};
        System.out.println(arr.isEvenArray(array));
    }
}
