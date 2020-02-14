/*
    1.
 */
//public class Cercle {
//
//    /*
//        3 champs privés double
//        x: pour abscisse
//        y: pour ordonnée
//        rayon
//     */
//    private double x, y, rayon;
//
//    // Constructeur avec les 3 attributs
//    public Cercle(double x, double y, double rayon) {
//        this.x = x;
//        this.y = y;
//        this.rayon = rayon;
//    }
//
//    /*
//        Methode deplaceCentre avec deux paramètres
//        Appelle de la méthode deplace dans Point puis récupération des coordonnées
//     */
//    public void deplaceCentre(double dx, double dy) {
//        Point point = new Point(x, y);
//        point.deplace(dx, dy);
//        x = point.x;
//        y = point.y;
//    }
//
//    /*
//        Méthode changeRayon avec un paramètre
//        Correspond à un setter de rayon
//     */
//    public void changeRayon(double rayon) {
//        this.rayon = rayon;
//    }
//
//    /*
//        Méthode getCentre
//        Créer un point avec les coordonnées du cercle
//     */
//    public Point getCentre() {
//        return new Point(x, y);
//    }
//
//    // Méthode toString
//    public String toString() {
//        return "X : " + x + ", Y : " + y + ", rayon : " + rayon;
//    }
//}

/*
    1. Correction
 */
//public class Cercle  {
//    private Point centre ;
//    private double rayon ;
//
//    public Cercle (double x, double y, double r) {
//        centre = new Point(x,y);  ;
//        rayon = r ;
//    }
//
//    public Cercle (Point p, double r) {
//        centre = p  ;
//        rayon = r ;
//    }
//
//    public void deplaceCentre(double dx, double dy) {
//        centre.deplace(dx,dy) ;
//    }
//
//    public void changeRayon(double r) {
//        rayon = r ;
//    }
//
//    public Point getCentre() {
//        return centre ;
//    }
//
//    public String toString() {
//        return "cercle de centre " + centre.getX() + ", " + centre.getY() +
//                " et de rayon " + rayon ;
//    }
//
//}


/*
    2.
 */
public class Cercle extends Point {
    /*
        1 seul attribut
     */
    private double rayon ;

    // Constructeur basique
    public Cercle (double x, double y, double rayon) {
        super(x,y) ;
        this.rayon = rayon ;
    }

    // Second constructeur avec un point comme paramètre
    public Cercle (Point p, double r) {
        this(p.x,p.y, r) ; // this(p.getX(),p.getY(),r);
    }

    /*
        Méthode deplaceCentre mais cette fois directement sans expliciter Point
     */
    public void deplaceCentre(double dx, double dy) {
        deplace(dx,dy) ;
    }

    public void changeRayon(double r) {
        rayon = r ;
    }

    /*
        Méthode getCentre
        Créer un point avec les coordonnées du cercle
     */
    public Point getCentre() {
        Point centre = new Point(x, y);
        return centre ;
    }

    public String toString() {
/*
     return "cercle de centre (" + x + ", " + y +
          ") et de rayon " + rayon ;
*/
        return super.toString() + " centre du cercle de rayon " + rayon;
    }

}




