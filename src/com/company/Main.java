package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arrToSort = new int[] {2, 1, 6, 3, 7, 8};
        boolean[] arrFixed = new boolean[] {true, false, false, true, false, false };

        SelectionSorter.sort(arrToSort, arrFixed);

        for (int j : arrToSort) {
            System.out.print(j + " ");
        }
    }
}
