import java.util.Scanner;

class TestPoint {
    static public void main(String[] args) {

        // 2 - METHODE 1
        //int x = Integer.parseInt(args[0]);
        //int y = Integer.parseInt(args[1]);

        // 2 - METHODE 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter x:");
//        int x = sc.nextInt();
//        System.out.println("Enter y:");
//        int y = sc.nextInt();

//        Point p1 = new Point(x, y);

        // 4
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 6);
        Point p3 = new Point(56, 78);
        // 5
//        Point p4 = new Point(56, 78);

        // 7 C
        Point p1 = Point.creationPoint(0, 0);
        Point p2 = Point.creationPoint(5, 6);
        Point p3 = Point.creationPoint(56, 78);
        Point p4 = Point.creationPoint(56, 78);

        // 4
        System.out.println(p1); // Point numero 1 sur 4 : abscisse : 0, ordonnee : 0
        System.out.println(p2); // Renvoi Point numero 2 sur 4 : abscisse : 5, ordonnee : 6
        System.out.println(p3); // Renvoi Point numero 3 sur 4 : abscisse : 56, ordonnee : 78
        // 5
        System.out.println("P1 == P2? " + Point.egalite(p1, p2)); // Affiche false
        System.out.println("P1 == P1? " + Point.egalite(p1, p1)); //  Affiche false
        System.out.println("P3 == null? " +Point.egalite(p3, null)); // Affiche true
        System.out.println("P1 == P3? " + p1.egalite(p3)); // Affiche false
        System.out.println("P3 == P3? " + p3.egalite(p3)); // Affiche true
        System.out.println("P3 == null? " + p3.egalite(null)); // Affiche false
        // 6
        System.out.println(p1.egalASoi()); // Renvoi true
        // 7 A
        System.out.println("x : " + p1.getX() + " , y : " + p1.getY()); // Renvoi x : 0 , y : 0
        // 7 B
        System.out.println("set x : 5");
        p1.setX(5);
        System.out.println("set y : 10");
        p1.setY(10);
        System.out.println(p1); // Renvoi Point numero 1 sur 4 : abscisse : 5, ordonnee : 10

    }
}