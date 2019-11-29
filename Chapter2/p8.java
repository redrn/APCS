import java.util.Scanner;

public class p8 {

    private static Scanner scan = new Scanner(System.in);
    private static int[] time = new int[3];

    //Recursion
    private static void calc(int val, int interval, int pResult, int index){
        if (val<interval) {
            time[time.length - index] = val;
            index++;
            if (index > time.length) {
                return;
            }
            calc(pResult, 60, 0, index);
        }
        else {
            calc(val - interval, 60, pResult + 1, index);
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the total seconds:");
        calc(scan.nextInt(), 60, 0, 1);
        System.out.println("The time is " + time[0] + " hour, " + time[1] + " minute and " + time[2] + " seconds");
    }
}