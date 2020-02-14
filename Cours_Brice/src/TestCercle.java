/*
    1.
 */
//public class TestCercle
//{
//    public static void main(String[] args)
//    {
//        Cercle c = new Cercle(3, 8, 2.5) ;
//        System.out.println(c);
//        c.deplaceCentre(1, 0.5) ;
//        c.changeRayon(5.25);
//        System.out.println(c);
//        Point pt = c.getCentre();
//        System.out.println(pt);
//    }
//}

/*
    2.
 */
public class TestCercle
{
    public static void main(String[] args)
    {
        // OK, création des points
        Point pt1, pt2 ;
        // OK, création des cercles
        Cercle c1, c2 ;
        // OK, instanciation d'un point
        pt1 = new Point(4.2, 7.3) ;
        // OK, un point appartient à un cercle
        pt2 = new Cercle(14.7, 62, 5.2) ;
        // OK, instanciation d'un cercle
        c1 = new Cercle(3.56, 7.84, 2.25) ;
        // KO, un cercle n'est pas un point, car un cercle a besoin d'un rayon
//        c2 = new Point(56.1, 76.9) ;
        // OK, déplacement du point
        pt1.deplace(0.5, 0.5) ;
        // OK, déplacement du point
        pt2.deplace(0.3, 0.8) ;
        // KO, changeRayon appartient à Cercle
//        pt2.changeRayon(6.21) ;
        // OK, existe via Point
        c1.deplace(0.4, 0.5) ;
        // OK, methode appatenant à Cercle
        c1.changeRayon(2.52) ;
        // OK
        c1.x = 4.78 ;
    }
}