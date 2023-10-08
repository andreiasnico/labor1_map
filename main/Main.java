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
        /* For terminal output testing insert your code here */

    }
}
