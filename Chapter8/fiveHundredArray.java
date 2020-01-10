import java.util.HashMap;

public class fiveHundredArray {
    public static void main(String args[]) {
        /* Normal array version: */
        // int[] arr = new int[500];
        // int[] count = new int[51];

        // for (int i = 0; i < 500; i++) {
        //     arr[i] = (int) (Math.random() * 51);
        // }

        // for (int val : arr) {
        //     count[val]++;
        // }

        // for (int i = 0; i < 51; i++) {
        //     System.out.println(arr[i] + " occured " + count[i] + " times, ");
        // }

        /* HashMap version */
        HashMap map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 500; i++) {
            int num = (int) (Math.random() * 51);
            if (map.containsKey(num)) {
                map.put(num, (int) map.get(num) + 1);
            } else {
                map.put(num, 0);
            }
        }

        for (int i = 0; i < 51; i++) {
            if (map.containsKey(i)) {
                System.out.println(i + " occured " + map.get(i) + " times");
            }
        }
    }
}