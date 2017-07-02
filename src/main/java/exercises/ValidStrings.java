package exercises;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string
 */
public class ValidStrings {

    private final String stringToCheck;

    public ValidStrings(String stringToCheck) {
        this.stringToCheck = stringToCheck;
    }

    public boolean isTheStringValid() {
        char[] charArray = stringToCheck.toCharArray();
        for (char a : charArray) {
            System.out.println(a);
        }
        System.out.println();
        areAllCharacterFrequenciesEqual(charArray);
        return false;
    }

    private boolean areAllCharacterFrequenciesEqual(char[] string) {
        Map<Character, Integer> frequencies = getCharFrequencyMap(string);

        return areAllCharacterFrequenciesEqual(frequencies);
    }

    private boolean areAllCharacterFrequenciesEqual(Map<Character, Integer> frequencies) {
        Collection<Integer> values = frequencies.values();
        Iterator<Integer> iterator = values.iterator();
        int firstValue = iterator.next();

        while (iterator.hasNext()) {
            if (!(iterator.next()).equals(firstValue)) {
                System.out.println("String is NOT valid");
                return false;
            }
        }
        System.out.println("String is valid");
        return true;
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

    private boolean canYouRemoveJustOneCharacter() {
        return false;
    }
}
