import utils.UserInput;

public class Main {

    public static void main(String[] args) {
        ExercisesList.printAllExercises();
        ExercisesList.runChosenExercise(UserInput.readPickedInteger());
    }
}