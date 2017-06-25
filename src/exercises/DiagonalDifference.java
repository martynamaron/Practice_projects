package exercises;

import java.util.ArrayList;
import java.util.Scanner;

//Given a square matrix of size N xN , calculate the absolute difference between the sums of its diagonals.
public class DiagonalDifference {

    private ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    private Scanner input;

    public void readNumber() {
        input = new Scanner(System.in);
        int rows = input.nextInt();
        System.out.println("Written integer: " + rows);
        populateMatrix(rows);

        printMatrix(matrix);
        System.out.println("Sum of one diagonal: " + getSumOfDiagonal(0, matrix));
        System.out.println("Sum of second diagonal: " + getSumOfDiagonal(matrix.size(), matrix));
    }

    private void populateMatrix(int rows) {
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                int number = input.nextInt();
                System.out.println("Adding " + number);
                row.add(number);
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
        if (start == matrix.size()){
            for (ArrayList<Integer> row : matrix) {
                diagonal.add(row.get(start-1));
                start--;
            }
        } else {
            for (ArrayList<Integer> row : matrix){
                diagonal.add(row.get(start));
                start++;
            }
        }
        int sum = 0;
        for (int number : diagonal) {
            System.out.print(number + " ");
            sum += number;
        }
        return sum;
    }

}
