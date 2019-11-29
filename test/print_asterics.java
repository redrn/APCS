public class print_asterics {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
            for (int j = 0; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}