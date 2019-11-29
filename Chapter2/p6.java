import java.util.*;

public class p6 {

    public static Scanner scan = new Scanner(System.in);

    public static double getTime(Pair<Integer, Integer> VandD) {
        return (double) VandD.second() / VandD.first();
    }

    //Custom class for quick passing and accessing of a two-element pair
    static class Pair<T1, T2> {

        private T1 val1;
        private T2 val2;

        public Pair(T1 val1, T2 val2) {
            this.val1 = val1;
            this.val2 = val2;
        }

        public T1 first() {
            return val1;
        }

        public T2 second() {
            return val2;
        }
    }

    public static void main(String args[]) {
        System.out.println("How fast is your speed and what's the distance?");
        System.out.println("Your travelling time is " + getTime(new Pair<Integer, Integer>(scan.nextInt(), scan.nextInt())));
    }
}