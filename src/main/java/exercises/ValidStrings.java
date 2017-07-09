package exercises;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string
 */
public class ValidStrings {

    private final char[] stringAsCharArray;

    public ValidStrings(String stringToCheck) {
        stringAsCharArray = stringToCheck.toCharArray();
        for (char a : stringAsCharArray) {
            System.out.println(a);
        }
    }

    public boolean isTheStringValid() {
        Map<Character, Integer> frequencies = getCharFrequencyMap(stringAsCharArray);
        if (areAllCharacterFrequenciesEqual(frequencies)) {
            System.out.println("All frequencies are equal");
            return true;
        } else if (canYouRemoveJustOneCharacter(frequencies)) {
            System.out.println("You can remove one character");
            return true;
        }
        return false;
    }

    private boolean areAllCharacterFrequenciesEqual(Map<Character, Integer> frequencies) {
        Iterator<Integer> iterator = getIterator(frequencies);
        int firstValue = iterator.next();

        while (iterator.hasNext()) {
            if (!(iterator.next() == firstValue)) {
                System.out.println("Different frequencies");
                return false;
            }
        }
        return true;
    }

    //find the highest value, and then check if the rest of the set is equal
    //then take one of those values and check if it's exactly one digit smaller
    private boolean canYouRemoveJustOneCharacter(Map<Character, Integer> frequencies) {
        Iterator<Integer> iterator = getIterator(frequencies);
        int highestFrequency = 0;

        while (iterator.hasNext()) {
            int nextValue = iterator.next();
            if (highestFrequency < nextValue) {
                highestFrequency = nextValue;
            }
        }
        System.out.println("The highest frequency is: " + highestFrequency);

        frequencies.values().remove(highestFrequency);
        Map<Character, Integer> frequenciesWithoutHighestValue = frequencies;

        if (areAllCharacterFrequenciesEqual(frequenciesWithoutHighestValue)) {
            Iterator<Integer> iteratorOfEqualValues = getIterator(frequenciesWithoutHighestValue);
            int firstValue = iteratorOfEqualValues.next();
            if (highestFrequency - 1 == firstValue) {
                return true;
            }
        }
        return false;
    }

    private Map<Character, Integer> getCharFrequencyMap(char[] string) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char character : string) {
            if (!frequencies.containsKey(character)) {
                frequencies.put(character, 1);
            } else {
                int frequency = frequencies.get(character);
                frequencies.put(character, ++frequency);
            }
        }
        return frequencies;
    }

    private Iterator<Integer> getIterator(Map<Character, Integer> frequencies) {
        Collection<Integer> values = frequencies.values();
        return values.iterator();
    }
}
