package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

    public static int readInteger(String instruction) {
        int input = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(instruction);
        try {
            input = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException exception) {
            System.err.println("Invalid Format: " + exception.getMessage());
        }
        return input;
    }

    public static String readString(String instruction) {
        String word = "example";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(instruction);
        try {
            word = br.readLine();
        } catch (IOException exception) {
            System.err.println("Invalid string: " + exception.getMessage());
        }
        return word;
    }
}
