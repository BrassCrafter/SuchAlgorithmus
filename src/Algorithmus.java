import java.util.Arrays;

class Algorithmus {

    // Anfang Attribute
    // Ende Attribute

    // Anfang Methoden
    public int binaereSuche(int[] feldS, int e) {
        int links = 0;
        int rechts = feldS.length-1;
        //if(feldS[links] == e)return links;
        //if(feldS[rechts] == e)return rechts;
        while(links <= rechts){
            int mitte = links + (rechts - links)/2;
            if(feldS[mitte] == e)return mitte;
            if(feldS[mitte] < e)links = mitte +1;
            if(feldS[mitte] > e)rechts = mitte -1;
        }
        return -1;
    }

    public int lineareSuche(int[] feld, int e) {
        for (int i = 0; i < feld.length; i++) {
            if (feld[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int zufallsSuche(int[] feld, int e) {
        boolean[] checkedIndexes = new boolean[feld.length];
        int randIndex;
        while(!Arrays.asList(checkedIndexes).contains(false)){
            randIndex = (int) (Math.random()*(feld.length-1));
            if(!checkedIndexes[randIndex]){
                if(feld[randIndex] == e){
                    return randIndex;
                }else{
                    checkedIndexes[randIndex] = true;
                }
            }
        }
        return -1;
    }

    public static int binaereSucheSchritte(int[] feldS, int e) {
        int links = 0;
        int rechts = feldS.length-1;
        int versuche = 0;
        //if(feldS[links] == e)return links;
        //if(feldS[rechts] == e)return rechts;
        while(links <= rechts){
            versuche++;
            int mitte = links + (rechts - links)/2;
            if(feldS[mitte] == e)return versuche;
            if(feldS[mitte] < e)links = mitte +1;
            if(feldS[mitte] > e)rechts = mitte -1;
        }
        return -1;
    }

    public static int lineareSucheSchritte(int[] feld, int e) {
        int versuche = 0;
        for (int i = 0; i < feld.length; i++) {
            if (feld[i] == e) {
                return versuche;
            }
            versuche++;
        }
        return -1;
    }

    public static int zufallsSucheSchritte(int[] feld, int e) {
        boolean[] checkedIndexes = new boolean[feld.length];
        int randIndex;
        int versuche = 0;
        while(!Arrays.asList(checkedIndexes).contains(false)){
            versuche++;
            randIndex = (int) (Math.random()*(feld.length-1));
            if(!checkedIndexes[randIndex]){
                if(feld[randIndex] == e){
                    return versuche;
                }else{
                    checkedIndexes[randIndex] = true;
                }
            }
        }
        return -1;
    }


    // Ende Methoden
} // end of Algorithmus
