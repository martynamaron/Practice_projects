package exercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Given a square matrix of size N xN , calculate the absolute difference between the sums of its diagonals.
 * https://www.hackerrank.com/challenges/diagonal-difference
 */

public class DiagonalDifference {

    private ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    private Scanner input;

    public void evaluateAbsoluteDifferenceOfDiagonals() {
        input = new Scanner(System.in);
        int rows = input.nextInt();
        populateMatrix(rows);
        printMatrix(matrix);

        int firstDiagonal = getSumOfDiagonal(0, matrix);
        int secondDiagonal = getSumOfDiagonal(matrix.size(), matrix);
        System.out.println("Sum of one diagonal: " + firstDiagonal);
        System.out.println("Sum of second diagonal: " + secondDiagonal);

        int absoluteDifference = Math.abs(firstDiagonal - secondDiagonal);
        System.out.println("The absolute difference between two diagonals is: " + absoluteDifference);
    }

    private void populateMatrix(int rows) {
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                int number = input.nextInt();
                if (-100 <= number && number <= 100) {
                    System.out.println("Adding " + number);
                    row.add(number);
                } else {
                    System.out.println("Invalid number - has to be -100 <= number <= 100");
                }
            }
            matrix.add(row);
        }
    }

    private void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> list : matrix) {
            for (int number : list) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private int getSumOfDiagonal(int start, ArrayList<ArrayList<Integer>> matrix) {
        ArrayList<Integer> diagonal = new ArrayList<>();
        if (start == matrix.size()) {
            for (ArrayList<Integer> row : matrix) {
                diagonal.add(row.get(start - 1));
                start--;
            }
        } else {
            for (ArrayList<Integer> row : matrix) {
                diagonal.add(row.get(start));
                start++;
            }
        }

        int sum = 0;
        for (int number : diagonal) {
            System.out.println(number + " ");
            sum += number;
        }
        return sum;
    }
}
