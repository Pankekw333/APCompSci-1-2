
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*;
public class PaymentsMethods
{
     double principal, monPayment, annInt;
    public PaymentsMethods()
    {
        principal = 0;
        monPayment = 0;
        annInt = 0;
    }
    public PaymentsMethods(double principals, double monPayments, double annInts)
    {
        principal = principals;
        monPayment = monPayments;
        annInt = annInts;
    }
    public void NewBalance(double principals, double monPayments, double annInts)
    {
        double interest = 0;
        double newBalance = 0;
        int month = 1;
        double interestTotal = 0;
        System.out.println("Month     Principal       Interest        Payment     New Balance");
        do
        {       
             interest = principal * (annInt/12.0);
             newBalance = principal - monPayment + interest;
             System.out.print(Format.right(month,2) + "         ");
             { 
                 if (principal >= 10000)
                     System.out.print(Format.right(principal,2,2) + "        ");
                 else if (principal > 1000)
                     System.out.print(Format.right(principal,2,2) + "         ");
                 else 
                     System.out.print(Format.right(principal,2,2) + "          ");
             }
             {
                 if ( interest >= 100)
                     System.out.print(Format.right(interest,2,2) + "          ");
                 else if ( interest >= 10)
                     System.out.print(Format.right(interest,2,2) + "           ");
                 else
                     System.out.print(Format.right(interest,2,2) + "            ");
                    }
             System.out.print(Format.right(monPayment,2,2) + "       ");
             System.out.print(Format.right(newBalance,2,2) + "\n");
             
             principal = newBalance;
             month++;
             
             interestTotal += interest;
        }
        while( principal > monPayment );
        System.out.print("The total interest is" + interest);

    }
}
