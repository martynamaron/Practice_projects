public class ExercisesList {

    public static void printAllExercises(){
        for (Exercise e : Exercise.values()){
            System.out.println(e.getExerciseNumber() + ". "+e.getExerciseDescription());
        }
    }

    public static void runChosenExercise(int exerciseNumber){
        Exercise chosenExercise = Exercise.getExercise(exerciseNumber);
        System.out.println("You chose: "+chosenExercise.getExerciseDescription());
    }

}
