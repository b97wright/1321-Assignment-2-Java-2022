import java.util.Scanner;
import java.util.*;

public class Assignment2B {
    public static void main (String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        double kf1, kf2, cfp, curX = 0, td;

        System.out.println("[Lerping!]");
        System.out.print("Enter the X coordinate for Keyframe #1: ");
        kf1 = myObj.nextDouble();
        System.out.print("Enter the X coordinate for Keyframe #2: ");
        kf2 = myObj.nextDouble();
        System.out.print("How many frames have passed? ");
        cfp = myObj.nextDouble();

        td = kf2 - kf1;

        curX = (kf1 + (td * (cfp/30)));
        System.out.println("At 30 FPS, their current X position would be " + String.format("%.1f", curX) + ".");
        curX = (kf1 + (td * (cfp/60)));
        System.out.println("At 30 FPS, their current X position would be " + String.format("%.1f", curX) + ".");
        
    }
}
