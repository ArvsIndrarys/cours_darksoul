/*
    1. 2.
 */
//class Point
//{
//    double x, y ;
//
//    public Point(double x, double y) {
//        this.x = x ;
//        this.y = y;
//    }
//
//    public void deplace(double dx, double dy) {
//        x += dx ;
//        y += dy ;
//    }
//
//    public String toString() {
//        return "Point de coordonnees : " + x + ", " + y ;
//    }
//
//    /*
//        1. Correction
//     */
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//}

/*
    3.(b)
 */
class Point {
    protected double x, y ;

    public Point(double x, double y) {
        this.x = x ;
        this.y = y;
    }

    public void deplace(double dx, double dy) {
        x += dx ;
        y += dy ;
    }

    public String toString() {
        return "Point de coordonnees : (" + x + ", " + y + ")" ;
    }

    public double getX() { return x ; }

    public double getY() { return y ; }

}