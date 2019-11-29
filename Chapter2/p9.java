import java.util.Scanner;

public class p9 {

    static class Square {

        private int side_length;

        public Square(int side_length) {
            this.side_length = side_length;
        }

        public int getArea() {
            return side_length * side_length;
        }

        public int getPerimeter() {
            return side_length * 4;
        }
    }

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter the side length of the square");
        int side_length = 0;

        while (true) {
            try {
                //Scanner scan = new Scanner(System.in);
                side_length = scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Incorrect data type, please enter an integer");
                scan.nextLine();
            }
        }

        System.out.println("The area of the square is " + (new Square(side_length).getArea()));
        System.out.println("And its perimeter is " + (new Square(side_length).getPerimeter()));
    }
}