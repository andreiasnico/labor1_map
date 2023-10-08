package test;
import main.ProblemDrei;
public class ProblemDreiTest {
/* crate one test with good input and one test with bad input for each method in ProblemDrei.java*/
public static final String SHOULD_BE_EQUAL = "Soll gleich sein";
    public void summeTest(){
        ProblemDrei problemDrei = new ProblemDrei();
        int[] zahl1 = new int[] { 1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = new int[] { 8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] result = problemDrei.summe(zahl1, zahl2);
        assert result[0] == 9 : SHOULD_BE_EQUAL;
        assert result[1] == 0 : SHOULD_BE_EQUAL;
        assert result[2] == 0 : SHOULD_BE_EQUAL;
        assert result[3] == 0 : SHOULD_BE_EQUAL;
        assert result[4] == 0 : SHOULD_BE_EQUAL;
        assert result[5] == 0 : SHOULD_BE_EQUAL;
        assert result[6] == 0 : SHOULD_BE_EQUAL;
        assert result[7] == 0 : SHOULD_BE_EQUAL;
        assert result[8] == 0 : SHOULD_BE_EQUAL;
        assert result[9] == 0 : SHOULD_BE_EQUAL;

    }
    public void summeOverflowTest(){
        ProblemDrei problemDrei = new ProblemDrei();
        int[] zahl1 = new int[] { 2, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = new int[] { 8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] result = problemDrei.summe(zahl1, zahl2);
        assert result[0] == 1 : SHOULD_BE_EQUAL;
        assert result[1] == 1 : SHOULD_BE_EQUAL;
        assert result[2] == 0 : SHOULD_BE_EQUAL;
        assert result[3] == 0 : SHOULD_BE_EQUAL;
        assert result[4] == 0 : SHOULD_BE_EQUAL;
        assert result[5] == 0 : SHOULD_BE_EQUAL;
        assert result[6] == 0 : SHOULD_BE_EQUAL;
        assert result[7] == 0 : SHOULD_BE_EQUAL;
        assert result[8] == 0 : SHOULD_BE_EQUAL;
        assert result[9] == 0 : SHOULD_BE_EQUAL;
        assert result[10] == 0 : SHOULD_BE_EQUAL;


    }
    public void differenzTest(){
        ProblemDrei problemDrei = new ProblemDrei();
        int[] zahl1 = new int[] { 8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = new int[] { 5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] result = problemDrei.differenz(zahl1, zahl2);
        assert result[0] == 2 : SHOULD_BE_EQUAL;
        assert result[1] == 9 : SHOULD_BE_EQUAL;
        assert result[2] == 0 : SHOULD_BE_EQUAL;
        assert result[3] == 0 : SHOULD_BE_EQUAL;
        assert result[4] == 0 : SHOULD_BE_EQUAL;
        assert result[5] == 0 : SHOULD_BE_EQUAL;
        assert result[6] == 0 : SHOULD_BE_EQUAL;
        assert result[7] == 0 : SHOULD_BE_EQUAL;
        assert result[8] == 0 : SHOULD_BE_EQUAL;
    }
    public void differenzUnderflowTest(){
        ProblemDrei problemDrei = new ProblemDrei();
        int[] zahl1 = new int[] { 5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] zahl2 = new int[] { 8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] result = problemDrei.differenz(zahl1, zahl2);
        assert result[0] == 0 : SHOULD_BE_EQUAL;
        assert result[1] == 0 : SHOULD_BE_EQUAL;
        assert result[2] == 0 : SHOULD_BE_EQUAL;
        assert result[3] == 0 : SHOULD_BE_EQUAL;
        assert result[4] == 0 : SHOULD_BE_EQUAL;
        assert result[5] == 0 : SHOULD_BE_EQUAL;
        assert result[6] == 0 : SHOULD_BE_EQUAL;
        assert result[7] == 0 : SHOULD_BE_EQUAL;
        assert result[8] == 0 : SHOULD_BE_EQUAL;
    }
    public void multiplikationTest(){
        ProblemDrei problemDrei = new ProblemDrei();
        int[] zahl1 = new int[] { 1, 3, 0, 0, 0, 0, 0, 0, 0};
        int zahl2 = 2;
        int[] result = problemDrei.multiplikation(zahl1, zahl2);
        assert result[0] == 2 : SHOULD_BE_EQUAL;
        assert result[1] == 6 : SHOULD_BE_EQUAL;
        assert result[2] == 0 : SHOULD_BE_EQUAL;
        assert result[3] == 0 : SHOULD_BE_EQUAL;
        assert result[4] == 0 : SHOULD_BE_EQUAL;
        assert result[5] == 0 : SHOULD_BE_EQUAL;
        assert result[6] == 0 : SHOULD_BE_EQUAL;
        assert result[7] == 0 : SHOULD_BE_EQUAL;
        assert result[8] == 0 : SHOULD_BE_EQUAL;
        assert result[9] == 0 : SHOULD_BE_EQUAL;
    }
    public void multiplikationNegativTest(){
        ProblemDrei problemDrei = new ProblemDrei();
        int[] zahl1 = new int[] { 1, 3, 0, 0, 0, 0, 0, 0, 0};
        int zahl2 = -2;
        int[] result = problemDrei.multiplikation(zahl1, zahl2);
        assert result[0] == 0 : SHOULD_BE_EQUAL;
        assert result[1] == 0 : SHOULD_BE_EQUAL;
        assert result[2] == 0 : SHOULD_BE_EQUAL;
        assert result[3] == 0 : SHOULD_BE_EQUAL;
        assert result[4] == 0 : SHOULD_BE_EQUAL;
        assert result[5] == 0 : SHOULD_BE_EQUAL;
        assert result[6] == 0 : SHOULD_BE_EQUAL;
        assert result[7] == 0 : SHOULD_BE_EQUAL;
        assert result[8] == 0 : SHOULD_BE_EQUAL;
        assert result[9] == 0 : SHOULD_BE_EQUAL;
    }
    public void divisionTest(){
        ProblemDrei problemDrei = new ProblemDrei();
        int[] zahl1 = new int[] { 1, 3, 0, 0, 0, 0, 0, 0, 0};
        int zahl2 = 2;
        int[] result = problemDrei.division(zahl1, zahl2);
        assert result[0] == 6 : SHOULD_BE_EQUAL;
        assert result[1] == 5 : SHOULD_BE_EQUAL;
        assert result[2] == 0 : SHOULD_BE_EQUAL;
        assert result[3] == 0 : SHOULD_BE_EQUAL;
        assert result[4] == 0 : SHOULD_BE_EQUAL;
        assert result[5] == 0 : SHOULD_BE_EQUAL;
        assert result[6] == 0 : SHOULD_BE_EQUAL;
        assert result[7] == 0 : SHOULD_BE_EQUAL;
        assert result[8] == 0 : SHOULD_BE_EQUAL;

    }
    public void divisionGanzzahligTest(){
        ProblemDrei problemDrei = new ProblemDrei();
        int[] zahl1 = new int[] { 1, 3, 0, 0, 0, 0, 0, 0, 0};
        int zahl2 = 3;
        int[] result = problemDrei.division(zahl1, zahl2);
        assert result[0] == 4 : SHOULD_BE_EQUAL;
        assert result[1] == 3 : SHOULD_BE_EQUAL;
        assert result[2] == 3 : SHOULD_BE_EQUAL;
        assert result[3] == 3 : SHOULD_BE_EQUAL;
        assert result[4] == 3 : SHOULD_BE_EQUAL;
        assert result[5] == 3 : SHOULD_BE_EQUAL;
        assert result[6] == 3 : SHOULD_BE_EQUAL;
        assert result[7] == 3 : SHOULD_BE_EQUAL;
        assert result[8] == 3 : SHOULD_BE_EQUAL;
    }
}

