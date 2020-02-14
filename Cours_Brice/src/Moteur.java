/*
    1.
 */
public class Moteur {

    private int carburant;

    public Moteur() {
        carburant = 0;
    }

    public Moteur(int carburant) {
        this.carburant = carburant;
    }

    public boolean demarrer() {
        if (carburant-1 < 0) {
            return false;
        } else {
            System.out.println("Moteur demarre avec " + carburant-- +" litres");
            return true;
        }
    }

    public int utiliser(int carburantUtilise) {
        if (carburantUtilise > carburant) {
            System.out.println("Moteur utilise " + carburant + " litres");
            carburant = 0;
        } else {
            System.out.println("Moteur utilise " + carburantUtilise + " litres");
            carburant -= carburantUtilise;
        }
        return carburant;
    }

    public void arreter() {
        System.out.println("Moteur arrêté");
    }

    public void fairePlein(int carburantAjoute) {
        carburant += carburantAjoute;
        System.out.println("Plein avec " + carburant + " litres");
    }
}

