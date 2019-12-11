public class Average {
    public static float average(int a, int b) {
        return (float) (a + b) / 2;
    }

    public static float average(int a, int b, int c) {
        return (float) (a + b + c) / 3;
    }

    public static float average(int... a) {
        int sum = 0;
        for (int val : a) {
            sum += val;
        }
        return (float) sum / a.length;
    }
    
    public static void main(String args[]) {
        System.out.println(average(1, 2, 3, 4, 5, 6, 7, 8));
    }
}