package bankAccontP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----BANK MENU-----");
        System.out.println("1.deposit");
        System.out.println("2.debited");
        System.out.println("3.Check Balance");


        Scanner input1 = new Scanner(System.in);
        int value;

        System.out.println("PLEASE ENTER A VALID NUMBER");


        TestBankAccount test = new TestBankAccount();


        try {

            for (int i = 0; i < 15; i++) {

                value = input1.nextInt();
                switch (value) {
                    case 1 -> {
                        System.out.println("Please enter amount");
                        System.out.println("your total balance :" + test.deposits());
                    }
                    case 2 -> {
                        System.out.println("Please enter amount");
                        System.out.println("your rest balance :" + test.debited());
                    }
                    case 3 -> System.out.println("your total balance :" + test.balance());
                    default -> System.out.println("enter a valid number");
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Enter a number from 1 to 3");
        }
    }
}
