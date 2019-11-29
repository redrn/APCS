import java.util.Scanner;

public class Sysprint {
    static String name = "Roy";
    static int grade = 11;
    static String status = "great";

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        name = scan.nextLine();
        System.out.println("Hello, My name is " + name + "\nI'm " + grade + " grade\nI'm " + status);
        scan.close();
    }
}