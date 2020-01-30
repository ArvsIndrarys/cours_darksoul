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

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString () {
        return "abscisse : " + x + ", ordonnee : " + y ;
    }
}