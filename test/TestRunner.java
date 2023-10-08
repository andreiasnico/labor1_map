package test;
public class TestRunner {
    public static void main(String[] args) {
        NotenProzessorTest notenProzessorTest = new NotenProzessorTest();
        /* test all tests in NotenProzessorTest.java */
        notenProzessorTest.addToArrayTest();
        notenProzessorTest.abgerundeteNotenTest();
        notenProzessorTest.durchschnittWertTest();
        notenProzessorTest.nichtAusreichendeNotenTest();
        notenProzessorTest.maximaleNoteTest();
        notenProzessorTest.roundTest();
        
        /* test all tests in ProblemZweiTest.java */
        ProblemZweiTest problemZweiTest = new ProblemZweiTest();
        problemZweiTest.maximaleTest();
        problemZweiTest.maximaleTestNegative();
        problemZweiTest.minimaleTest();
        problemZweiTest.minimaleTestNegative();
        problemZweiTest.sortierenTest();
        problemZweiTest.sortierenTestNegative();
        problemZweiTest.summeDerGroesstenNTest();
        problemZweiTest.summeDerGroesstenNTestNegative();
        problemZweiTest.sumeDerKleisntenNTestNegative();

        
    }
}
