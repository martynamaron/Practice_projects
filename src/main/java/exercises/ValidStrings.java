package exercises;

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
        return false;
    }

    private boolean areAllChaactersTheSameFrequency() {
        return false;
    }

    private boolean canYouRemoveJustOneCharacter() {
        return false;
    }
}
