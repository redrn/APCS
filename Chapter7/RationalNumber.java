public class RationalNumber implements Comparable<RationalNumber> {

    private int denominator, numerator;

    public RationalNumber(int n, int d){
        denominator = d;
        numerator = n;
    }

    public int compareTo(RationalNumber x) {
        double val1 = (double) numerator / denominator;
        double val2 = (double) x.numerator / x.denominator;
        return Math.abs(val1 - val2) < 0.0001 ? 1 : -1;
    }
    
    public static void main(String args[]) {
        RationalNumber a = new RationalNumber(3, 4);
        RationalNumber b = new RationalNumber(6, 8);

        System.out.println(a.compareTo(b));
    }
}