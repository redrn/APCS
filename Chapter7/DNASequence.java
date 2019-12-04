import java.util.Arrays;
import java.util.HashMap;

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

    public static int matchTwoGenes(String dna, String gene1, String gene2) {
        int index_1 = dna.indexOf(gene1);
        int index_2 = dna.indexOf(gene2);

        int gap = index_2 - (index_1 + gene1.length());

        if (index_1 == -1 || index_2 == -1) {
            return -1;
        } else {
            return gap >= 0 ? gap : -1;
        }
    }
    
    public static int matchGenes(String dnaString, String[] genes) {
        int index_1, index_2;
        int gap = 0;

        for (int i = 0; i < genes.length - 1; i++) {
            index_1 = dnaString.indexOf(genes[i]);
            index_2 = dnaString.indexOf(genes[i + 1]);

            if (index_1 != -1 && index_2 != -1 && index_2 - (index_1 + genes[i].length()) >= 0) {
                gap += index_2 - (index_1 + genes[i].length());
            } else {
                return -1;
            }
        }

        return gap >= 0 ? gap : -1;
    }

    public static int encode(String dnaSegment) {
        
        // Map for each gene and its corresponding values
        HashMap<Character, Integer[]> map = new HashMap<Character, Integer[]>(4);
        map.put('A', new Integer[] { 0, 0 });
        map.put('C', new Integer[] { 0, 1 });
        map.put('G', new Integer[] { 1, 0 });
        map.put('T', new Integer[] { 1, 1 });


        // translate genes into binary values
        int[] bin_val = new int[dnaSegment.length() * 2];

        for (int i = 0; i < dnaSegment.length() - 1; i++) {
            int index = 2 * i;
            Integer[] gene_code = map.get(dnaSegment.charAt(i));

            bin_val[index] = gene_code[0];
            bin_val[index + 1] = gene_code[1];
        }

        // Translate binary values into base 10 decimals
        int ten_val = 0;

        for (int i = 0; i < bin_val.length; i++) {
            ten_val += Math.pow(2, bin_val.length - 1 - i) * bin_val[i];
        }

        return ten_val;
    }

    public static String decode(int code, int len) {
        
        // Map for each gene and its corresponding values
        HashMap<Integer, String> map = new HashMap<Integer, String>(4);
        map.put( 00, "A");
        map.put( 01, "C");
        map.put( 10, "G");
        map.put( 11, "T");

        // Binary to decimal
        // Note that the base ten number ten_val is stored backward
        Integer[] ten_val = new Integer[len * 2];
        for (int i = 0; i < ten_val.length; i++) {
            ten_val[i] = code % 2;
            code /= 2;
        }

        // Decimal to its corresponding gene
        // String array genes also stored backward
        String[] genes = new String[len];
        for (int i = 0; i < len; i++) {
            int index = 2 * i;
            genes[i] = map.get(10 * ten_val[index + 1] + ten_val[index]);
        }

        // Unwrap the genes array into string
        String genes_str = new String();
        for (int i = genes.length - 1; i >= 0; i--) {
            genes_str += genes[i];
        }

        return genes_str;
    }
}