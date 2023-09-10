/*
 *This class will have the Account numbers
*and account balances and loan trace balance, limit and remaining balance
*in general in is account monitoring class
 */
package bankaccount;

/**
 *
 * @author MalvernTapiwaMApuranga
 */

//A class to work as a structure to capture user details
    class AccountDetails extends Accounts
        {
            int accountNUmber;
            String firstName,secondName,street,country,city;
            double initialBalance;
        } 

public class Accounts extends BankAccount
{
    
    static boolean loan; 
 //creating the object of account details
   AccountDetails account=new AccountDetails();
    
    
    void createAccount()
    {
        //here will use a structure to store user details in an arrray
        //the function must display and return account number
        
       
    }
    void loans()
    {
        //this must check present loan owed
        //loan amount to be repaid
        //check loan limit
        
    }
    boolean checkloan(int accountNumber)
    { 
        return loan;
    }
}
