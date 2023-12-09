package solvemethod;

import java.util.Scanner;

public class MethodEx4 {
    /**
     * --------------------------------
     * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
     * ---------------------------------
     * 선택: 1
     * 입금액을 입력하세요: 10000
     * 10000원을 입금하였습니다. 현재 잔액: 10000원
     * ---------------------------------
     * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
     * ---------------------------------
     * 선택: 2
     * 출금액을 입력하세요: 8000
     * 8000원을 출금하였습니다. 현재 잔액: 2000원
     * ---------------------------------
     * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
     * ---------------------------------
     * 선택: 2
     * 출금액을 입력하세요: 3000
     * 3000원을 출금하려 했으나 잔액이 부족합니다.
     * ---------------------------------
     * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
     * ---------------------------------
     * 선택: 3
     * 현재 잔액: 2000원
     * ---------------------------------
     * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
     * ---------------------------------
     * 선택: 4
     * 시스템을 종료합니다.
     */
    public static void main(String[] args) throws RuntimeException {

        int menu = 0;
        int balance = 0;

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.print("--------------------------------- \n선택 : ");

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("입금액을 입력하세요 : ");
                    int deposit = sc.nextInt();
                    balance = calculateDeposit(balance, deposit);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    int withdraw = sc.nextInt();
                    balance = calculateWithdraw(balance, withdraw);
                    break;
                case 3:
                    checkBalance(balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴 선택을 잘못하였습니다.");
                    System.out.println("메뉴 선택 화면으로 돌아갑니다.");
                    break;
            }

        }

    }

    public static int calculateDeposit(int balance, int deposit){
        balance += deposit;
        System.out.println(deposit + "원을 입금하였습니다. " + "현재 잔액 : " + balance +"원");
        int result = balance;
        return result;
    }

    public static int calculateWithdraw(int balance, int withdraw){

        if(balance < withdraw){
            System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }

        balance -= withdraw;
        System.out.println(withdraw + "원을 출금하였습니다. " + "현재 잔액 : " + balance +"원");

        int result = balance;
        return result;
    }

    public static void checkBalance(int balance){
        System.out.println("현재 잔액 : " + balance);
    }

}
