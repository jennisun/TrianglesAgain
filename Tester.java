public class Tester {
  public static void main (String[] args) {
    Point p1 = new Point (1, 2);
    Point p2 = new Point (4, 3);
    Point p3 = new Point (3, 3);

    Triangle t1 = new Triangle(p1, p2, p3);

    // System.out.println(p1.distanceTo(p2));
    // System.out.println(p2.equals(p3));
    // System.out.println(p1.equals(p3));


    System.out.println(t1.getArea());

  }

}
