package main;

public class ProblemVier {
    /*Markus will ein USB Laufwerk und eine Tastatur kaufen. Der Elektronik-Shop hat
verschiedene USB Laufwerke und Tastaturen mit verschiedene Preise, als Array von Zahlen
dargestellt.
1. Schreiben Sie eine Methode, die die billigste Tastatur zurückgibt.
z.B. [40 35 70 15 45] => 15
2. Schreiben Sie eine Methode, die die teuerste Gegenstand zurückgibt.
z.B. Tastatur = [15 20 10 35], USB = [20, 15, 40 15] => 40
3. Schreiben Sie eine Methode, die die teuerste USB Laufwerk, die Markus kaufen kann,
zurückgibt.
z.B. Preise = [15 45 20], Budget = 30 => 20
4. Finden Sie, anhand des Markus Budget und der Preislisten für die Tastaturen und
USB-Laufwerke, den Geldbetrag Markus ausgeben wird. Wenn er nicht genug für
beide hat, geben Sie stattdessen -1 zurück. Er kauft nur die zwei benötigten
Gegenstände.
z.B. b=60, tastaturen = [40 50 60] und usb Laufwerke = [8 12] => 50 + 8 = 58*/
    private boolean checkIfNumberPositive(int number){
        if (number >= 0){

            return true;
        }
        System.out.println("Die Zahl soll positiv sein.");
        return false;
    }
    public int billigsteTastatur(int[] tastaturen) {
        int min = tastaturen[0];
        for (int i = 1; i < tastaturen.length; i++) {
            if(!checkIfNumberPositive(tastaturen[i])){
                return -1;
            }
            if (tastaturen[i] < min) {
                min = tastaturen[i];
            }
        }
        return min;
    }

    public int teuersteGegenstand(int[] tastaturen, int[] usb) {
        int max = tastaturen[0];
        for (int i = 1; i < tastaturen.length; i++) {
            if(!checkIfNumberPositive(tastaturen[i])){
                return -1;
            }
            if (tastaturen[i] > max) {
                max = tastaturen[i];
            }
        }
        for (int i = 0; i < usb.length; i++) {
            if(!checkIfNumberPositive(usb[i])){
                return -1;
            }
            if (usb[i] > max) {
                max = usb[i];
            }
        }
        return max;
    }

    public int teuersteUsbLaufwerk(int[] usb, int budget) {
        int max = usb[0];
        if (!checkIfNumberPositive(budget)){
            System.out.println("Budget soll positiv sein.");
            return -1;
        }
        for (int i = 1; i < usb.length; i++) {
            if(!checkIfNumberPositive(usb[i])){
                System.out.println("USB Laufwerk soll positiv sein.");
                return -1;
            }
            if (usb[i] > max && usb[i] <= budget) {
                max = usb[i];
            }
        }
        return max;
    }

    public int markusBudget(int budget, int[] tastaturen, int[] usb) {
        if (!checkIfNumberPositive(budget)){
            System.out.println("Budget soll positiv sein.");
            return -1;
        }
        int max = -1;
        for (int i = 0; i < tastaturen.length; i++) {
            if(!checkIfNumberPositive(tastaturen[i])){
                System.out.println("Tastatur soll positiv sein.");
                return -1;
            }
            for (int j = 0; j < usb.length; j++) {
                if(!checkIfNumberPositive(usb[j])){
                    System.out.println("USB Laufwerk soll positiv sein.");
                    return -1;
                }

                if (tastaturen[i] + usb[j] <= budget && tastaturen[i] + usb[j] > max) {
                    max = tastaturen[i] + usb[j];
                }
            }
        }
        return max;
    }
}
