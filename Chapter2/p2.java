import java.util.Scanner;

public class p2 {

    static Scanner scan = new Scanner(System.in);

    public static int[] inputInt() {
        
        int[] ints = new int[3];
        for (int i = 0; i < 3; i++) {
            ints[i] = scan.nextInt();
        }
        return ints;
    }

    public static double avg(int[] ints) {
        double sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum / ints.length;
    }
    public static void main(String args[]) {
        System.out.println("Input three integer separated by enters");
        System.out.println("The average value is " + avg(inputInt()));
    }    
}