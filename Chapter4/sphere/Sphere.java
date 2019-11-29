public class Sphere {

    private double diameter;
    private double volume;
    private double surfaceArea;


    Sphere(double diameter) {
        this.diameter = diameter;
        volume = Math.pow(diameter, 3) * Math.PI * 4 / 3;
        surfaceArea = Math.pow(diameter, 2) * Math.PI * 4;
    }

    public void setDiameter(double val) {
        diameter = val;
        volume = Math.pow(diameter, 3) * Math.PI * 4 / 3;
        surfaceArea = Math.pow(diameter, 2) * Math.PI * 4;
    }

    public double getDiameter() {
        return diameter;
    }

    public double volume() {
        return volume;
    }
    
    public double surfaceArea() {
        return surfaceArea;
    }

    public String toString() {
        return "Sphere with diameter of " + diameter + ", surface area of " + surfaceArea + ", and volume of " + volume;
    }
}