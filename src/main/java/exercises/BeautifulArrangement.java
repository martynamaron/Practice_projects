package exercises;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/beautiful-arrangement/#/description
public class BeautifulArrangement {

    private List<List<Integer>> newPermutations = new ArrayList<List<Integer>>();


    public int countArrangement(int number) {
        List<Integer> arrangement = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            arrangement.add(i + 1);
        }
        for (int i : arrangement) {
            System.out.println("Entry: " + i);
        }
        isTheArrangementBeautiful(arrangement);

        return 0;
    }

    private boolean isTheArrangementBeautiful(List<Integer> arrangement) {
        int position;
        int entry;
        listAllArrayPermutations(arrangement);
        for (int i = 0; i < arrangement.size(); i++) {
            position = i + 1;
            entry = arrangement.get(i);
            if (position % entry == 0 || entry % position == 0) {
                return true;
            }
        }
        return false;
    }

    private List<List<Integer>> listAllArrayPermutations(List<Integer> arrangement) {
        List<List<Integer>> allPermutations = new ArrayList<List<Integer>>();

        if (arrangement.size() == 2) {
            allPermutations.add(arrangement);
            List<Integer> newArray = new ArrayList<Integer>();
            newArray.add(arrangement.get(1));
            newArray.add(arrangement.get(0));
            allPermutations.add(newArray);
        } else {
            for (int element = 0; element < arrangement.size(); element++) {
                List<Integer> arrayCopy = new ArrayList<Integer>(arrangement);
                arrayCopy.remove(element);
                allPermutations = listAllArrayPermutations(arrayCopy);
                for (List<Integer> permutation : allPermutations) {
                    permutation.add(element + 1);
                    newPermutations.add(permutation);
                }
            }
        }
        System.out.println("all permuatations: " + newPermutations);
        return allPermutations;
    }
}