package solveaccess.speaker;

public class SpeakerMain {

    public static void main(String[] args) {
        /**
         * 스피커 객체를 만들어보자.
         * 스피커는 음량을 높이고, 내리고, 현재 음량을 확인할 수 있는 단순한 기능을 제공한다.
         * 요구사항 대로 스피커의 음량은 100까지만 증가할 수 있다. 절대 100을 넘어가면 안된다
         */
        Speaker speaker = new Speaker(90);

        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();


    }
}
