package exercises;

public class ArrayMedian {

    public int findMedianOfTwoArraysOdd(int[] array1, int[] array2) {

        int sum = array1.length + array2.length;
        int medianIndex = (sum / 2) + 1;
        System.out.println("Median position is: " + medianIndex);

        int counter = 1;
        int pivot = 0;

        if (sum == 2) {
            return (array1[0] + array2[0]) / 2;
        } else {
            int indexArray1 = 0;
            int indexArray2 = 0;
            while (counter != medianIndex) {
                if (array1[indexArray1] < array2[indexArray2]) {
                    indexArray1++;
                    counter++;
                    pivot = array2[indexArray2];
                } else {
                    indexArray2++;
                    counter++;
                    pivot = array1[indexArray1];
                }
            }
            System.out.println("The median of the two arrays is: " + pivot);
            return pivot;
        }
    }

    public double findMedianOfTwoArraysEven(int[] array1, int[] array2) {

        return 0.0;
    }
}
