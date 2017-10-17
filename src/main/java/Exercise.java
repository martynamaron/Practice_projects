import exercises.*;
import utils.UserInput;

public enum Exercise {

    FIZZBUZZ(1, "FizzBuzz exercise") {
        @Override
        public void runExercise() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            fizzBuzz.printFizzBuzz();
        }
    },
    PRIME_NUMBER_DETECTOR(2, "Prime Number Detector program") {
        @Override
        public void runExercise() {
            PrimeNumberDetector primeNumberDetector = new PrimeNumberDetector();
            int pickedNumber = UserInput.readInteger(INSTRUCTION_FOR_INT);
            try {
                System.out.println(primeNumberDetector.detectPrimeNumber(pickedNumber));
            } catch (InvalidNumberException exception) {
                System.out.println(exception.getMessage());
            }
        }
    },
    //http://www.softwire.com/blog/2016/04/06/speed-coding-2016-q1/
    STAR_SQUARE_DRAWER(3, "Speed coding exercise - draw 2 squares out of stars") {
        @Override
        public void runExercise() {
            int pickedNumber = UserInput.readInteger(INSTRUCTION_FOR_INT);
            StarLineDrawer starLineDrawer = new StarLineDrawer(pickedNumber);
            starLineDrawer.generateSquare();
        }
    },
    //https://www.youtube.com/watch?v=c18GjbnZXMw
    LOCKERS(4, "TED Riddle about Lockers") {
        @Override
        public void runExercise() {
            Lockers lockers = new Lockers();
            lockers.whichLockersAreOpen();
        }
    },
    //https://projecteuler.net/problem=21
    AMICABLE_NUMBERS(5, "Amicable Numbers from Project Euler") {
        @Override
        public void runExercise() {
            AmicableNumbers amicableNumbers = new AmicableNumbers();
            amicableNumbers.findTheSumOfAllAmicableNumbers();
        }
    },

    //
    DIAGONAL_DIFFERENCE(6, "Diagonal difference of a square matrix") {
        @Override
        public void runExercise() {
            DiagonalDifference diagonalDifference = new DiagonalDifference();
            diagonalDifference.evaluateAbsoluteDifferenceOfDiagonals();
        }
    },

    VALID_STRINGS(7, "Find a valid string") {
        @Override
        public void runExercise() {
            String wordToCheck = UserInput.readString(INSTRUCTION_FOR_STRING);
            ValidStrings validStrings = new ValidStrings(wordToCheck);
            if (validStrings.isTheStringValid()) {
                System.out.println("String is valid!");
            } else {
                System.out.println("String NOT valid!");
            }
        }
    },

    ROMAN_NUMERALS(8, "Convert to roman numerals") {
        @Override
        public void runExercise() {
            int num = UserInput.readInteger(INSTRUCTION_ROMAN_NUMERALS);
            RomanNumerals romanNumerals = new RomanNumerals();
            System.out.println("Conversion: " + romanNumerals.convertToRomanNumerals(num));
        }
    },

    BEAUTIFUL_ARRANGEMENT(9, "Beautiful arrangement") {
        @Override
        public void runExercise() {
            int number = UserInput.readInteger(INSTRUCTION_BEAUTIFUL_ARRANGEMENT);
            BeautifulArrangement arrangement = new BeautifulArrangement(number);
            System.out.println("This many beautiful arrangements found: "
                    + arrangement.countBeautifulArrangements());
        }
    },

    FIBONACCI(10, "Fibonacci numbers - recursion") {
        @Override
        public void runExercise() {
            Fibonacci fibonacci = new Fibonacci();
            int number = UserInput.readInteger("How many positions do you want to print?");
            fibonacci.printFibonacciSequence(number);
        }
    },

    ARRAY_DUPLICATES(11, "Find duplicates in an array") {
        @Override
        public void runExercise() {
            ArrayDuplicates arrayDuplicates = new ArrayDuplicates();
            int[] numbers = {1,2,3,1,3,4};
            System.out.println("Duplicates in the array are: " + arrayDuplicates.findDuplicates(numbers));
        }
    },

    BINARY_COMPLEMENT(12, "Find the binary complement of the number") {
        @Override
        public void runExercise() {
            BinaryComplement binaryComplement = new BinaryComplement();
            int number = UserInput.readInteger("Chose a positive integer: " );
            System.out.println("Binary complement number is: " + binaryComplement.getBinaryComplement(number));
        }
    },

    REVERSED_STRING(13, "Reverse the input string") {
        @Override
        public void runExercise() {
            ReversedString reversedString = new ReversedString();
            String input = UserInput.readString("Type in a string you want reversed: ");
            System.out.println("Reversed: " + reversedString.reverseString(input));
        }
    },

    SINGLE_ELEMENT_FINDER(14, "Find a single element in an array of duplicates") {
        @Override
        public void runExercise() {
            SingleElementFinder singleElementFinder = new SingleElementFinder();
            int[] inputArray = {1,1,2,2,7,7,8,8,9,9,11};
            System.out.println(singleElementFinder.getSingleElement(inputArray));
        }
    },

    ARRAY_MEDIAN(15, "Find the median of two arrays (for now their combined length has to be odd)") {
        @Override
        public void runExercise() {
            ArrayMedian arrayMedian = new ArrayMedian();
            int[] array1 = {1, 2, 5, 6, 8, 12};
            int[] array2 = {23};
            System.out.println(arrayMedian.findMedianOfTwoArrays(array1, array2));
        }
    };

    private final int exerciseNumber;
    private final String exerciseDescription;
    private static final String INSTRUCTION_FOR_INT = "Provide a number no greater than 1000 you'd like to check: ";
    private static final String INSTRUCTION_FOR_STRING = "Provide a string you'd like to check: ";
    private static final String INSTRUCTION_ROMAN_NUMERALS = "Provide a number no greater than 3999 you'd like to check: ";
    private static final String INSTRUCTION_BEAUTIFUL_ARRANGEMENT = "Provide a number no greater than 15 you'd like to check: ";

    Exercise(int number, String description) {
        exerciseNumber = number;
        exerciseDescription = description;
    }

    public int getExerciseNumber() {
        return exerciseNumber;
    }

    public String getExerciseDescription() {
        return exerciseDescription;
    }

    public abstract void runExercise();
}
