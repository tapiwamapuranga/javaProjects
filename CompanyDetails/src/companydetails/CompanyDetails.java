
package companydetails;
import java.util.Scanner;
/**
 *
 * @MalvernTapiwa Mapuraga
 */
abstract class Employee
{
    static String name,employeeNum;
    double salary;
    abstract void calculateSalary();
    void displayInfo()
    {
        System.out.printf("%s%s\n", "Employee Name   :",name);
        System.out.printf("%s%s\n", "Employee Number :",employeeNum);
        System.out.printf("%s%s\n", "Employee Salary :",salary);
    }
}

class Manager extends Employee
{
  Scanner input=new Scanner(System.in);
  void calculateSalary()
  {
      double charge,grossSalary,rate=0.09;
        System.out.println("Enter your gross salary ");
        grossSalary=input.nextDouble();
        charge=grossSalary*rate;
        salary=grossSalary-charge;
  }
}


class Programmer extends Employee
{
    Scanner input=new Scanner(System.in);
    void calculateSalary()
    {
        double charge,grossSalary,rate=0.09;
        System.out.println("Enter your gross salary ");
        grossSalary=input.nextDouble();
        charge=grossSalary*rate;
        salary=grossSalary-charge;
    }
}




public class CompanyDetails 
{

    public static void main(String[] args)
    {
        Employee p1= new Programmer();
        Employee m1=new Manager();
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Employee Name :");
       p1.name =input.nextLine();
        System.out.println("Enter Employee Number :");
        p1.employeeNum =input.nextLine();
        
        p1.calculateSalary();
        p1.displayInfo();
        m1.calculateSalary();
        m1.displayInfo();
    }
    
}
