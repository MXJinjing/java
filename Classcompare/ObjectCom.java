class Cylinder {
    private static double pi = 3.14;
    private double radius;
    private int height;

    public Cylinder(double r, int h) {
        radius = r;
        height = h;
    }

    public void compare(Cylinder v) {
        if (this == v)
            System.out.println("这两个对象相等");
        else
            System.out.println("这两个对象不相等");
    }
}

public class ObjectCom {
    public static void main(String[] args) {
        Cylinder v1 = new Cylinder(2.0, 3);
        Cylinder v2 = new Cylinder(2.0, 3);
        Cylinder v3 = v1;
        // v1 v2 have different addresses
        // v1 v3 point to the same address
        v1.compare(v2);
        v1.compare(v3);
    }
}
