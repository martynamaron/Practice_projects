import java.util.HashMap;
import java.util.Map;

public enum Exercise {

    FIZZBUZZ(1, "FizzBuzz exercise"),
    PRIME_NUMBER_DETECTOR(2, "Prime Number Detector program"),
    STAR_SQUARE_DRAWER(3, "Speed coding exercise - draw 2 squares out of stars");

    private final int exerciseNumber;
    private final String exerciseDescription;

    Exercise(int number, String description){
        exerciseNumber = number;
        exerciseDescription = description;
    }

    private static Map<Integer, Exercise> exerciseMap = new HashMap<>();

    static {
        for (Exercise exercise : Exercise.values()){
            exerciseMap.put(exercise.getExerciseNumber(), exercise);
        }
    }

    public int getExerciseNumber(){
        return exerciseNumber;
    }

    public String getExerciseDescription(){
        return exerciseDescription;
    }

    public static Exercise getExercise(int exerciseNumber){
        return exerciseMap.get(exerciseNumber);
    }
}
