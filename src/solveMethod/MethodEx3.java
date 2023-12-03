package solveMethod;

public class MethodEx3 {
    /**
     * ::: method Refactoring :::
     * public static void main(String[] args) {
     *      int balance = 10000;
     *
     *      // 입금 1000
     *      int depositAmount = 1000;
     *      balance += depositAmount;
     *      System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance+ "원");
     *
     *      // 출금 2000
     *      int withdrawAmount = 2000;
     *      if (balance >= withdrawAmount) {
     *          balance -= withdrawAmount;
     *          System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
     *      } else {
     *          System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
     *      }
     *
     *      System.out.println("최종 잔액: " + balance + "원");
     *  }
     */

    public static void main(String[] args) {

        int balance = 10000;

        // 입금 1000
        balance = deposit(balance,1000);

        // 출금 2000
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int deposit){
        int result = balance + deposit;
        System.out.println(deposit + "원을 입금하였습니다. 현재 잔액: " + result + "원");
        return result;
    }

    public static int withdraw(int balance, int withdraw){
        int result = balance - withdraw;

        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return result;
    }
}
