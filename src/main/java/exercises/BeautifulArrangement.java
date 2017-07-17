package exercises;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/beautiful-arrangement/#/description
public class BeautifulArrangement {

    private List<Integer> initialArray = new ArrayList<>();;
    private List<List<Integer>> newPermutations = new ArrayList<>();

    public BeautifulArrangement(int number) {
        for (int i = 0; i < number; i++) {
            initialArray.add(i + 1);
            System.out.println("Entries: " + initialArray.get(i));
        }
    }

    public int countBeautifulArrangements() {
        int arrangementCount = 0;
        listAllArrayPermutations(initialArray);
        for (List<Integer> permutation: newPermutations){
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

        if (arrangement.size() == 2) {
            allPermutations.add(arrangement);
            List<Integer> newArray = new ArrayList<>();
            newArray.add(arrangement.get(1));
            newArray.add(arrangement.get(0));
            allPermutations.add(newArray);
        } else {
            for (int element = 0; element < arrangement.size(); element++) {
                List<Integer> arrayCopy = new ArrayList<>(arrangement);
                arrayCopy.remove(element);
                allPermutations = listAllArrayPermutations(arrayCopy);
                for (List<Integer> permutation : allPermutations) {
                    permutation.add(element + 1);
                    newPermutations.add(permutation);
                }
            }
        }
        System.out.println("all permutations: " + newPermutations);

        return allPermutations;
    }
}