import java.util.Scanner;

public class p7 {

    private static Scanner scan = new Scanner(System.in);

    public static int getSec(int hr, int min, int sec) {
        return hr * 3600 + min * 60 + sec;
    }

    public static void main(String args[]) {
        System.out.println("Input the hour, minute and second: ");
        System.out.println("Convert to seconds is " + getSec(scan.nextInt(), scan.nextInt(), scan.nextInt()));
    }
}