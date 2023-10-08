package test;
import main.ProblemZwei;
public class ProblemZweiTest {
    /*create 2 tests, 1 positive and one negative for each method in ProblemZwei.java*/
    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";
    public static final String SHOULD_NOT_WORK = "Soll nicht laufen";
    public void maximaleTest() {
        ProblemZwei problemZwei = new ProblemZwei();
        int[] zahlen = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        int result = problemZwei.maximale(zahlen);
        assert result == 60 : SHOULD_BE_EQUAL;
    }
    public void maximaleTestNegative() {
        ProblemZwei problemZwei = new ProblemZwei();
        int[] zahlen = new int[] { -10, 20, 30, 39, 47, 48, 60 };
        int result = problemZwei.maximale(zahlen);
        assert result == 9 : SHOULD_NOT_WORK;
    }
    public void minimaleTest() {
        ProblemZwei problemZwei = new ProblemZwei();
        int[] zahlen = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        int result = problemZwei.minimale(zahlen);
        assert result == 10 : SHOULD_BE_EQUAL;
    }
    public void minimaleTestNegative() {
        ProblemZwei problemZwei = new ProblemZwei();
        int[] zahlen = new int[] { -10, 20, 30, 39, 47, 48, 60 };
        int result = problemZwei.minimale(zahlen);
        assert result == 10 : SHOULD_NOT_WORK;
    }
    public void sortierenTest() {
        ProblemZwei problemZwei = new ProblemZwei();
        int[] zahlen = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        int[] result = problemZwei.sortieren(zahlen);
        assert result[0] == 60 : SHOULD_BE_EQUAL;
        assert result[1] == 48 : SHOULD_BE_EQUAL;
        assert result[2] == 47 : SHOULD_BE_EQUAL;
        assert result[3] == 39 : SHOULD_BE_EQUAL;
        assert result[4] == 30 : SHOULD_BE_EQUAL;
        assert result[5] == 20 : SHOULD_BE_EQUAL;
        assert result[6] == 10 : SHOULD_BE_EQUAL;
    }
    public void sortierenTestNegative() {
        ProblemZwei problemZwei = new ProblemZwei();
        int[] zahlen = new int[] { -10, 20, 30, 39, 47, 48, 60 };
        int[] result = problemZwei.sortieren(zahlen);
        assert result[0] == 10 : SHOULD_NOT_WORK;
        assert result[1] == 20 : SHOULD_BE_EQUAL;
        assert result[2] == 30 : SHOULD_BE_EQUAL;
        assert result[3] == 39 : SHOULD_BE_EQUAL;
        assert result[4] == 47 : SHOULD_BE_EQUAL;
        assert result[5] == 48 : SHOULD_BE_EQUAL;
        assert result[6] == 60 : SHOULD_BE_EQUAL;
    }
    public void summeDerGroesstenNTest() {
        ProblemZwei problemZwei = new ProblemZwei();
        int[] zahlen = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        int result = problemZwei.summeDerGroesstenN(zahlen, 3);
        assert result == 155 : SHOULD_BE_EQUAL;
    }
    public void summeDerGroesstenNTestNegative() {
        ProblemZwei problemZwei = new ProblemZwei();
        int[] zahlen = new int[] { 10, 20, -30, 39, 47, 48, 60 };
        int result = problemZwei.summeDerGroesstenN(zahlen, 3);
        assert result == 156 : SHOULD_NOT_WORK;
    }
   public void sumeDerKleisntenNTest(){
        ProblemZwei problemZwei = new ProblemZwei();
        int[] zahlen = new int[] { 10, 20, 30, 39, 47, 48, 60 };
        int result = problemZwei.summeDerKleinstenN(zahlen, 3);
        assert result == 60 : SHOULD_BE_EQUAL;

   }
   public void sumeDerKleisntenNTestNegative(){
        ProblemZwei problemZwei = new ProblemZwei();
        int[] zahlen = new int[] { 10, 20, -30, 39, 47, 48, 60 };
        int result = problemZwei.summeDerKleinstenN(zahlen, 3);
        assert result == 61 : SHOULD_NOT_WORK;

   }

}
