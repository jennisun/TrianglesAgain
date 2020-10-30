public class Triangle {

  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    a = v1;
    b = v2;
    c = v3;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }


  public double getPerimeter() {
		return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
	}

  public double getArea() {
    double x = v1.distanceTo(v2);
    double y = v2.distanceTo(v3);
    double z = v3.distanceTo(v1);

    double semi = (x + y + z) / 2;
    return Math.sqrt(semi * (semi - x) * (semi - y) * (semi - z));
  }





}
