public class AP_Point {
    
    private int x_cord, y_cord;


    AP_Point(int x_cord, int y_cord) {
        this.x_cord = x_cord;
        this.y_cord = y_cord;
    }


    AP_Point(AP_Point point) {
        this.x_cord = point.x_cord;
        this.y_cord = point.y_cord;
    }

    
    public int getX() {
        return x_cord;
    }


    public int getY() {
        return y_cord;
    }


    public AP_Point setX(int x_cord) {
        this.x_cord = x_cord;
        return this;
    }


    public AP_Point setY(int y_cord) {
        this.y_cord = y_cord;
        return this;
    }


    public AP_Point setXY(int x_cord, int y_cord) {
        this.x_cord = x_cord;
        this.y_cord = y_cord;
        return this;
    }


    public AP_Point offset(int dx, int dy) {
        x_cord += dx;
        y_cord += dy;
        return this;
    }


    public double distanceFromPoint(AP_Point point) {
        return Math.hypot(this.x_cord - point.x_cord, this.y_cord - point.y_cord);
    }


    public double distanceFromOrigin() {
        return Math.hypot(this.x_cord, this.y_cord);
    }


    public String toString() {
        return "(" + x_cord + ", " + y_cord + ")";
    }


    public int manhattanDistance(AP_Point other) {
        return Math.abs(this.x_cord - other.x_cord) + Math.abs(this.y_cord - other.y_cord);
    }
}