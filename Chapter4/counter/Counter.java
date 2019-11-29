public class Counter {
    
    private int count;


    // Constructor
    Counter() {
        this.count = 0;
    }


    public void click() {
        this.count++;
    }


    public int getCount() {
        return this.count;
    }


    public void reset() {
        count = 0;
    }

    public String toString() {
        return "" + count;
    }
}