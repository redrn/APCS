import java.util.*;

public class p5 {

    static Scanner scan = new Scanner(System.in);

    private static double round(double val, int digi) {
        double int_val = Math.round(val * Math.pow(10, digi));
        double rounded_double = int_val * Math.pow(10, -digi);
        return rounded_double;
    }

    static double toKilo(double mile) {
        return mile * 1.60935;
    }

    public static void main(String args[]) {
        System.out.println("Start miles to kilometer conversion\nEnter Miles:");
        System.out.println("The corresponding Kilo is " + round(toKilo(scan.nextDouble()), 3));
    }
}