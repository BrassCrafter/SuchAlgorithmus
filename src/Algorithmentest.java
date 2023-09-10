public class Algorithmentest
{
    private Zahlenfeld meinZahlenfeld;
    private Algorithmus aAlgorithmus;
    private int FELDGROESSE;

    public Algorithmentest(int groesse) {
        FELDGROESSE = groesse;
        meinZahlenfeld = new Zahlenfeld(FELDGROESSE);
        aAlgorithmus = new Algorithmus();
    }

    public void suchen(int suchwert) {

        System.out.println("Feldgröße = "+FELDGROESSE);

        //int suchwert = meinZahlenfeld.gibZufallselement();
        System.out.println("Suchwert  = " + suchwert );

        //System.out.println("Position LineareSuche: " + aAlgorithmus.lineareSuche(meinZahlenfeld.gibFeld(), suchwert) );
        //System.out.println("Position ZufallsSuche: " + aAlgorithmus.zufallsSuche(meinZahlenfeld.gibFeld(), suchwert) );
        System.out.println("Position BinaereSuche: " + aAlgorithmus.binaereSuche(meinZahlenfeld.gibFeldSortiert(), suchwert) );
    }


    public void zaehlen() {
        int suchwert = meinZahlenfeld.gibZufallselement();
        System.out.println("Feldgröße = "+FELDGROESSE);

        System.out.println("Schritte LineareSuche: "
                + aAlgorithmus.lineareSucheSchritte(meinZahlenfeld.gibFeld(), suchwert) );
        System.out.println("Schritte BinaereSuche: "
                + aAlgorithmus.binaereSucheSchritte(meinZahlenfeld.gibFeldSortiert(),
                suchwert) );
        System.out.println("Schritte ZufallsSuche: "
                + aAlgorithmus.zufallsSucheSchritte(meinZahlenfeld.gibFeld(), suchwert) );
    }

    public static void main(String[] args) {
        Algorithmentest algorithmentest = new Algorithmentest(1000000);
        algorithmentest.zaehlen();
    }
}
//Ergebnistabelle: https://haglengerich-my.sharepoint.com/:x:/r/personal/tillmann_rohlfing_hag-lengerich_de/Documents/Suchen%20Auswertung.xlsx?d=w41340660493a49ef990679c1457cd9be&csf=1&web=1&e=oM6B3j
