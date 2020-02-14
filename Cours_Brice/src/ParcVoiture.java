public class ParcVoiture {
    private Voiture[] voitures ;

    public ParcVoiture (Voiture[] voitures) {
        this.voitures=voitures;
    }

    public void tester() {
        System.out.println("Test parc voitures : ");
        for (int i=0 ;  i< voitures.length; i++) {
            System.out.println("Demarrer la voiture " + (i+1));
            if (voitures[i].demarrer())
                voitures[i].arreter();
            else {
                System.out.println("Panne");
                voitures[i].fairePlein(20);
            }
        }
    }

    public static void main(String args[]) {
        ParcVoiture pv = new ParcVoiture (
                new Voiture []{
                        new Voiture("SAXO", 5),
                        new Voiture("R5", 6),
                        new Voiture("2CH")
                }
        ) ; // new ParcVoiture


        pv.tester();

    } // main
} // class