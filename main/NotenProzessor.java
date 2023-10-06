package main;

public class NotenProzessor {

    public int[] nichtAusreichendeNoten(int[] note) {

        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return null;
            }
        }



        int[] finaleNoten = new int[0];

        for (int i = 0; i < note.length; i++) {
            if (round(note[i]) >= 40) {
                finaleNoten = addToArray(finaleNoten, round(note[i]));
            }
        }
        return finaleNoten;
    }
    public int durchschnittWert(int[] note){
        int durchschnittNote = 0;
        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return -1;

            }
            durchschnittNote = durchschnittNote + note[i];

        }
        durchschnittNote = durchschnittNote/note.length;
        return durchschnittNote;
    }
    public int[] abgerundeteNoten(int[] note) {
        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return null;

            }
            note[i] = this.round(note[i]);


        }
        return note;
    }


    public int round(int note) {
        if (note < 38) {
            return note;
        } else {
            if (note % 5 > 2) {
                return note + 5 - note % 5;
            } else {
                return note;
            }
        }
    }
    public int maximaleNote(int[] note){
        int max = 0;
        for (int i = 0; i < note.length; i++) {
            if (note[i] < 0 || note[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return -1;
            }
            if(max < note[i]){
                max = note[i];
            }
        }
        return max;
    }

    public int[] addToArray(int[] original, int newElement) {
        int[] result = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }
        result[original.length] = newElement;
        return result;
    }


}
