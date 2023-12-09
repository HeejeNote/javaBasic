package solveoop.account;

public class Account {

    int balance = 0;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){

        if(balance < amount){
            System.out.println("잔액 부족");
            return;
        }
        balance -= amount;
    }

    public void showAmount(){
        System.out.println("잔고 : " + balance);
    }

}
