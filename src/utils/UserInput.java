package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Martyna on 08/06/2017.
 */
public class UserInput {

    public static int read(){
        int input = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Integer:");
        try {
            input = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException exception) {
            System.err.println("Invalid Format: " + exception.getMessage());
        }
        return input;
    }
}
