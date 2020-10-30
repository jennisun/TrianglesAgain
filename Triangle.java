public class Triangle {

  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
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


  public String classify() {

    if (Math.round(v1.distanceTo(v2) * 100000) == Math.round(v2.distanceTo(v3) * 100000) && Math.round(v2.distanceTo(v3) * 100000) == Math.round(v3.distanceTo(v1) * 100000)) return "equilateral";
    else {
      if (Math.round(v1.distanceTo(v2) * 10000) == Math.round(v2.distanceTo(v3) * 100000) || Math.round(v2.distanceTo(v3) * 100000) == Math.round(v3.distanceTo(v1) * 100000)) return "isosceles";
      else return "scalene";
    }
  }





}
