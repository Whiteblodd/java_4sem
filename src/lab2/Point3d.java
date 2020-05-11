package lab2;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z){
        //Конструктор
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d(){
        this(0,0,0);
    }
    // Getters
    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public double getZ() {
        return zCoord;
    }
    //Setters
    public void setX(double value){
        xCoord = value;
    }
    public void setY(double value){
        yCoord = value;
    }
    public void setZ(double value) {
        zCoord = value;
    }
    // Метод, сравнивающий координаты двух точек
    public static boolean isSamePoints(Point3d cord1, Point3d cord2){
        double[] cord_list1 = new double[]{cord1.getX(), cord1.getY(),cord1.getZ()};
        double[] cord_list2 = new double[]{cord2.getX(),cord2.getY(),cord2.getZ()};
        if(cord_list1[0] == cord_list2[0] && cord_list1[1] == cord_list2[1] && cord_list1[2] == cord_list2[2]){
            return true;
        }
        else{return false;}
    }
    //Метод, вычисляющий расстояние между точками
    public static double distanceTo(Point3d cord1, Point3d cord2){
        if(Point3d.isSamePoints(cord1,cord2) != true){
            double[] cord_list1 = new double[]{cord1.getX(), cord1.getY(), cord1.getZ()};
            double[] cord_list2 = new double[]{cord2.getX(), cord2.getY(), cord2.getZ()};
            double distance = Math.sqrt(
                    Math.pow((cord_list1[0] - cord_list2[0]), 2) +
                            Math.pow((cord_list1[1] - cord_list2[1]), 2) +
                            Math.pow((cord_list1[2] - cord_list2[2]), 2)
            );

            return distance;
        }
        else{
            System.out.println("points r same ");
            return 0;
        }
    }
}