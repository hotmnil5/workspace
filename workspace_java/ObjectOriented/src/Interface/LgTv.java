package Interface;

public class LgTv implements Tv{
    @Override
    public void turnOn() {
        System.out.println("엘지티비 - 전원 켬");
    }

    @Override
    public void turnOff() {
        System.out.println("엘지티비 - 전원 끔");
    }

    @Override
    public void volumeUp() {
        System.out.println("엘지티비 - 볼륨 올림");
    }

    @Override
    public void volumeDown() {
        System.out.println("엘지티비 - 볼륨 내림");
    }
    /*public void turnOn(){
        System.out.println("엘지티비 - 전원 켬");
    }
    public void turnOff(){
        System.out.println("엘지티비 - 전원 끔");
    }
    public void volumnUp(){
        System.out.println("엘지티비 - 소리 올림");
    }
    public void volumDown(){
        System.out.println("엘지티비 - 소리 줄임");
    }*/

}
