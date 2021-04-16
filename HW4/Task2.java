package com.epam.test.automation.java.practice4;

public class Task2 {
    private Task2() {
    }
    /**
     * <summary>
     * Create function Transform, replacing the value of each element of an
     * integer array with the sum of this element value and its index, only if the
     * given array is sorted in the given order (the order is set up by enum value
     * SortOrder). Array and sort order are passed by parameters. To check, if
     * the array is sorted, the function IsSorted from the Task 1 is called.
     * Example,
     * For {5, 17, 24, 88, 33, 2} and “ascending” sort order values in the array do
     * not change;
     * For {15, 10, 3} and “ascending” sort order values in the array do not
     * change;
     * For {15, 10, 3} and “descending” sort order the values in the array are
     * changing to {15, 11, 5}
     * </summary>
     */
    public static int[] transform(int[] array, SortOrder order) {
        if(array == null || array.length == 0){
            throw new IllegalArgumentException();
        }
        if (Task1.isSorted(array, order))
            for (int i = 0; i < array.length; i++)
                array[i] += i;
        return array;
    }
}
