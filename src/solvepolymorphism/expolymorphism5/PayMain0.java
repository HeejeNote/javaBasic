package solvepolymorphism.expolymorphism5;

import java.util.Scanner;

public class PayMain0 {
    /**
     * 결제수단 2개 -> 5개로 늘리기.
     * OCP 원칙을 지키세요.
     * 메서드를 포함한 모든 코드를 변경해도 됩니다. 클래스나 인터페이스를 추가해도 됩니다.
     * 단 프로그램을 실행하는 PayMain0 코드는 변경하지 않고, 그대로 유지해야 합니다.
     * 리펙토링 후에도 실행 결과는 기존과 같아야 합니다.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("결제 진행 여부를 선택해주세요");
            System.out.println("1. 진행 2. 종료");
            int process = sc.nextInt();
            sc.nextLine();

            if(process == 2){
                System.out.println("결제를 종료합니다.");
                break;
            }

            System.out.print("결제 수단을 입력하세요 : ");
            String payOption = sc.nextLine();

            System.out.print("금액을 입력하세요 : ");
            int amount = sc.nextInt();

            PayService payService = new PayService();

            payService.processPay(payOption, amount);

        }


    }
}
