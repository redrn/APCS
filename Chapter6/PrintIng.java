public class PrintIng {

    static public class Payroll
    {

        private int[] itemsSold = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60}; // number of items sold by each employee

        private double[] wages = new double[10]; // wages to be computed in part (b)


        /**
         * Returns the bonus threshold as described in part (a).
         * 
         */

        public double computeBonusThreshold()

        {

            /* To be implemented in part (a) */
            double sum = 0, min = itemsSold[0], max = min;
            for (double val : itemsSold) {
                sum += val;
                if (val < min) {
                    min = val;
                }
                if (val > max) {
                    max = val;
                }
            }
            
            return (sum - min - max) / (itemsSold.length - 2);
        }

        /**
         * Computes employee wages as described in part (b)
         * 
         * and stores them in wages.
         * 
         * The parameter fixedWage represents the fixed amount each employee
         * 
         * is paid per day.
         * 
         * The parameter perItemWage represents the amount each employee
         * 
         * is paid per item sold.
         * 
         */

        public void computeWages(double fixedWage, double perItemWage)

        {
            double threshold = computeBonusThreshold();

            for (int i = 0; i < itemsSold.length; i++) {
                if (itemsSold[i] > threshold) {
                    double wage = (fixedWage + itemsSold[i] * perItemWage) * 1.1;
                    wages[i] = wage;
                } else {
                    double wage = (fixedWage + itemsSold[i] * perItemWage);
                    wages[i] = wage;
                }
            }

            /* To be implemented in part (b) */

        }

        public void printWage() {
            for (double val : wages) {
                System.out.println(val);
            }
        }

        // Other instance variables, constructors, and methods not shown.

    }

    public static void main(String args[]) {
        String[] words = { "ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting" };

        for (String str : words) {
            if (str.substring(str.length() - 3).indexOf("ing") >= 0 && str.length() >= 3) {
                System.out.println(str);
            }
        }
        
        Payroll pr = new Payroll();
        pr.computeWages(10, 1.5);
        pr.printWage();
    }
}