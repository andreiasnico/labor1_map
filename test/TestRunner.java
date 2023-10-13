package test;
public class TestRunner {
    public static void main(String[] args) {
        NotenProzessorTest notenProzessorTest = new NotenProzessorTest();
        /* test all tests in NotenProzessorTest.java */

        notenProzessorTest.addToArrayTest();
        notenProzessorTest.addToArrayTestNegative();

        notenProzessorTest.nichtAusreichendeNotenTest();
        notenProzessorTest.nichtAusreichendeNotenTestNegative();

        notenProzessorTest.abgerundeteNotenTest();
        notenProzessorTest.abgerundeteNotenTestNegative();

        notenProzessorTest.durchschnittWertTest();
        notenProzessorTest.durchschnittWertTestNegative();

        notenProzessorTest.maximaleNoteTest();
        notenProzessorTest.maximaleNoteTestNegative();

        notenProzessorTest.roundTest();
        notenProzessorTest.roundTestnegative();
        
        /* test all tests in ProblemZweiTest.java */
        ProblemZweiTest problemZweiTest = new ProblemZweiTest();
        /*Problem 2 subproblem #1*/
        System.out.println("Problem 2 subproblem #1");
        problemZweiTest.maximaleTest();
        problemZweiTest.maximaleTestNegative();
        /*Problem 2 subproblem #2*/
        System.out.println("Problem 2 subproblem #2");
        problemZweiTest.minimaleTest();
        problemZweiTest.minimaleTestNegative();
        System.out.println("Problem 2 subproblem #3");
        problemZweiTest.sumeDerGrostenN_1Test();
        problemZweiTest.summeDerGrostenN_1Test2();
        System.out.println("Problem 2 subproblem #4");
        problemZweiTest.sumeDerKleinstenN_1Test();
        problemZweiTest.summeDerKleinstenN_1Test2();


        /* In between possible tests
        problemZweiTest.sortierenTest();
        problemZweiTest.sortierenTestNegative();
        problemZweiTest.summeDerGroesstenNTest();
        problemZweiTest.summeDerGroesstenNTestNegative();
        problemZweiTest.sumeDerKleisntenNTestNegative(); */


        /*Problem 2 subproblem #3*/
        System.out.println("Problem 2 subproblem #3");
        problemZweiTest.summeDerKleinstenN_1Test2();
        problemZweiTest.sumeDerKleinstenN_1Test();
        /*Problem 2 subproblem #4*/
        System.out.println("Problem 2 subproblem #4");
        problemZweiTest.sumeDerGrostenN_1Test();
        problemZweiTest.summeDerGrostenN_1Test2();

        /* test all tests in ProblemDreiTest.java */
        ProblemDreiTest problemDreiTest = new ProblemDreiTest();
        /*Problem 3 subproblem #1
        *
        *  Es gibt 2 große Zahlen. Die Zahlen sind als Array dargestellt.
            1. Berechnen Sie die Summe. Die Zahlen haben die gleiche Anzahl an Ziffern.
            z.B. [1 3 0 0 0 0 0 0 0] + [8 7 0 0 0 0 0 0 0] = [1 0 0 0 0 0 0 0 0 0]
        * */
        System.out.println("Problem 3 subproblem #1");
        problemDreiTest.summeTest();
        problemDreiTest.summeOverflowTest();
        /*Problem 3 subproblem #2
        *
        * Es gibt 2 große Zahlen. Die Zahlen sind als Array dargestellt.
            1. Berechnen Sie die Summe. Die Zahlen haben die gleiche Anzahl an Ziffern.
            z.B. [1 3 0 0 0 0 0 0 0] + [8 7 0 0 0 0 0 0 0] = [1 0 0 0 0 0 0 0 0 0]
        * */
        System.out.println("Problem 3 subproblem #2");
        problemDreiTest.differenzTest();
        problemDreiTest.differenzUnderflowTest();
        /*Problem 3 subproblem #3
        *
        * 3. Berechnen Sie die Multiplikation. Erste Zahl ist ein große Zahl, der Zweite Zahl ist nur
                ein Ziffer.
                z.B. [2 3 6 0 0 0 0 0 0] * 2 = [4 7 2 0 0 0 0 0 0]
        * */
        System.out.println("Problem 3 subproblem #3");
        problemDreiTest.multiplikationTest();
        problemDreiTest.multiplikationTest();
        /*Problem 3 subproblem #4

        * Berechnen Sie die ganzzahlige Division. Erste Zahl ist ein große Zahl, der Zweite Zahl
            ist nur ein Ziffer.
            z.B. [2 3 6 0 0 0 0 0 0] / 2 = [1 1 8 0 0 0 0 0 0]
        * */
        System.out.println("Problem 3 subproblem #4");
        problemDreiTest.divisionTest();
        problemDreiTest.divisionGanzzahligTest();

        /* test all tests in ProblemVierTest.java */
        ProblemVierTest problemVierTest = new ProblemVierTest();
        /*Problem 4 subproblem #1
        *
        * Markus will ein USB Laufwerk und eine Tastatur kaufen. Der Elektronik-Shop hat
            verschiedene USB Laufwerke und Tastaturen mit verschiedene Preise, als Array von Zahlen
            dargestellt.
            1. Schreiben Sie eine Methode, die die billigste Tastatur zurückgibt.
            z.B. [40 35 70 15 45] => 15
        * */
        System.out.println("Problem 4 subproblem #1");
        problemVierTest.billigsteTastaturTest();
        problemVierTest.billigsteTastaturTestNegative();
        /*Problem 4 subproblem #2
        *
        2. Schreiben Sie eine Methode, die die teuerste Gegenstand zurückgibt.
            z.B. Tastatur = [15 20 10 35], USB = [20, 15, 40 15] => 40
         */
        System.out.println("Problem 4 subproblem #2");
        problemVierTest.teuersteGegenstandTest();
        problemVierTest.teuersteGegenstandTestNegative();
        /*Problem 4 subproblem #3
        *
        3. Schreiben Sie eine Methode, die die teuerste USB Laufwerk, die Markus kaufen kann,
            zurückgibt.
            z.B. Preise = [15 45 20], Budget = 30 => 20
         */
        System.out.println("Problem 4 subproblem #3");
        problemVierTest.teuersteUsbLaufwerkTest();
        problemVierTest.teuersteUsbLaufwerkTestNegative();
        /*Problem 4 subproblem #4
        *
        * Finden Sie, anhand des Markus Budget und der Preislisten für die Tastaturen und
            USB-Laufwerke, den Geldbetrag Markus ausgeben wird. Wenn er nicht genug für
            beide hat, geben Sie stattdessen -1 zurück. Er kauft nur die zwei benötigten
            Gegenstände.
            z.B. b=60, tastaturen = [40 50 60] und usb Laufwerke = [8 12] => 50 + 8 = 58

         */
        System.out.println("Problem 4 subproblem #4");
        problemVierTest.markusBudgetTest();
        problemVierTest.markusBudgetNegativeTest();

        /*other Functionality can be tested here*/

        System.out.println("All tests passed.");
    }
}
