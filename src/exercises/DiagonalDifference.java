package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalDifference {

    private ArrayList<ArrayList<Integer>> matrix = new  ArrayList<>();
    private Scanner input;

    public void readNumber() {
        input = new Scanner(System.in);
        int rows = input.nextInt();
        System.out.println("Written integer: " + rows);
        populateMatrix(rows);

        printMatrix(matrix);
    }

    private void populateMatrix(int rows) {
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < rows; j++){
                int number = input.nextInt();
                System.out.println("Adding " + number);
                row.add(number);
            }
            matrix.add(row);
        }
    }

    private void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> list: matrix) {
            for (int number: list) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

}
