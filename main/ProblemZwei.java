package main;

import java.util.Arrays;

public class ProblemZwei {

    int maximale(int[] zahlen) {
        int max = 0;
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] < 0 || zahlen[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return -1;
            }
            if (max < zahlen[i]) {
                max = zahlen[i];
            }
        }
        return max;
    }

    int minimale(int[] zahlen) {
        int min = -1;
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] < 0 || zahlen[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return -1;
            }
            if (min == -1) {
                min = zahlen[-1];
            }
            if (min > zahlen[i]) {

                min = zahlen[i];
            }
        }
        return min;
    }

    int maximaleN_1(int[] zahlen) {
        int [] maximaleN = new int[zahlen.length-1];

        for (int i = 0; i < zahlen.length; i++) {
            maximaleN[i] = this.maximale(zahlen);

        }


}