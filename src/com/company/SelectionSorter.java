package com.company;

public class SelectionSorter {
    public static void sort(int[] array, boolean[] arrFixed) {
        for (int i = 0; i < array.length; i++) {
            if (!arrFixed[i]) {
                int pos = i;
                int min = array[i];

                for (int j = i + 1; j < array.length; j++) {
                    if ((array[j] < min) && (!arrFixed[j])) {
                        pos = j;
                        min = array[j];
                    }
                }
                array[pos] = array[i];
                array[i] = min;
            }
        }
    }
}
