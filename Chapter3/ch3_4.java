import java.util.Scanner;

public class ch3_4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a non-integer number: ");
        double num = scan.nextDouble();
        System.out.println("the integer just greater and just smaller than the number you entered is: " + (int) num
                + " and " + (int) (num + 1));
    }
}