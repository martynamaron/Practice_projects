package exercises;
//http://www.geeksforgeeks.org/median-of-two-sorted-arrays-of-different-sizes/
import static java.lang.Math.max;
import static java.lang.Math.min;

public class ArrayMedian {

    public double findMedianOfTwoArrays(int[] array1, int[] array2) {

        double median = 0.0;
        if (array1.length < array2.length) {
            median = findMedian(array1, array1.length, array2, array2.length);
        } else {
            median = findMedian(array2, array2.length, array1, array1.length);
        }

        System.out.println("The median of the two arrays is: " + median);
        return median;
    }

    private double findMedian(int[] array1, int length1, int[] array2, int length2) {
        if (length1 == 0) {
            return getMedianOfSingleArray(array2, length2);
        }
         if (length1 == 1) {
            if (length2 == 1) {
                return getMedianOfTwoIntegers(array1[0], array2[0]);
            }
            if (length2 % 2 != 0) {
                return getMedianOfTwoIntegers(array2[length2/2], getMedianOfThreeIntegers(array1[0], array2[length2/2-1],
                        array2[length2/2+1]));
            } else {
                return getMedianOfThreeIntegers(array1[0], array2[length2/2], array2[length2/2-1]);
            }
        } else if (length1 == 2) {
             if (length2 == 2) {
                 return getMedianOfFourIntegers(array1[0], array1[1], array2[0], array2[1]);
             }
             if (length2 % 2 != 0) {
                 return getMedianOfThreeIntegers(array2[length2/2], max(array1[0], array2[length2/2-1]),
                         min(array1[1], array2[length2/2+1]));
             } else {
                 return getMedianOfFourIntegers(array2[length2/2], array2[length2/2-1],
                         max(array1[0], array2[length2/2-2]), min(array1[1], array2[length2/2+1]));
             }
         }

         int pointer1 = (length1-1) /2;
         int pointer2 = (length2-1) /2;

        if (array1[pointer1] >= array2[pointer2]) {
            return findMedian(array1, length1/2 + 1, array2, length2-pointer1);
        }
    }

    private double getMedianOfSingleArray(int[] array, int n) {
        if (n == 0)
            return -1;
        if (n % 2 == 0)
            return (array[n / 2] + array[n / 2 - 1]) / 2;
        return array[n / 2];
    }

    private double getMedianOfTwoIntegers(double a, double b) {
        return (a + b) / 2.0;
    }

    private double getMedianOfThreeIntegers(double a, double b, double c) {
        //5, 2, 8
        return a + b + c - max(a, max(b, c)) - min(a, min(b, c));
    }

    private double getMedianOfFourIntegers(double a, double b, double c, double d) {
        //6, 1, 2, 9
        double max = max(max(a, b), max(c, d)); //9
        double min = min(min(a, b), min(c, d)); //1
        return (a + b + c + d - max - min) / 2.0; //8 / 2
    }

}
