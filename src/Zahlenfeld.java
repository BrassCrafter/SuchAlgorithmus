class Zahlenfeld
{
    // Anfang Attribute
    private int[] feld; //Unsortierter Array mit Integern
    private int[] feldS; //Sortierter Array mit Integern
    // Ende Attribute

    public Zahlenfeld(int n) //Konstruktor erwartet einen Integer für die Länge der Arrays
    {
        feld  = new int[n]; //Array wird mit der Länge n inizialisiert
        feldS = new int[n]; //Array wird mit der Länge n inizialisiert
        for (int i = 0; i < n; i++) { //For-Schleife geht durch den Kompletten Array durch
            feld[i]  =
                    (int)(Math.random()*100000); //Jedem Feld im Array wird eine Zufallszahl zwischen 0 und 100.000 zugewiesen
            feldS[i] = feld[i]; //Der Array "feld" überträgt sich auf "feldS"
        }
        java.util.Arrays.sort(feldS); //java.util.Arrays.sort(pArray) sortiert den Inhalt des Arrays nach Größe
    }

    public int[] gibFeld () {
        return feld;
    } //Gibt den Arrays "feld" zurück

    public int[] gibFeldSortiert () {
        return feldS;
    } //Gibt den Arrays "feldS" zurück

    public int gibZufallselement() {
        return feld[(int)(Math.random()*(feld.length-1))];// Fehler in der Rechnung Math.random()*feld.length-1 kann rein logisch -1 sein, diesen Index gibt es nicht. Math.random()*(feld.length-1) verhindert dieses.
    } //Gibt zufälligen Index des Arrays zurück
}