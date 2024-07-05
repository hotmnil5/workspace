package javaExample2.calculate;

public class CalculateTest {
    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        calculate.setNumber(5,2);
        System.out.println("두 수의 합 : " + calculate.getSum());
        System.out.println("가장 큰 값 : " + calculate.getMax());
        System.out.println("두 수의 평균 : " + calculate.getAvg());
    }
}
