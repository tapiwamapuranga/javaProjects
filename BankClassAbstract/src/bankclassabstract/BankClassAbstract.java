//Abstract Class
package bankclassabstract;

/**
 *
 * @MalvernTapiwa Mapuranga
 */
 
abstract class Bank
{
    abstract void getBalance();
}
class BankA extends Bank
{
    void getBalance()
    {
       System.out.printf("%s","The balance is $100\n");
    }
}
class BankB extends Bank
{
     void getBalance()
    {
       System.out.printf("%s","The balance is $150\n");
    }
}
class BankC extends Bank
{
     void getBalance()
    {
       System.out.printf("%s","The balance is $200\n");
    }
}
public class BankClassAbstract
{
    public static void main(String[] args) 
    {
       Bank ac1=new BankA();
       Bank ac2=new BankB();
       Bank ac3=new BankC();
       ac1.getBalance();
       ac2.getBalance();
       ac3.getBalance();
    }
    
}
