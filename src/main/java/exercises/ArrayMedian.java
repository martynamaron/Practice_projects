package exercises;

public class ArrayMedian {

    public int findMedianOfTwoArraysOdd(int[] array1, int[] array2) {

        int array1pointer = array1.length/2;
        int array2pointer = array2.length/2;
        boolean areArraysConsecutive = array1[array1.length-1] < array2[0]
                || array1[0] > array2[array2.length-1];
        int median = 0;

        while (median == 0) {

            if (array1[array1pointer] > array2[array2pointer]) {
                array1pointer--;
                array2pointer++;
            } else {
                array1pointer++;
                array2pointer--;
            }
            if (array1pointer >= array1.length) {
                median = array2[array2pointer];
            } else if (array1pointer == 0 && !areArraysConsecutive) {
                median = array2[--array2pointer];
            } else if (array1pointer == 0 && areArraysConsecutive) {
                median = array2[array2pointer];
            } else if (array1pointer < 0) {
                median = array2[array2pointer];
            } else if (array2pointer >= array2.length) {
                median = array1[array1pointer];
            } else if (array2pointer == 0 && !areArraysConsecutive) {
                median = array1[--array1pointer];
            } else if (array2pointer == 0 && areArraysConsecutive) {
                median = array1[array1pointer];
            } else if (array2pointer < 0) {
                median = array1[array1pointer];
            }

        }

            System.out.println("The median of the two arrays is: " + median);
            return median;

    }

    public double findMedianOfTwoArraysEven(int[] array1, int[] array2) {

        return 0.0;
    }
}
