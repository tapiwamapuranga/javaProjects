
package credit.store;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * @author malvernTapiwaMapuranaga 
 */
public class CreditStore {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the payment date (YYYY-MM-DD): ");
        String paymentDateStr = scanner.nextLine();
        System.out.print("Enter the total value of the invoice: ");
        double invoiceAmount = scanner.nextDouble();
        scanner.close();
        
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date paymentDate = null;
        try {
            paymentDate = dateFormat.parse(paymentDateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
            return;
        }
        
          Date dueDate = new Date();

          long daysLate = calculateDaysLate(paymentDate, dueDate);
    }
    
}
