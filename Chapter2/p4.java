import java.util.*;

public class p4 {

    static Scanner scan = new Scanner(System.in);
    static Map<String, String> info = new HashMap<String, String>(); 

    public static void main(String args[]) {
       
        info.put("name", "");
        info.put("age", "");
        info.put("school", "");
        info.put("pet's name", "");

        for (Map.Entry<String, String> entry : info.entrySet()) {
            System.out.println("What is your " + entry.getKey());
            entry.setValue(scan.nextLine());
        }

        System.out.println("Hello, my name is " + info.get("name") + " and I am " + info.get("age")
                + " years old. I’m enjoying my time at " + info.get("school") + ", though I miss my pet "
                + info.get("pet's name") + " very much!");
    }
}