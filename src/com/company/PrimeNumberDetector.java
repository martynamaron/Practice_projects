package com.company;

import org.jetbrains.annotations.Contract;

/**
 * Created by Martyna on 07/06/2017.
 */
public class PrimeNumberDetector {

    public boolean isPrimeNumber(int n) throws InvalidNumberException{
        if (n >= 1000) {
            throw new InvalidNumberException("Integer too large");
        }
        return detectPrimeNumber(n);
    }

    @Contract(pure = true)
    private boolean detectPrimeNumber(int n) {
        if (n%2==0){
            return false;
        }
        for(int i=3;i*i<n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
