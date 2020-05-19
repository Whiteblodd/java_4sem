package lab2;

public class Main {
    public static void main(String[] args) {
        Point3d point1 = new Point3d(2,4,6); // Создание двух точек
        Point3d point2 = new Point3d(44, 3,2);

        boolean is_same = Point3d.isSamePoints(point1,point2);// Сравнение координат
        double distance = Point3d.distanceTo(point1, point2);// Вычисление расстояния между точками
        System.out.println(is_same);


        System.out.println(distance);
    }
}