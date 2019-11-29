import java.util.Scanner;

public class ch3_2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integer value");
        System.out.println("The sum of the cubes of the two integer is: "
                + (int)(Math.pow(scan.nextInt(), 3) + Math.pow(scan.nextInt(), 3)));
    }
}