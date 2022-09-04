import java.util.*;
import java.util.Scanner;;

public class Assignment2C {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        double dollars;

        System.out.println("[Bisonica Currency Exchange]");
        System.out.println("General Bison welcomes you to Pax Bisonica!\n");
        System.out.print("How many US Dollars do you have? ");
        dollars = myObj.nextDouble();
        
        System.out.println("\n" + dollars + " US Dollar(s) is " + String.format(".2f", (dollars * .85)) + " British Pound(s),");
        System.out.println("which is worth " + String.format(".2f", ((dollars * .85) / 5)) + " Bison Dollar(s)! \n");

    }
}
