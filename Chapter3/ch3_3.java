import java.util.ArrayList;

public class ch3_3 {

    //store the phone number backward
    //Use 11 to store "-"
    private static ArrayList<Integer> phoneNum = new ArrayList<Integer>();

    public static void main(String args[]) {

        //Initialize phoneNum: add "-" and 0
        for (int i = 0; i < 12; i++) {
            phoneNum.add(0);
        }
        phoneNum.set(4, 11);
        phoneNum.set(8, 11);

        //Generate number
        //last four digits
        for (int i = 0; i < 4; i++) {
            phoneNum.set(i, (int) (Math.random() * 10));
        }
        //middle three digits
        for()

        //Display the number
        for (int i = 0; i < phoneNum.size(); i++) {
            int n = phoneNum.get(phoneNum.size()-i);
            if(n==11){
                System.out.print("-");
            }
            else {
                System.out.print(n);
            }
        }
    }
}