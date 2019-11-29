import java.math.*;
import java.util.Scanner;

public class p3 {
    
    private static double round(double val, int digi) {
        double int_val = Math.round(val*Math.pow(10, digi));
        double rounded_double = int_val*Math.pow(10, -digi);
        return rounded_double;
    }

    private static class Operation {
        public void calc(double a, double b) {
            System.out.println("The first num is " + a + ", the second num is " + b);
        }
    }

    private static class Sum extends Operation {
        public void calc(double a, double b) {
            super.calc(a, b);
            System.out.println("the sum is " + round(a + b, 3));
        }
    }   

    private static class Diff extends Sum {
        public void calc(double a, double b) {
            super.calc(a, b);
            System.out.println("The difference is " + round(Math.abs(a - b), 3));
        }
    }        

    private static class Product extends Diff {
        public void calc(double a, double b) {
            super.calc(a, b);
            System.out.println("The product is " + round(a * b, 3));
        }
    }
        
    public static void main(String args[]) {
        double a, b;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input two floating numbers");
        a = scan.nextDouble();
        b = scan.nextDouble();

        Operation op = new Product();
        op.calc(a, b);
    }   
}