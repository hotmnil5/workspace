package javaExample2.calculate;

public class Calculate {
    private int num1;
    private int num2;

    public void setNumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum(){
        return num1+num2;
    }

    public int getMax(){
        if (num1 > num2){
            return num1;
        }
        else {
            return num2;
        }
    }


    public double getAvg(){
        int sum = 0 ;
        int cnt = 0;
        for (int i = Math.min(num1, num2)+1; i < Math.max(num1,num2); i++){
            sum = i+sum;
            cnt++;
        }
        return sum / (double)cnt;
    }
}
