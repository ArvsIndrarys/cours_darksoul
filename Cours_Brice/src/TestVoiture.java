/*
    2.
 */
public class TestVoiture {

    static public void main(String[] args) {
        /*
            Soit tester en dur pour cahque étape
         */
//        Voiture voiture = new Voiture("Toyota", 40);
//        voiture.demarrer();
//        voiture.rouler(10);
//        voiture.rouler(10);
//        voiture.rouler(10);
//        voiture.rouler(10);
//        voiture.fairePlein(50);
//        voiture.rouler(10);
//        voiture.arreter();

        /*
            Soit créer une méthode avec des paramètres qui gère le plein
         */
        test(40, 5, 10);
    }

    public static void test(int litres, int trajets, int consommation) {
        Voiture voiture = new Voiture("?", litres);
        voiture.demarrer();
        for (int i = 1; i <= trajets; i++) {
            boolean carburantOk = voiture.rouler(consommation);
            if (!carburantOk) {
                voiture.fairePlein(50);
            }
        }
        voiture.arreter();
    }
}
