package test;
import main.ProblemVier;
public class ProblemVierTest {
    /* crate one test with good input and one test with bad input for each method in ProblemVier.java*/
    public static final String SHOULD_BE_EQUAL = "Soll gleich sein";
    public void  billigsteTastaturTest(){
        ProblemVier problemVier = new ProblemVier();
        int[] tastaturen = new int[] { 40, 50, 60};


        int result = problemVier.billigsteTastatur(tastaturen);
        assert result == 40 : SHOULD_BE_EQUAL;
    }
    public void billigsteTastaturTestNegative(){
        ProblemVier problemVier = new ProblemVier();
        int[] tastaturen = new int[] { -40, -50, -60};


        int result = problemVier.billigsteTastatur(tastaturen);
        assert result == -1 : SHOULD_BE_EQUAL;
    }
    public void teuersteGegenstandTest(){
        ProblemVier problemVier = new ProblemVier();
        int[] tastaturen = new int[] { 40, 50, 60};
        int[] usb = new int[] { 10, 20, 30};

        int result = problemVier.teuersteGegenstand(tastaturen, usb);
        assert result == 60 : SHOULD_BE_EQUAL;
    }
    public void teuersteGegenstandTestNegative(){
        ProblemVier problemVier = new ProblemVier();
        int[] tastaturen = new int[] { -40, -50, -60};
        int[] usb = new int[] { -10, -20, -30};

        int result = problemVier.teuersteGegenstand(tastaturen, usb);
        assert result == -1 : SHOULD_BE_EQUAL;
    }
    public void teuersteUsbLaufwerkTest(){
        ProblemVier problemVier = new ProblemVier();
        int[] usb = new int[] { 10, 20, 30};
        int budget = 30;

        int result = problemVier.teuersteUsbLaufwerk(usb, budget);
        assert result == 30 : SHOULD_BE_EQUAL;
    }
    public void teuersteUsbLaufwerkTestNegative(){
        ProblemVier problemVier = new ProblemVier();
        int[] usb = new int[] { -10, -20, -30};
        int budget = 30;

        int result = problemVier.teuersteUsbLaufwerk(usb, budget);
        assert result == -1 : SHOULD_BE_EQUAL;
    }
    public void markusBudgetTest(){
        ProblemVier problemVier = new ProblemVier();
        int[] tastaturen = new int[] { 40, 50, 60};
        int[] usb = new int[] { 10, 20, 30};
        int budget = 60;

        int result = problemVier.markusBudget(budget, tastaturen, usb);
        assert result == 60 : SHOULD_BE_EQUAL;
    }

    public void markusBudgetNegativeTest(){
        ProblemVier problemVier = new ProblemVier();
        int[] tastaturen = new int[] { 40, 50, 60};
        int[] usb = new int[] { 10, 20, 30};
        int budget = -60;

        int result = problemVier.markusBudget(budget, tastaturen, usb);
        assert result == -1 : SHOULD_BE_EQUAL;
    }

}
