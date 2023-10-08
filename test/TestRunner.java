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

        /* test all tests in ProblemDreiTest.java */
        ProblemDreiTest problemDreiTest = new ProblemDreiTest();
        problemDreiTest.summeTest();
        problemDreiTest.summeOverflowTest();
        problemDreiTest.differenzTest();
        problemDreiTest.differenzUnderflowTest();
        problemDreiTest.multiplikationTest();
        problemDreiTest.multiplikationTest();
        problemDreiTest.divisionTest();
        problemDreiTest.divisionGanzzahligTest();

        /* test all tests in ProblemVierTest.java */
        ProblemVierTest problemVierTest = new ProblemVierTest();
        problemVierTest.billigsteTastaturTest();
        problemVierTest.billigsteTastaturTestNegative();
        problemVierTest.teuersteGegenstandTest();
        problemVierTest.teuersteGegenstandTestNegative();
        problemVierTest.teuersteUsbLaufwerkTest();
        problemVierTest.teuersteUsbLaufwerkTestNegative();
        problemVierTest.markusBudgetTest();
        problemVierTest.markusBudgetNegativeTest();

        /*other Functionality can be tested here*/


    }
}
