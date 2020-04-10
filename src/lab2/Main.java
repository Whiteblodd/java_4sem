package lab2;

public class Main {
    public static void main(String[] args) {
        Point3d point1 = new Point3d(1,1,1);
        Point3d point_zero = new Point3d();

        boolean is_same = Point3d.isSamePoints(point1,point_zero);
        double distance = Point3d.distanceTo(point1, point_zero);
        System.out.println(is_same);


        System.out.println(distance);
    }
}