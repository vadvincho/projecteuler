package com.vadzimvincho.task7;

// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public int stPrime(int value) {
        int primeCount = 0;
        int numCount = 0;
        int prime = 0;
        List<Integer> list = new ArrayList<>();
        while (primeCount < value) {
            if (isPrime(numCount)) {
                primeCount++;
                prime = numCount;
                list.add(prime);
            }
            numCount++;
        }
        return prime;
    }

    private boolean isPrime(long value) {
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0 || value == 1) {
            return false;
        }
        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
