import utils.UserInput;

public class Main {

    public static void main(String[] args) {
        ExercisesMap exercisesMap = new ExercisesMap();
        exercisesMap.printAllExercises();
        exercisesMap.runChosenExercise(UserInput.readPickedInteger());
    }
}