package main;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };

        System.out.println(Arrays.toString(notenProzessor.nichtAusreichendeNoten(noten)));
        System.out.println(notenProzessor.durchschnittWert(noten));
        System.out.println(Arrays.toString(notenProzessor.abgerundeteNoten(noten)));
        System.out.println(notenProzessor.maximaleNote(notenProzessor.abgerundeteNoten(noten)));
        /* Problem 2 output */
        ProblemZwei problemZwei = new ProblemZwei();
        int[] zahlen = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        System.out.println(problemZwei.maximale(zahlen));
        System.out.println(problemZwei.minimale(zahlen));
        System.out.println(Arrays.toString(problemZwei.sortieren(zahlen)));
        System.out.println(problemZwei.summeDerGroesstenN(zahlen, 3));
        System.out.println(problemZwei.summeDerGrosstenN_1(zahlen));
        System.out.println(problemZwei.summeDerKleinstenN_1(zahlen));

        /* Problem3 output */

        System.out.println("PROBLEM 3");
        ProblemDrei problemDrei = new ProblemDrei();
        int[] zahl1 = new int[] { 5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = new int[] { 8, 3, 0, 0, 0, 0, 0, 0, 0};
        int zahl3 =3;
        System.out.println(Arrays.toString(problemDrei.summe(zahl1, zahl2)));
        System.out.println(Arrays.toString(problemDrei.differenz(zahl1, zahl2)));
        System.out.println(Arrays.toString(problemDrei.multiplikation(zahl1, zahl3)));
        System.out.println(Arrays.toString(problemDrei.division(zahl1, zahl3)));

        /* Problem4 output */
        System.out.println("PROBLEM 4");
        ProblemVier problemVier = new ProblemVier();
        int[] tastaturen = new int[] { 40, 50, 60};
        int[]  usb = new int[] { 5, 8, 12};
        int budget = 60;


        System.out.println(problemVier.billigsteTastatur(tastaturen));
        System.out.println(problemVier.teuersteGegenstand(tastaturen, usb));
        System.out.println(problemVier.teuersteUsbLaufwerk(usb, budget));
        System.out.println(problemVier.markusBudget(budget, tastaturen, usb));





        /* For terminal output testing insert your code here */

    }
}
