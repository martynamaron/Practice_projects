import utils.UserInput;

public class Main {

    public static void main(String[] args) {

        final String INSTRUCTION = "Please enter the number of one of the exercises listed above," +
                " which you would like to see: ";
        ExercisesMap exercisesMap = new ExercisesMap();
        exercisesMap.printAllExercises();
        exercisesMap.runChosenExercise(UserInput.readInteger(INSTRUCTION));
    }
}