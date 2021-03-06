import java.util.HashMap;

public class ExercisesMap extends HashMap<Integer, Exercise> {

    public ExercisesMap() {
        super();
        for (Exercise exercise : Exercise.values()) {
            put(exercise.getExerciseNumber(), exercise);
        }
    }

    public void printAllExercises() {
        for (Exercise e : this.values()) {
            System.out.println(e.getExerciseNumber() + ". " + e.getExerciseDescription());
        }
    }

    public void runChosenExercise(int exerciseNumber) {
        Exercise chosenExercise = getExercise(exerciseNumber);
        if (chosenExercise != null){
            System.out.println("You chose: " + chosenExercise.getExerciseDescription());
            chosenExercise.runExercise();
        }
    }

    private Exercise getExercise(int exerciseNumber) {
        return get(exerciseNumber);
    }
}
