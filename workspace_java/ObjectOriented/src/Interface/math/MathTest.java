package Interface.math;

public class MathTest {
    public static void main(String[] args) {
        MathUtil math = new MyMath();
        System.out.println(math.getMin(5,2));
        System.out.println(math.getCircleArea(5));
        System.out.println(math.getMultiple(5,2));
    }
}
