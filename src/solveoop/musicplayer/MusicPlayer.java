package solveoop.musicplayer;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    public void on(){
        this.isOn = true;
        System.out.println("음악 플레이어를 켭니다.");
    }

    public void off(){
        this.isOn = false;
        System.out.println("음악 플레이어를 끕니다.");
    }

    public void volumeUp(){
        this.volume++;
        System.out.println("볼륨업 현재 볼륨 ::: " +  this.volume);
    }

    public void volumeDown(){
        this.volume--;
        System.out.println("볼륨다운 현재 볼륨 ::: " + this.volume);
    }

    public void showStatus(){

        if(this.isOn) {
            System.out.println("음악플레이어 상태 ON" + " 볼륨 크기 ::: " + this.volume);
            return;
        }

        System.out.println("음악플레이어 상태 OFF" + "볼륨 크기 ::: " + this.volume);

    }

}
