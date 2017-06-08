package com.company;

import org.jetbrains.annotations.Contract;
import utils.Print;

/**
 * Created by Martyna on 27/05/2017.
 */
public class StarLineDrawer {

    private final int lineNumbers;

    public StarLineDrawer(int lineNumbers) {
        this.lineNumbers = lineNumbers;
    }

    public void generateSquare() {
        fillLineWithStars(lineNumbers);
        generateTheMiddle(lineNumbers - 2);
        fillLineWithStars(lineNumbers);
    }

    private void fillLineWithStars(int input) {
        for (int i = 1; i <= input; i++) {
            Print.star();
        }
        System.out.println();
    }

    private void generateTheMiddle(int middleLines) {
        for (int i = 1; i <= middleLines; i++) {
            if (isEmptyLine(middleLines, i)) {
                fillEdges();
            } else if (isEdgeOfInnerSquare(middleLines, i)) {
                fillStars();
            } else {
                fillWithStarsAndSpaces();
            }
        }
    }

    @Contract(pure = true)
    private static boolean isEdgeOfInnerSquare(int middleLines, int i) {
        return i == 2 || i == middleLines - 1;
    }

    @Contract(pure = true)
    private static boolean isEmptyLine(int middleLines, int i) {
        return i == 1 || i == middleLines;
    }

    private void fillEdges() {
        for (int i = 1; i <= lineNumbers; i++) {
            if (i == 1 || i == lineNumbers) {
                Print.star();
            } else {
                Print.space();
            }
        }
        System.out.println();
    }

    private void fillWithStarsAndSpaces() {
        for (int i = 1; i <= lineNumbers; i++) {
            if (i == 1 || i == 3 || i == lineNumbers - 2 || i == lineNumbers) {
                Print.star();
            } else {
                Print.space();
            }
        }
        System.out.println();
    }

    private void fillStars() {
        for (int i = 1; i <= lineNumbers; i++) {
            if (i == 2 || i == lineNumbers - 1) {
                Print.space();
            } else {
                Print.star();
            }
        }
        System.out.println();
    }
}
