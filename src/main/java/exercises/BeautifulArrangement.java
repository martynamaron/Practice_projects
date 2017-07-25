package exercises;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/beautiful-arrangement/#/description
public class BeautifulArrangement {

    private List<Integer> initialArray = new ArrayList<>();

    public BeautifulArrangement(int number) {
        for (int i = 0; i < number; i++) {
            initialArray.add(i + 1);
            System.out.println("Entries: " + initialArray.get(i));
        }
    }

    public int countBeautifulArrangements() {
        int arrangementCount = 0;
        List<List<Integer>> allPermutations = listAllArrayPermutations(initialArray);
        System.out.println("All permutations: " + allPermutations);
        for (List<Integer> permutation: allPermutations){
            if (isTheArrangementBeautiful(permutation)) {
                arrangementCount++;
            }
        }
        return arrangementCount;
    }

    private boolean isTheArrangementBeautiful(List<Integer> arrangement) {
        int position;
        int entry;

        for (int i = 0; i < arrangement.size(); i++) {
            position = i + 1;
            entry = arrangement.get(i);
            if (position % entry == 0 || entry % position == 0) {
            } else {
                return false;
            }
        }
        return true;
    }

    private List<List<Integer>> listAllArrayPermutations(List<Integer> arrangement) {
        List<List<Integer>> allPermutations = new ArrayList<>();

        if (arrangement.size() == 0) {
            allPermutations.add(arrangement);
        } else {
            for (int index = 0; index < arrangement.size(); index++) {
                List<Integer> arrayCopy = new ArrayList<>(arrangement);
                Integer element = arrayCopy.get(index);
                arrayCopy.remove(element);
                List<List<Integer>> temporaryPermutations = listAllArrayPermutations(arrayCopy);
                for (List<Integer> permutation : temporaryPermutations) {
                    permutation.add(element);
                    allPermutations.add(permutation);
                }
            }
        }
        return allPermutations;
    }
}