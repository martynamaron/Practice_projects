import exercises.FizzBuzz;
import exercises.InvalidNumberException;
import exercises.PrimeNumberDetector;
import exercises.StarLineDrawer;
import utils.UserInput;

public class Main {

    public static void main(String[] args) {
         int inputInteger = UserInput.read();
        StarLineDrawer starLineDrawer = new StarLineDrawer(inputInteger);
        starLineDrawer.generateSquare();

        PrimeNumberDetector primeNumberDetector = new PrimeNumberDetector();
        try {
            System.out.println("Input number is a prime: "+primeNumberDetector.isPrimeNumber(inputInteger));
        } catch (InvalidNumberException e) {
            e.printStackTrace();
        }

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzz();
    }
}