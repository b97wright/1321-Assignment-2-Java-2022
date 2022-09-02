import java.util.Scanner;

public class Assignment2A {
    public static void main(String[] args)
    {
        int num1, num2, remain;
        Scanner myObj = new Scanner(System.in);

        System.out.print("How many people are in your group? ");
        num1 = myObj.nextInt();

        System.out.print("How many groups do you want: ");
        num2 = myObj.nextInt();

        remain = num1 % num2;

        System.out.print("\nIf we divide " + num1 + " people in " + num2 +" groups evenly, " + remain + " person/people will be left without a group.");

    }
}
