package exercises;

public class PrimeNumberDetector {

    public String detectPrimeNumber(int n) throws InvalidNumberException {
        if (n >= 1000) {
            throw new InvalidNumberException("Integer too large");
        }

        return isPrimeNumber(n)? "Number " + n + " is prime" : "Number " + n + " is not prime";
    }

    private boolean isPrimeNumber(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i < n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
