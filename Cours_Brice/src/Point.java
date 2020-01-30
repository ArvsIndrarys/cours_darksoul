class Point {
    /*
     * 1
     * il manque les accesseurs ; en effet, dans le constructeur, x et y correspondent aux paramètres
     * ce qui revient à faire 10 = 10 et 40  = 40
     * on a donc besoin de préciser qu'on attribue les valeurs aux attributs avec le mot-clé `this`
     * ou en nommant différemment les arguments
     */

    // 3 - METHODE 3
    // private int x = 10 ;
    // private int y  = 30;
    private int x = -1;
    private int y;

    // 4
    private static int totalPoint;
    private int numeroOrdre;

    // 8
    private final String nom = "PointB";

    // 3 - METHODE 1
    //public Point() {
    //    x = 10;
    //    y = 30;
    //}

    // 3 - METHODE 2
    //public Point() {
    //    this(10,30);
    //}

    public Point() {
    }

//    public Point(int x, int y) {
//        this.x=x;
//        this.y=y;
//    }

    // 4
    // Set to private for 7C
    public Point(int x, int y) {
        this.x=x;
        this.y=y;
        totalPoint++;
        numeroOrdre = totalPoint;
    }

    // 7 C
    public static Point creationPoint(int x, int y) {
        if (x < 0 || y < 0)
            return null;
        return new Point(x, y);
    }

    // 2
//    public String toString () {
//        return "abscisse : " + x + ", ordonnee : " + y ;
//    }

    // 4
//    public String toString () {
//        return "Point numero " + this.numeroOrdre + " sur " + Point.totalPoint + " : abscisse : " + x + ", ordonnee : " + y ;
//    }

    // 8
    public String toString () {
        return "Point " + nom + " numero " + this.numeroOrdre + " sur " + Point.totalPoint + " : abscisse : " + x + ", ordonnee : " + y ;
    }

    // 5
    // Ne pas oublier le null-check, checker un attribut de `null` cause un crash
    // car tentative d'accès à une zone mémoire inconnue
    public static boolean egalite(Point p1, Point p2) {
        // 7A:  Pas besoin d'utiliser les accesseurs car les méthodes sont déjà au sein de l'objet Point,
        // elles ont donc un accès direct aux attributs
        if (p1 == null || p2 == null){
            return false;
        }
        else if ((p1.x == p2.x && p1.y == p2.y) || p1.numeroOrdre == p2.numeroOrdre)
            return true;
        else
            return false;
    }

    // 5
    // Ne pas oublier le null-check, checker un attribut de `null` cause un crash
    // car tentative d'accès à une zone mémoire inconnue
    public boolean egalite(Point p1) {
        if (p1 == null){
            return false;
        }
        else if ((p1.x == this.x && p1.y == this.y) || p1.numeroOrdre == this.numeroOrdre)
            return true;
        else
            return false;
    }

    // 6
    public boolean egalASoi() {
        return egalite(this);
    }

    // 7 A
    // Notons que le `this.` n'est pas obligatoire, le seul x que cette méthode peut connaître est l'attribut
    public int getX() {
        return this.x;
    }

    // Notons que le `this.` n'est pas obligatoire, le seul y que cette méthode peut connaître est l'attribut
    public int getY() {
        return this.y;
    }

    // Notons que le `this.` n'est pas obligatoire, le seul x que cette méthode peut connaître est l'attribut
    public void setX(int x) {
        this.x = x;
    }

    // Notons que le `this.` n'est pas obligatoire, le seul y que cette méthode peut connaître est l'attribut
    public void setY(int y) {
        this.y = y;
    }
}