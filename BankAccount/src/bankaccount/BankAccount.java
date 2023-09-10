/*
 * on this project am working on a bank account with two types of bank Accs
*the savings and current accounts will have limits on withdrawal
 */
package bankaccount;

import java.util.Scanner;

/**
 *
 * @author MalvernTapiwaMapuranga
 */
class SavingsAccount extends BankAccount {

    double withdraw(double withAmnt, double balance) {

        if (withAmnt <= 10000.00) {
            balance -= withAmnt;
        } else {
            System.out.printf("\t\t%s%f\n", "You have exceed the limit $10,000.00 and your Withdrawal amnt is", withAmnt);
        }

        return balance;
    }
}

class CurrentAccount extends BankAccount {

    double withdraw(double withAmnt, double balance) {
        if (withAmnt <= 10000.00) {
            balance -= withAmnt;
        } else {
            System.out.printf("\t\t%s%f\n", "You have exceed the limit $10,000.00 and your Withdrawal amnt is", withAmnt);
        }

        return balance;
    }

}

//the main bank class which is the parent class to savings and current accounts
public class BankAccount {

    static Scanner input = new Scanner(System.in);
    static double balance = 100000.45;

    public static int chooseAccount() 
    {
        int option;
        System.out.println("\t\tChoose Type of Account");
        System.out.println("\t\t**********************");
        System.out.println("\t\t1. Current Account");
        System.out.println("\t\t2. Savings Account");
        option = input.nextInt();
        return option;
    }
    //this function display menu to select either withdrawal or deposit

    public static int selectAction() {
        int option;
        System.out.println("\t\tChoose from MENU bellow");
        System.out.println("\t\t**********************");
        System.out.println("\t\t1. Withdraw");
        System.out.println("\t\t2. Deposit");
        option = input.nextInt();
        return option;
    }

    public static int services() 
    {
        int option;
        System.out.println("\t\tChoose from MENU bellow");
        System.out.println("\t\t**********************");
        System.out.println("\t\t1. Make Transaction");
        System.out.println("\t\t2. Account Services");
        System.out.println("\t\t2. Transfer");
        System.out.println("\t\t2. Change password");
        option = input.nextInt();
        return option;
    }

    public static void makeTransaction() {
        CurrentAccount currentAcc = new CurrentAccount();
        SavingsAccount savingsAcc = new SavingsAccount();
        int choice;
        double depositAmount, withdrawAmount;

        if (chooseAccount() == 1) 
        {
            if (selectAction() == 1) 
            {
                System.out.println("\t\tEnter the withdrawal Amount");
                withdrawAmount = input.nextDouble();
                balance = currentAcc.withdraw(withdrawAmount, balance);
            } else if (selectAction() == 2) {
                System.out.println("\t\tEnter the deposit Amount");
                depositAmount = input.nextDouble();
                balance = currentAcc.deposit(depositAmount, balance);
            }
        } else if (chooseAccount() == 2) {
            if (selectAction() == 1) {
                System.out.println("\t\tEnter the withdrawal Amount");
                withdrawAmount = input.nextDouble();
                balance = savingsAcc.withdraw(withdrawAmount, balance);
            } else if (selectAction() == 2) {
                System.out.println("\t\tEnter the deposit Amount");
                depositAmount = input.nextDouble();
                balance = savingsAcc.deposit(depositAmount, balance);
            }
        }

    }

    double deposit(double depAmnt, double balance) {
        balance += depAmnt;
        return balance;
    }

    public static void main(String[] args) 
    {
        int choice;
        switch (services()) 
        {
            case 1:
                makeTransaction();
                System.out.println("\t\tdo you want to perform another action\n\t\t1. Yes\n\t\t2. No");
                choice=input.nextInt();
                if(choice==1)
                {
                    makeTransaction();
                }
                else if(choice==2)
                {
                    System.out.println("\t\tThank You!!");
                }
                else System.out.println("\t\tInvalid input!!\n\t\tEXITING...");
                System.out.printf("%s%f\n","\t\tNew wallet balance $",balance);
                break;
        }
    }

}
