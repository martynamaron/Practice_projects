package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

    public static final String PICK_EXERCISE = "Please enter the number of one of the exercises listed above," +
            " which you would like to see: ";

    public static int readPickedInteger() {
        return readInteger(PICK_EXERCISE);
    }

    private static int readInteger(String question) {
        int input = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(question);
        try {
            input = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException exception) {
            System.err.println("Invalid Format: " + exception.getMessage());
        }
        return input;
    }
}
