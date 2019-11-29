public class Test {
    public static void main(String argsp[]) {
        Sphere sp1 = new Sphere(3);
        Sphere sp2 = new Sphere(1);

        System.out.println(sp2);
        System.out.println("dia: " + sp1.getDiameter() + ", SA: " + sp1.surfaceArea() + " V: " + sp1.volume());

        sp1.setDiameter(1);
        System.out.println(sp1);
    }
}