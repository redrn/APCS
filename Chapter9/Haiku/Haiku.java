import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Haiku {

    private String haiku = new String();
    private ArrayList<ArrayList<String>> word_bank = new ArrayList<ArrayList<String>>();
    private int SYL_LIMIT[] = { 5, 7, 5 };
    private int MAX_SYL;

    Haiku() {
        // Read word bank
        try{
            File wb_file = new File("C:\\Users\\RedRN\\Documents\\APCS\\Chapter9\\Haiku\\word_bank.txt");
            Scanner wb_scan = new Scanner(wb_file);

            int syl_index = 0;
            MAX_SYL = 0;

            while (wb_scan.hasNextLine()) {
                String n = wb_scan.nextLine();

                // Change index if parse successful
                try {
                    syl_index = Integer.parseInt(n) - 1;
                    MAX_SYL = syl_index + 1;
                    word_bank.add(new ArrayList<String>());
                } catch (NumberFormatException e) {
                    word_bank.get(syl_index).add(n);
                }
            }

            wb_scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("Specified file not found");
        }
    }

    public String randomHaiku() {

        for (int line = 0; line < 3; line++) {
            int aval_syl = SYL_LIMIT[line];

            while (aval_syl != 0) {
                int syl = (int) (Math.random() * (aval_syl < MAX_SYL ? aval_syl : MAX_SYL)) + 1;
                System.out.println(syl + " : " + aval_syl);
                String word = word_bank.get(syl - 1).get((int) (Math.random() * word_bank.get(syl - 1).size()));

                aval_syl -= syl;
                haiku += word;
                haiku += " ";
            }
            haiku += "\n";
        }

        return haiku;
    }
    
    
    public static void main(String args[]) {
        Haiku haiku = new Haiku();

        System.out.println(haiku.randomHaiku());
    }

}