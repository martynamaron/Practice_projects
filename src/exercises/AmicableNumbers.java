package exercises;

import java.util.LinkedHashSet;
import java.util.Set;

public class AmicableNumbers {

    public int findTheSumOfAllAmicableNumbers() {
        int sumOfAllAmicableNumbers = 0;
        Set<Integer> uniqueAmicableNumbers = new LinkedHashSet<>();
        for (int i = 0; i<10000; i++){
            int sum1 = findSumOfAllDivisors(i);
            int sum2 = findSumOfAllDivisors(sum1);
            if (i == sum2){
                if (i == sum1){
                    System.out.println("Number "+i+" divisors sum up to itself!");
                } else {
                    uniqueAmicableNumbers.add(i);
                    uniqueAmicableNumbers.add(sum1);
                    System.out.println("Amicable numbers are: " + i + " and " + sum1);
                }
            }
        }
        System.out.println("=====");
        for (Integer i: uniqueAmicableNumbers){
            sumOfAllAmicableNumbers += i;
            System.out.println(i);
        }
        System.out.println("Sum of all amicable numbers is: " + sumOfAllAmicableNumbers);
        return sumOfAllAmicableNumbers;
    }

    private int findSumOfAllDivisors(int n) {
        int sumOfAllDivisors= 0;
        for (int i=1; i<n; i++){
            if (n % i == 0){
                sumOfAllDivisors += i;
            }
        }
        return sumOfAllDivisors;
    }
}
