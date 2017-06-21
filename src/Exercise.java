import exercises.*;

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
            try {
                primeNumberDetector.isPrimeNumber(90);
            } catch (InvalidNumberException exception) {
                System.out.println(exception.getMessage());
            }
        }
    },
    STAR_SQUARE_DRAWER(3, "Speed coding exercise - draw 2 squares out of stars") {
        @Override
        public void runExercise() {
            StarLineDrawer starLineDrawer = new StarLineDrawer(9);
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
    };

    private final int exerciseNumber;
    private final String exerciseDescription;

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
