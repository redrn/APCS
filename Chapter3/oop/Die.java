public class Die {

    private int face;
    private final int MAX_VAL = 6;

    public Die() {
        roll();
    }

    public int roll() {
        return face = (int) (Math.random() * MAX_VAL) + 1;
    }
    
    public int getFace() {
        return face;
    }

    public boolean setFace(int face) {
        if(face > MAX_VAL) {
            System.out.println("Exception: Exceeds maximum value");
            return false;
        }
        this.face = face;
        return true;
    }

    public String toString() {
        return "" + face;
    }
}