import java.util.Scanner;

public class p10 {

    private static Scanner scan = new Scanner(System.in);
    private static String frac;
    private static int numerator, denominator;

    public static void main(String args[]) {
        System.out.println("Enter a fraction: ");
        frac = scan.nextLine();

        String[] splited = frac.split("/");
        numerator = Integer.parseInt(splited[0]);
        denominator = Integer.parseInt(splited[1]);

        System.out.println("The decimal approximation is " + (double) numerator / denominator);
    }
}