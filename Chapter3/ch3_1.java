import java.util.Scanner;

public class ch3_1 {

    private static Scanner scan = new Scanner(System.in);

    private static class Name {

        private String f_name = new String();
        private String l_name = new String();

        public boolean setName(String name) {
            int delim = name.indexOf(" ");
            f_name = name.substring(0, delim);
            l_name = name.substring(delim + 1);
            return true;
        }

        public String lastname() {
            return l_name;
        }

        public String firstname() {
            return f_name;
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter your name (First name and Last name, separated by a space):");
        Name name = new Name();

        //Get the user's input
        while (true) {
            try {
                name.setName(scan.nextLine());
                break;
            } catch(Exception e){
                System.out.println(
                        "You have entered invalid name, please enter your first name, followed by a space, and then the lastname");
            }
        }

        //print name
        System.out.print("Your name abbreviation is: " + name.firstname().charAt(0) + " ");
        for (int i = 0; i < 5 && i < name.lastname().length(); i++) {
            System.out.print(name.lastname().charAt(i));
        }
        System.out.println((int)(Math.random() * 90 + 10));
    }
}