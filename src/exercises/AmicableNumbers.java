package exercises;

public class AmicableNumbers {

    public void findAllDivisors(int n) {
        System.out.println("Divisors of " + n);
        int numberOfDivisors = 0;
        int sumOfAllDivisors= 0;
        for (int i=1; i<n; i++){
            if (n % i == 0){
                System.out.print(i + ", ");
                numberOfDivisors++;
                sumOfAllDivisors += i;
            }
        }
        System.out.println();
        System.out.println(n + " has "+numberOfDivisors+" divisors");
        System.out.println("Sum of all divisors: "+sumOfAllDivisors);
    }
}
