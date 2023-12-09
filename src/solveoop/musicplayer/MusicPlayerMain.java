package solveoop.musicplayer;

public class MusicPlayerMain {

    public static void main(String[] args) {
        /**
         * //음악 플레이어 켜기
         *  //볼륨 증가
         *  //볼륨 증가
         *  //볼륨 감소
         *  //음악 플레이어 상태
         *  //음악 플레이어 끄기
         */

        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.on();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();
        musicPlayer.showStatus();
        musicPlayer.off();

    }
}
