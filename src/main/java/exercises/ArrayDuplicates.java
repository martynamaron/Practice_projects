package exercises;

import java.util.*;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/#/description
public class ArrayDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<Integer>();
        Map<Integer, Integer> trackingMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (trackingMap.containsKey(nums[i])) {
                duplicates.add(nums[i]);
            } else {
                trackingMap.put(nums[i], nums[i]);
            }
        }
        return duplicates;
    }
}
