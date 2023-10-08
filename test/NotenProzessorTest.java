package test;
import java.util.ArrayList;
import main.*;

class NotenProzessorTest {

    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";

    public void addToArrayTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30 };
        int newElement = 50;

        int[] result = notenProzessor.addToArray(noten, newElement);

        assert noten[0] == result[0] : SHOULD_BE_EQUAL;
        assert noten[2] == result[1] : SHOULD_BE_EQUAL;
        assert noten[2] == result[2] : SHOULD_BE_EQUAL;
        assert result[3] == newElement : SHOULD_BE_EQUAL;

    }


    /* create tests for all methods in NotenProzessor.java */
    public void nichtAusreichendeNotenTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        int[] result = notenProzessor.nichtAusreichendeNoten(noten);

        assert result[0] == 10 : SHOULD_BE_EQUAL;
        assert result[1] == 20 : SHOULD_BE_EQUAL;
        assert result[2] == 30 : SHOULD_BE_EQUAL;
        assert result[3] == 39 : SHOULD_BE_EQUAL;
        assert result[4] == 47 : SHOULD_BE_EQUAL;
        assert result[5] == 48 : SHOULD_BE_EQUAL;
        assert result[6] == 60 : SHOULD_BE_EQUAL;
    }

    public void durchschnittWertTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        double result = notenProzessor.durchschnittWert(noten);

        assert result == 37.0 : SHOULD_BE_EQUAL;
    }

    public void abgerundeteNotenTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        int[] result = notenProzessor.abgerundeteNoten(noten);

        assert result[0] == 10 : SHOULD_BE_EQUAL;
        assert result[1] == 20 : SHOULD_BE_EQUAL;
        assert result[2] == 30 : SHOULD_BE_EQUAL;
        assert result[3] == 39 : SHOULD_BE_EQUAL;
        assert result[4] == 47 : SHOULD_BE_EQUAL;
        assert result[5] == 48 : SHOULD_BE_EQUAL;
        assert result[6] == 60 : SHOULD_BE_EQUAL;
    }
    public void roundTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int result = notenProzessor.round(10);

        assert result == 10 : SHOULD_BE_EQUAL;
    }
    public void maximaleNoteTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        int result = notenProzessor.maximaleNote(noten);

        assert result == 60 : SHOULD_BE_EQUAL;
    }
}