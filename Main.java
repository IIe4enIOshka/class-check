public class Main {
    static class Point {
        int x;
        int y;
        Point() {
            this.x = 0;
            this.y = (int) (Math.random() * 10);
        }
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        Point(int x) {
            this(x, 0);
        }
    }
    static class Point3D extends Point {
        int z;
        Point3D(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }
    }
    public static void main(String[] args) {
        Point3D point = new Point3D(1,2,3);
        System.out.println(point.x);
        System.out.println(point.y);
        System.out.println(point.z);
    }
}
