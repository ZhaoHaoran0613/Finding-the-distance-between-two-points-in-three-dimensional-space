public class Distance {
    public static void main(String[] args){
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 1;
        p1.z = 1;
        Point p2 = new Point();
        p2.x = 2;
        p2.y = 2;
        p2.z = 2;
        double z = p1.getDistance(p2);
        System.out.println("两点间的距离为" + z);
    }
}

class Point{
    double x;
    double y;
    double z;
    public double getDistance(Point p){
        double r = Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y)+(p.z-z)*(p.z-z));
        return r;
    }
}



