package exercises;

public class ReversedString {
    public String reverseString(String input) {
        char[] toBeReversed = input.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = toBeReversed.length-1; i >= 0 ; i--) {
            reversed.append(toBeReversed[i]);
        }
        return reversed.toString();
    }
}
