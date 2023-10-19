package main;

public class ProblemDrei {

/*Es gibt 2 große Zahlen. Die Zahlen sind als Array dargestellt.
        1. Berechnen Sie die Summe. Die Zahlen haben die gleiche Anzahl an Ziffern.
        z.B. [1 3 0 0 0 0 0 0 0] + [8 7 0 0 0 0 0 0 0] = [1 0 0 0 0 0 0 0 0 0]
        2. Berechnen Sie die Differenz. Die Zahlen haben die gleiche Anzahl an Ziffern.
        z.B. [8 3 0 0 0 0 0 0 0] - [5 4 0 0 0 0 0 0 0] = [2 9 0 0 0 0 0 0 0]
        3. Berechnen Sie die Multiplikation. Erste Zahl ist ein große Zahl, der Zweite Zahl ist nur
        ein Ziffer.
        z.B. [2 3 6 0 0 0 0 0 0] * 2 = [4 7 2 0 0 0 0 0 0]
        4. Berechnen Sie die ganzzahlige Division. Erste Zahl ist ein große Zahl, der Zweite Zahl
        ist nur ein Ziffer.
        z.B. [2 3 6 0 0 0 0 0 0] / 2 = [1 1 8 0 0 0 0 0 0]*/

    private boolean areTheNumbersTheSameLength(int[] zahl1, int[] zahl2){
        if (zahl1.length != zahl2.length){
            System.out.println("Die Zahlen haben nicht die gleiche Anzahl an Ziffern.");
            return false;
        }
        return true;
    }
    private boolean areEachNumberBetween0And9(int[] zahl){
        for (int i = 0; i < zahl.length; i++) {
            if (zahl[i] < 0 || zahl[i] > 9) {
                System.out.println("Die Zahlen sollen zwischen 0 und 9 sein.");
                return false;
            }
        }
        return true;
    }

    public int[] summe(int[] zahl1, int[] zahl2) {
        if (!areTheNumbersTheSameLength(zahl1, zahl2)){
            return null;
        }
        if (!areEachNumberBetween0And9(zahl1) || !areEachNumberBetween0And9(zahl2)){
            return null;
        }
        int[] summe = new int[zahl1.length + 1];
        int uebertrag = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int temp = zahl1[i] + zahl2[i] + uebertrag;
            if (temp > 9) {
                summe[i + 1] = temp % 10;
                uebertrag = temp / 10;
            } else {
                summe[i + 1] = temp;
                uebertrag = 0;
            }
        }
        summe[0] = uebertrag;
        return summe;
    }
    public int[] differenz(int[] zahl1, int[] zahl2) {
        if (!areTheNumbersTheSameLength(zahl1, zahl2)){
            return null;
        }
        if (!areEachNumberBetween0And9(zahl1) || !areEachNumberBetween0And9(zahl2)){
            return null;
        }
        int[] differenz = new int[zahl1.length];
        int uebertrag = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {
            if(zahl1[i] < zahl2[i]){
                System.out.println("Die erste Zahl soll größer als die zweite Zahl sein.");
                return null;
            }
            int temp = zahl1[i] - zahl2[i] - uebertrag;
            if (temp < 0) {
                differenz[i] = temp + 10;
                uebertrag = 1;
            } else {
                differenz[i] = temp;
                uebertrag = 0;
            }
        }
        return differenz;
    }
    public int[] multiplikation(int[] zahl1, int zahl2) {
        if (!areEachNumberBetween0And9(zahl1)){
            return null;
        }
        int[] multiplikation = new int[zahl1.length + 1];
        int uebertrag = 0;
        for (int i = zahl1.length - 1; i >= 0; i--) {
            int temp = zahl1[i] * zahl2 + uebertrag;
            if (temp > 9) {
                multiplikation[i + 1] = temp % 10;
                uebertrag = temp / 10;
            } else {
                multiplikation[i + 1] = temp;
                uebertrag = 0;
            }
        }
        multiplikation[0] = uebertrag;
        return multiplikation;
    }
    public int [] division(int[] zahl1, int zahl2) {
        if(!areEachNumberBetween0And9(zahl1)){
            return null;
        }
        if(zahl2 == 0){
            System.out.println("Die Zahl 2 soll nicht 0 sein.");
            return null;
        }
        int[] division = new int[zahl1.length];
        int uebertrag = 0;
        for (int i = 0; i < zahl1.length; i++) {
            int temp = zahl1[i] + uebertrag * 10;
            division[i] = temp / zahl2;
            uebertrag = temp % zahl2;
        }
        return division;
    }
    public void print(int[] zahl) {
        for (int i = 0; i < zahl.length; i++) {
            System.out.print(zahl[i]);
        }
        System.out.println();
    }
}