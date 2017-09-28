package exercises;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

public class ArrayMedianTest {

    private ArrayMedian arrayMedian;

    @Before
    public void setUp() throws Exception {
        arrayMedian = new ArrayMedian();
    }

    @Test
    public void findMedianOfTwoArraysOdd_when11ElementsEvenlyDistributed_returnsCorrectMedian(){
        int [] array1 = {1, 2, 5, 6, 8, 12};
        int[] array2 = {4, 7, 9, 13, 14};

        assertTrue(arrayMedian.findMedianOfTwoArraysOdd(array1, array2) == 7);
    }

    @Test
    public void findMedianOfTwoArraysOdd_whenArraysHaveConsecutiveElements_returnsCorrectMedian(){
        int [] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9, 10, 11};

        assertTrue(arrayMedian.findMedianOfTwoArraysOdd(array1, array2) == 6);
    }

    @Test
    public void findMedianOfTwoArraysOdd_whenOneArrayHasOnlyOneElementInTheMiddle_returnsCorrectMedian(){
        int [] array1 = {1, 2, 5, 6, 8, 12};
        int[] array2 = {4};

        assertTrue(arrayMedian.findMedianOfTwoArraysOdd(array1, array2) == 5);
    }

    @Test
    public void findMedianOfTwoArrays_whenLongArray_returnsCorrectMedian() {
        int [] array1 = {1, 2, 3, 35, 38, 41, 43, 51};
        int[] array2 = {30, 40, 50};

        assertTrue(arrayMedian.findMedianOfTwoArraysOdd(array1, array2) == 38);
    }


    @Test
    public void findMedianOfTwoArraysOdd_whenOneArrayHasOnlyOneElementWhichIsTheHighest_returnsCorrectMedian(){
        int [] array1 = {5, 6, 8, 12, 14, 15};
        int[] array2 = {20};

        assertTrue(arrayMedian.findMedianOfTwoArraysOdd(array1, array2) == 12);
    }

    @Test
    public void findMedianOfTwoArrays_whenCombinedLengthIsEven_returnsCorrectMedian(){
        int [] array1 = {5, 6, 8, 12, 14, 15};
        int[] array2 = {1, 7};

        assertTrue(arrayMedian.findMedianOfTwoArraysEven(array1, array2) == 7.5);
    }

    @Test
    public void findMedianOfTwoArrays_whenThereAreDuplicateElements_returnsCorrectMedian(){
        int [] array1 = {1, 5, 6, 8, 12, 14, 15};
        int[] array2 = {1, 7, 8};

        assertTrue(arrayMedian.findMedianOfTwoArraysEven(array1, array2) == 7.5);
    }

}