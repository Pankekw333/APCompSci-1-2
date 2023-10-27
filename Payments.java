
/**
 * Write a description of class PaymentRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
import apcslib.*;
public class Payments
{
    public static void main()
    {
        ConsoleIO pr = new ConsoleIO();
        System.out.print("How much money do you owe? ");
        double principal = pr.readDouble();
        System.out.println();

        System.out.print("How much are you paying monthly? ");
        double monPayment = pr.readDouble();
        System.out.println();
        
        System.out.print("How much is your annual interest?         ");
        double annInt = pr.readDouble();
        System.out.println();
        if (annInt > 1)
            annInt = annInt/100;
        else
            annInt = annInt;
            
        PaymentsMethods test = new PaymentsMethods(principal, monPayment, annInt);
        test.NewBalance(principal, monPayment, annInt);
        
        
    }
}
