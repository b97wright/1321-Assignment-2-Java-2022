import java.util.Scanner;

public class Assignment2B {
    public static void main (String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int kf1, kf2, cfp, curX = 0, td;

        System.out.println("[Lerping!]");
        System.out.print("Enter the X coordinate for Keyframe #1: ");
        kf1 = myObj.nextInt();
        System.out.print("Enter the X coordinate for Keyframe #2: ");
        kf2 = myObj.nextInt();
        System.out.print("How many frames have passed? ");
        cfp = myObj.nextInt();

        td = kf2 - kf1;

        curX = ((td * (cfp / 30)) + kf1);
        System.out.println("At 30 FPS, their current X position would be " + curX + ".");
        curX = (kf1 + (td * (cfp / 60)));
        System.out.println("At 30 FPS, their current X position would be " + curX + ".");
        
    }
}
