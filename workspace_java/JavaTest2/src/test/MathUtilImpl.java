package test;

public abstract class MathUtilImpl implements MathUtil{
    @Override
    public boolean isEven(int a, int b, int c){
        if ((a+b+c)%2==0 && (a+b+c)%5==0){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public int getSumFromOne(int num){
        for (int i = 1; i < num + 1; i++){
            num = num+i;
        }return num;
    }
    @Override
    public int getArraySum(int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum+array[i];
        }return sum;
    }
}
