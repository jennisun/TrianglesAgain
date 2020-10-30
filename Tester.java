public class Tester {
  public static void main (String[] args) {
    Point p1 = new Point (0, 0);
    Point p2 = new Point (4, 0);
    Point p3 = new Point (2, 2);

    Triangle t1 = new Triangle(p1, p2, p3);


    System.out.println(t1.classify());
    System.out.println(t1.toString());

    t1.setVertex(2, new Point(4, 0));
    System.out.println(t1.toString());

  }

}
