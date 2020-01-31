import java.util.Scanner;

class TestPoint {
    static public void main(String[] args) {

        // 2 - METHODE 1
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Point p1_hardcode = new Point(x, y);
        System.out.println("Hardcoded point: " + p1_hardcode); // En fonction du programme

        // 2 - METHODE 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x1 = sc.nextInt();
        System.out.println("Enter y:");
        int y1 = sc.nextInt();

        Point p1_entered = new Point(x1, y1);
        System.out.println("Entered point: " + p1_entered); // En fonction de l'input utilisateur

        // 4
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 6);
        Point p3 = new Point(56, 78);
        Point p4 = new Point(56, 78);

        // 4
        System.out.println(p1); // Point numero 1 sur 4 : abscisse : 0, ordonnee : 0
        System.out.println(p2); // Renvoi Point numero 2 sur 4 : abscisse : 5, ordonnee : 6
        System.out.println(p3); // Renvoi Point numero 3 sur 4 : abscisse : 56, ordonnee : 78
        System.out.println(p4); // Renvoi Point numero 3 sur 4 : abscisse : 56, ordonnee : 78

        // 5
        System.out.println("P1 == P2? " + Point.egalite(p1, p2)); // Affiche false
        System.out.println("P1 == P1? " + Point.egalite(p1, p1)); //  Affiche true
        System.out.println("P3 == P4? " + Point.egalite(p3, p4)); //  Affiche false
        System.out.println("P3 == null? " +Point.egalite(p3, null)); // Affiche false
        System.out.println("P1 == P3? " + p1.egalite(p3)); // Affiche false
        System.out.println("P3 == P3? " + p3.egalite(p3)); // Affiche true
        System.out.println("P3 == P4? " + p3.egalite(p4)); // Affiche false
        System.out.println("P3 == null? " + p3.egalite(null)); // Affiche false

        // 6
        System.out.println("P1 égal à soi? " + p1.egalASoi()); // Affiche true

        // 7 A
        System.out.println("P1 = {x : " + p1.getX() + " , y : " + p1.getY() + "}"); // Affiche x : 0 , y : 0
        // 7 B
        p1.setX(5);
        p1.setY(10);
        System.out.println("Modified P1 now is : " + p1); // Renvoi Point numero 1 sur 4 : abscisse : 5, ordonnee : 10
        // Notons que la preuve de sa modification est son indice qui n'est pas change (1 sur 4)


        // 7 C
        Point p5 = Point.creationPoint(0, 0);
        Point p6 = Point.creationPoint(56, 78);
        Point p7 = Point.creationPoint(-2, 7);
        Point p8 = Point.creationPoint(3, -8);
        Point p9 = Point.creationPoint(-10, -38);

        System.out.println("Point {0,0}: " + p5);
        System.out.println("Point {56, 78}: " + p6);
        System.out.println("Point {-2, 7}: " + p7);
        System.out.println("Point {3, -8}: " + p8);
        System.out.println("Point {-10, -38}: " + p9);

        // 8
//        Point p1 = Point.creationPoint("point1", 0, 0);
//        Point p2 = Point.creationPoint("point2", 56, 78);
//
//        System.out.println("P1: " +p1);
//        System.out.println("P2: " +p2);
    }
}