package exercises;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string
 */
public class ValidStrings {

    private final String stringToCheck;

    public ValidStrings(String stringToCheck){
        this.stringToCheck = stringToCheck;
    }

    public boolean isTheStringValid() {
        char[] charArray = stringToCheck.toCharArray();
        for (char a: charArray) {
            System.out.println(a);
        }
        System.out.println();
        areAllCharactersTheSameFrequency(charArray);
        return false;
    }

    private boolean areAllCharactersTheSameFrequency(char[] string) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char character: string){
            if (!frequencies.containsKey(character)){
                frequencies.put(character, 1);
            } else {
                int frequency = frequencies.get(character);
                frequencies.put(character, ++frequency);
            }
        }
        Collection<Integer> values = frequencies.values();
        int firstValue = values.iterator().next();

        Iterator it = frequencies.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            if (!(pair.getValue()).equals(firstValue)){
                System.out.println("String is NOT valid");
                return false;
            }
        }
        System.out.println("String is valid");
        return false;
    }

    private boolean canYouRemoveJustOneCharacter() {
        return false;
    }
}
