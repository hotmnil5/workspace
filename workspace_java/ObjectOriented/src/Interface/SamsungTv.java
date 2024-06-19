package Interface;

public class SamsungTv implements Tv{
    @Override
    public void turnOn() {
        System.out.println("삼성티비 - 전원 켬");
    }

    @Override
    public void turnOff() {
        System.out.println("삼성티비 - 전원 끔");
    }

    @Override
    public void volumeUp() {
        System.out.println("삼성티비 - 볼륨 올림");
    }

    @Override
    public void volumeDown() {
        System.out.println("삼성티비 - 볼륨 내림");
    }

    /*public void powerOn(){
        System.out.println("삼성티비 - 전원 켬");
    }

    public void powerOff(){
        System.out.println("삼성티비 - 전원 끔");
    }

    public void soundDown(){
        System.out.println("삼성티비 - 소리 내림");
    }

    public void soundUp(){
        System.out.println("삼성티비 - 소리 올림");
    }*/

}
