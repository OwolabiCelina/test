package tddclass;

public class Account {

    private int balance;

    public void deposit(int amount) {
         balance = balance + amount;
    }

    public void withDraw(int amount){
        balance = balance - amount;
    }
    public int getBalance() {
        return balance;
    }

}
