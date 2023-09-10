package credit.store;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class CreditStorePayment 
{
    
     // Function to calculate the number of days between two dates
    private static long calculateDaysLate(Date paymentDate, Date dueDate) 
    {
        long diff = dueDate.getTime() - paymentDate.getTime();
        return Math.max(0, diff / (24 * 60 * 60 * 1000));
    }

    // Function to calculate the total amount due with the applied discount
    private static double calculateTotalAmountDue(double invoiceAmount, long daysLate) 
    {
        double discount;
        if (daysLate >= 7) 
        {
            discount = 0.1; // 10% discount if payment made 7 or more days before due date
        } 
        else if (daysLate <= 0) 
        {
            discount = 0; // No discount if payment made on time
        } 
        else 
        {
            discount = 0.05; // 5% discount if payment made before due date but less than 7 days
        }

        return invoiceAmount - (invoiceAmount * discount);
    }
    
    
    public static void main(String[] args) 
    {
        // Get user input for payment date and invoice amount
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the payment date (YYYY-MM-DD): ");
        String paymentDateStr = scanner.nextLine();
        System.out.print("Enter the total value of the invoice: ");
        double invoiceAmount = scanner.nextDouble();
        scanner.close();

        // Convert payment date string to Date object
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date paymentDate;
        try 
        {
            paymentDate = dateFormat.parse(paymentDateStr);
        } 
        catch (ParseException e) 
        {
            System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
            return;
        }

        // Get today's date as the due date
        Date dueDate = new Date();

        // Calculate the number of days late
        long daysLate = calculateDaysLate(paymentDate, dueDate);

        // Calculate the total amount due with the applied discount
        double totalAmountDue = calculateTotalAmountDue(invoiceAmount, daysLate);

        // Output details about the payment
        System.out.println("\nPayment Details:");
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Days Late: " + daysLate);
        if (daysLate >= 7) 
        {
            System.out.println("Discount Applied: 10%");
        }
        else if (daysLate <= 0) 
        {
            System.out.println("Discount Applied: None");
        }
        else 
        {
            System.out.println("Discount Applied: 5%");
        }
        System.out.println("Total Amount Due: $" + totalAmountDue);
    }
}