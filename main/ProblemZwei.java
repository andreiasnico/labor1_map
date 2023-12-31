package main;

import java.util.Arrays;

public class ProblemZwei {

    public int maximale(int[] zahlen) {
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

    public int minimale(int[] zahlen) {
        int min = -1;
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] < 0 || zahlen[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return -1;
            }
            if (min == -1) {
                min = zahlen[i];
            }
            if (min > zahlen[i]) {

                min = zahlen[i];
            }
        }
        return min;

    }
    /* create method sortieren*/
    public int[] sortieren(int[] zahlen) {
        int[] sortierteZahlen = new int[zahlen.length];
        for (int i = 0; i < zahlen.length; i++) {

            sortierteZahlen[i] = zahlen[i];
        }
        for (int i = 0; i < sortierteZahlen.length; i++) {
            for (int j = i + 1; j < sortierteZahlen.length; j++) {
                if (sortierteZahlen[i] < sortierteZahlen[j]) {
                    int temp = sortierteZahlen[i];
                    sortierteZahlen[i] = sortierteZahlen[j];
                    sortierteZahlen[j] = temp;
                }
            }
        }
        return sortierteZahlen;
    }
/* create method that takes in an array of int, and returns the sum of the biggest n number of elements*/
   public int summeDerGroesstenN(int[] zahlen, int n) {
        int summe = 0;
        for(int i : zahlen){
            if(i<0 || i>100){
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return -1;
            }
        }
        int[] sortierteZahlen = sortieren(zahlen);
        for (int i = 0; i < n; i++) {
            if(sortierteZahlen[i]<0 || sortierteZahlen[i]>100){
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return -1;
            }
            summe = summe + sortierteZahlen[i];
        }
        return summe;
    }
/* create method that takes in an array of int, and returns the sum of the smallest n number of elements*/
   public int summeDerKleinstenN(int[] zahlen, int n) {
       for (int i :zahlen){
              if(i<0 || i>100){
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return -1;
              }
       }
        int summe = 0;
        int[] sortierteZahlen = sortieren(zahlen);
        for (int i = 0; i < n; i++) {
            if (sortierteZahlen[i] < 0 || sortierteZahlen[i] > 100) {
                System.out.println("Noten soll zwischen 0 und 100 sein.");
                return -1;
            }
            summe = summe + sortierteZahlen[sortierteZahlen.length - 1 - i];
        }
        return summe;
    }
    /* create methods that take in an array of int, and return the sum of the biggest/smallest n-1 numbers */

    public int summeDerKleinstenN_1(int[] zahlen){
        return summeDerKleinstenN(zahlen, zahlen.length - 1);
    }

    public int summeDerGrosstenN_1(int[] zahlen){
        return summeDerGroesstenN(zahlen, zahlen.length - 1);
    }
}