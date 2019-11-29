public class Test {
    public static void main(String args[]) {
        AP_Point point = new AP_Point(3, 4);

        // toString()
        System.out.println(point);

        // Setters, distanceFromOrigin()
        point.setXY(10, 12);
        System.out.println(point.distanceFromOrigin());

        // Setters, distanceFromPoint(), manhattanDistance()
        point.setX(5).setY(5);
        AP_Point point_2 = new AP_Point(point);
        point_2.offset(3, 4);   
        System.out.println(point.distanceFromPoint(point_2));
        System.out.println(point.manhattanDistance(point_2));

        // Getters
        System.out.println("x: " + point_2.getX() + ", y: " + point_2.getY());

        // Arbitrary testing
        System.out.println(1.0 / 0.0);
        System.out.println(0.0 / 0.0);
        System.out.println(1*Infinity);
    }
}