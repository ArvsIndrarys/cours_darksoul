/*
    2.
 */
public class Voiture {

    private String modele;
    private Moteur moteur;

    public Voiture(String modele) {
        this.modele = modele;
        this.moteur = new Moteur(0);
    }

    public Voiture(String modele, int carburant) {
        this.modele = modele;
        this.moteur = new Moteur(carburant);
    }

    public Voiture(String modele, Moteur moteur) {
        this.modele = modele;
        this.moteur = moteur;
    }

    public boolean demarrer() {
        return moteur.demarrer();
    }

    public boolean rouler(int essenceUtilise) {
        if (!moteur.utiliser(essenceUtilise)){
            System.out.println("Panne d'essence");
            return false;
        } else {
            return true;
        }
    }

    public void arreter() {
        moteur.arreter();
    }

    public void fairePlein(int essence) {
        moteur.fairePlein(essence);
    }

}
