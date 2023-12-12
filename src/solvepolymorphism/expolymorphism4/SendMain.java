package solvepolymorphism.expolymorphism4;

public class SendMain {
    /**
     * 한번에 여러 곳에 메시지를 발송하는 프로그램
     * 다형성을 활용
     * Sender 인터페이스를 사용
     * EmailSender , SmsSender , FaceBookSender 를 구현
     */
    /**
     * 출력 결과
     * 메일을 발송합니다: 환영합니다!
     * SMS를 발송합니다: 환영합니다!
     * 페이스북에 발송합니다: 환영합니다!
     */
    public static void main(String[] args) {
        Sender[] senders = {
                new EmailSender(), new SmsSender(), new FaceBookSender()
        };
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
