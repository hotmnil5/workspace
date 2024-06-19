package Interface.math;

public class MyMath implements MathUtil {
    @Override
    public int getMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
        // return a < b ? a : b;
    }

    @Override
    public double getCircleArea(int radius) {
        /*if (0 < radius){
            return radius*2*Math.PI;
        }
        else {
            return 0;
        }*/
        return radius < 0 ? 0 : radius * 2 * Math.PI;
    }

    @Override
    public int getMultiple(int num1, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * num1;
        }
        return result;

    }
}


