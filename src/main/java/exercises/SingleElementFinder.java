package exercises;

//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
//Find a single element in an array of double elements
//Your solution should run in O(log n) time and O(1) space.

public class SingleElementFinder {

    public int getSingleElement(int[] array) {
        boolean singleElementFound = false;
        int index = 0;
        while (!singleElementFound) {
            if (array[index] == array[index+1]) {
                index = index + 2;
                if (index == array.length-1){
                    singleElementFound = true;
                }
            } else {
                singleElementFound = true;
            }
        }
        return array[index];
    }
}
