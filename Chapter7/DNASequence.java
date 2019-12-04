import java.util.Arrays;

class DNASequence {
    
    public static boolean isValidDNA(String str) {

        String valids = "ACTG";
        for (char x : str.toCharArray()) {

            if (valids.indexOf(x) == -1) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String args[]) {
        if(isValidDNA("ACTG")==true) {
            System.out.print("success");
        }
    }

}