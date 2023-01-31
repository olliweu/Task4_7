package com.company;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSorterTest {

    @Test
    public void testMixedFixed() {
        int[] arrToSort = new int[] {5, 4, 3, 2, 1};
        boolean[] arrFixed = new boolean[] {true, false, true, false, true};

        SelectionSorter.sort(arrToSort, arrFixed);

        int[] expectedResult = new int[] {5, 2, 3, 4, 1};

        Assert.assertArrayEquals(expectedResult, arrToSort);
    }

    @Test
    public void testNotFixedArr() {
        int[] arrToSort = new int[] {5, 4, 3, 2, 1};
        boolean[] arrFixed = new boolean[] {false, false, false, false, false};

        SelectionSorter.sort(arrToSort, arrFixed);

        int[] expectedResult = new int[] {1, 2, 3, 4, 5};

        Assert.assertArrayEquals(expectedResult, arrToSort);
    }

    @Test
    public void testFixedArr() {
        int[] arrToSort = new int[] {5, 4, 3, 2, 1};
        boolean[] arrFixed = new boolean[] {true, true, true, true, true};

        SelectionSorter.sort(arrToSort, arrFixed);

        int[] expectedResult = new int[] {5, 4, 3, 2, 1};

        Assert.assertArrayEquals(expectedResult, arrToSort);
    }

    @Test
    public void testBigNums() {
        int[] arrToSort = new int[] {5000, 4000, 3000, 2000, 1000};
        boolean[] arrFixed = new boolean[] {true, false, false, false, true};

        SelectionSorter.sort(arrToSort, arrFixed);

        int[] expectedResult = new int[] {5000, 2000, 3000, 4000, 1000};

        Assert.assertArrayEquals(expectedResult, arrToSort);
    }

    @Test
    public void testAlreadySortedArr() {
        int[] arrToSort = new int[] {1, 2, 3, 4, 5};
        boolean[] arrFixed = new boolean[] {true, false, true, false, false};

        SelectionSorter.sort(arrToSort, arrFixed);

        int[] expectedResult = new int[] {1, 2, 3, 4, 5};

        Assert.assertArrayEquals(expectedResult, arrToSort);
    }
}