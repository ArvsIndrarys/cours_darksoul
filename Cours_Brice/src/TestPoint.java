import java.util.Scanner;

class TestPoint {
    static public void main(String[] args) {

        // 2 - METHODE 1
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        PointOld p1_hardcode = new PointOld(x, y);
        System.out.println("Hardcoded point: " + p1_hardcode); // En fonction du programme

        // 2 - METHODE 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x1 = sc.nextInt();
        System.out.println("Enter y:");
        int y1 = sc.nextInt();

        PointOld p1_entered = new PointOld(x1, y1);
        System.out.println("Entered point: " + p1_entered); // En fonction de l'input utilisateur

        // 4
        PointOld p1 = new PointOld(0, 0);
        PointOld p2 = new PointOld(5, 6);
        PointOld p3 = new PointOld(56, 78);
        PointOld p4 = new PointOld(56, 78);

        // 4
        System.out.println(p1); // PointOld numero 1 sur 4 : abscisse : 0, ordonnee : 0
        System.out.println(p2); // Renvoi PointOld numero 2 sur 4 : abscisse : 5, ordonnee : 6
        System.out.println(p3); // Renvoi PointOld numero 3 sur 4 : abscisse : 56, ordonnee : 78
        System.out.println(p4); // Renvoi PointOld numero 3 sur 4 : abscisse : 56, ordonnee : 78

        // 5
        System.out.println("P1 == P2? " + PointOld.egalite(p1, p2)); // Affiche false
        System.out.println("P1 == P1? " + PointOld.egalite(p1, p1)); //  Affiche true
        System.out.println("P3 == P4? " + PointOld.egalite(p3, p4)); //  Affiche false
        System.out.println("P3 == null? " + PointOld.egalite(p3, null)); // Affiche false
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
        System.out.println("Modified P1 now is : " + p1); // Renvoi PointOld numero 1 sur 4 : abscisse : 5, ordonnee : 10
        // Notons que la preuve de sa modification est son indice qui n'est pas change (1 sur 4)


        // 7 C
        PointOld p5 = PointOld.creationPoint(0, 0);
        PointOld p6 = PointOld.creationPoint(56, 78);
        PointOld p7 = PointOld.creationPoint(-2, 7);
        PointOld p8 = PointOld.creationPoint(3, -8);
        PointOld p9 = PointOld.creationPoint(-10, -38);

        System.out.println("PointOld {0,0}: " + p5);
        System.out.println("PointOld {56, 78}: " + p6);
        System.out.println("PointOld {-2, 7}: " + p7);
        System.out.println("PointOld {3, -8}: " + p8);
        System.out.println("PointOld {-10, -38}: " + p9);

        // 8
//        PointOld p1 = PointOld.creationPoint("point1", 0, 0);
//        PointOld p2 = PointOld.creationPoint("point2", 56, 78);
//
//        System.out.println("P1: " +p1);
//        System.out.println("P2: " +p2);
    }
}