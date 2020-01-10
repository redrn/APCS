// RationalNumber class without using generics

public class Rational implements Comparable{
    private int denominator, numerator;

    public Rational(int d, int n)
    {
        denominator = d;
        numerator = n;
    }

    public double getDoubleValue()
    {
        return (double) denominator / numerator;
    }

    public int compareTo(Object obj)
    {
        return Math.abs(this.getDoubleValue() - ((Rational) obj).getDoubleValue()) < 0.0001 ? 1 : -1;
    }

    public static void main(String args[]) {
        RationalNumber a = new RationalNumber(3, 4);
        RationalNumber b = new RationalNumber(6, 8);

        System.out.println(a.compareTo(b));
    }
}