package bankAccontP;

import java.util.Scanner;

public class TestBankAccount {
    Scanner input = new Scanner(System.in);
    int money;
    private int balance;


    public TestBankAccount() {
        this.balance = 0;
    }

    public int deposits() {
        money = input.nextInt();
        return balance += money;
    }

    public int debited() {
        money = input.nextInt();
        return balance -= money;
    }

    public int balance() {
        return balance;
    }

}
