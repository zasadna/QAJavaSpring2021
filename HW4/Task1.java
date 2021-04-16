package com.epam.test.automation.java.practice4;

public class Task1 {
    private Task1() {
    }

    /**
     * <summary>
     * Create function IsSorted, determining whether a given array of integer
     * values of arbitrary length is sorted in a given order (the order is set up by
     * enum value SortOrder). Array and sort order are passed by parameters.
     * Function does not change the array.
     * * Functions’ signature should start from words public static
     * </summary>
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null || array.length <= 1 || array[0]==0){
            throw new IllegalArgumentException();
        }
        boolean sorted = true;
        for (int i = 1; i < array.length; i++) {
            if ((SortOrder.ASC == order && array[i - 1] > array[i]) ||
                    (SortOrder.DESC == order && array[i - 1] < array[i]))
                sorted = false;
        }
        return sorted;
    }
}
