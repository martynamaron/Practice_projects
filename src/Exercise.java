public enum Exercise {

    FIZZBUZZ(1, "FizzBuzz exercise"),
    PRIME_NUMBER_DETECTOR(2, "Prime Number Detector program"),
    STAR_SQUARE_DRAWER(3, "Speed coding exercise - draw 2 squares out of stars");

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
}
