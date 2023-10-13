package test;
import java.util.ArrayList;
import java.util.Arrays;

import main.*;

import javax.lang.model.type.NullType;

class NotenProzessorTest {

    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";
    public static final String SHOULD_FAIL = "Soll fehlschlagen";

    public void addToArrayTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30 };
        int newElement = 50;

        int[] result = notenProzessor.addToArray(noten, newElement);

        assert noten[0] == result[0] : SHOULD_BE_EQUAL;
        assert noten[1] == result[1] : SHOULD_BE_EQUAL;
        assert noten[2] == result[2] : SHOULD_BE_EQUAL;
        assert result[3] == newElement : SHOULD_BE_EQUAL;

    }
    public void addToArrayTestNegative(){
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = new int[] { -10, -20, -30 };
        double newElement = -50;


        int[] result = notenProzessor.addToArray(noten, (int)newElement);
        assert result==null : SHOULD_FAIL;

    }


    /* create tests for all methods in NotenProzessor.java */
    public void nichtAusreichendeNotenTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        int[] result = notenProzessor.nichtAusreichendeNoten(noten);

        assert result[0] == 10 : SHOULD_BE_EQUAL;
        assert result[1] == 20 : SHOULD_BE_EQUAL;
        assert result[2] == 30 : SHOULD_BE_EQUAL;

    }
    public void nichtAusreichendeNotenTestNegative(){
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = new int[] { -10, -20, -30 };

        int[] result = notenProzessor.nichtAusreichendeNoten(noten);

        assert result==null : SHOULD_FAIL;
    }

    public void durchschnittWertTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        double result = notenProzessor.durchschnittWert(noten);
        //System.out.println(result);

        assert result == 36.0 : SHOULD_BE_EQUAL;
    }
    public void durchschnittWertTestNegative(){
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = new int[] { -10, -20, -30 };

        double result = notenProzessor.durchschnittWert(noten);

        assert  result==-1 : SHOULD_FAIL;
    }

    public void abgerundeteNotenTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        int[] result = notenProzessor.abgerundeteNoten(noten);
        //System.out.println(Arrays.toString(result));
        assert result[0] == 10 : SHOULD_BE_EQUAL;
        assert result[1] == 20 : SHOULD_BE_EQUAL;
        assert result[2] == 30 : SHOULD_BE_EQUAL;
        assert result[3] == 40 : SHOULD_BE_EQUAL;
        assert result[4] == 47 : SHOULD_BE_EQUAL;
        assert result[5] == 50 : SHOULD_BE_EQUAL;
        assert result[6] == 60 : SHOULD_BE_EQUAL;
    }
    public void abgerundeteNotenTestNegative(){
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = new int[] { -10, -20, -30 };
        int[] result = notenProzessor.abgerundeteNoten(noten);

        assert result==null : SHOULD_FAIL;
    }
    public void roundTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int result = notenProzessor.round(10);

        assert result == 10 : SHOULD_BE_EQUAL;
    }
    public void roundTestnegative(){
        NotenProzessor notenProzessor = new NotenProzessor();
        int result = notenProzessor.round(-10);

        assert result==-1 : SHOULD_FAIL;
    }
    public void maximaleNoteTest() {
        NotenProzessor notenProzessor = new NotenProzessor();

        int[] noten = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        int result = notenProzessor.maximaleNote(noten);

        assert result == 60 : SHOULD_BE_EQUAL;

    }
    public void maximaleNoteTestNegative(){
        NotenProzessor notenProzessor = new NotenProzessor();
        int[] noten = new int[] { -10, -20, -30 };
        int result = notenProzessor.maximaleNote(noten);

        assert result==-1 : SHOULD_FAIL;
    }
}