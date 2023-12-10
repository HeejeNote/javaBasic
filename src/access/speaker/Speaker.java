package access.speaker;

public class Speaker {

    private int volume;

    public Speaker(int volume){
        this.volume = volume;
    }

    public void volumeUp(){
        if(volume >= 100) {
            System.out.println("현재 음량이 최대 음량입니다.");
            return;
        }
        volume += 10;
    }

    public void volumeDown(){
        if(volume <= 0){
            System.out.println("현재 음량이 최소 음량입니다.");
            return;
        }
        volume -= 10;
    }

    public void showVolume(){
        System.out.println("현재 볼륨 ::: " + volume);
    }

}
