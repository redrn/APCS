public class counterTest {
    public static void main(String args[]) {
        Counter cnter1 = new Counter();
        Counter cnter2 = new Counter();
        cnter1.click();
        cnter2.click();
        cnter2.click();
        cnter1.click();
        cnter1.click();
        int c1Count = cnter1.getCount();
        int c2Count = cnter2.getCount();
        System.out.println("Counter 1 has " + c1Count + " clicks");
        System.out.println("Counter 2 has " + c2Count + " clicks");
        cnter1.reset();
        cnter2.click();
        cnter2.click();
        cnter1.click();
        cnter2.click();
        System.out.println(cnter1);
        System.out.println(cnter2);
    }
}