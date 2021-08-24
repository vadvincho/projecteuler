package com.vadzimvincho.task7;

// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

public class Task7 {

    //  the method finds the N-th prime number
    public int nthPrime(int nth) {
        int primeCount = 0;
        int i = 0;
        int prime = 0;
        while (primeCount < nth) {
            if (isPrime(i)) {
                primeCount++;
                prime = i;
            }
            i++;
        }
        return prime;
    }

    //    method determines whether number is prime
    private boolean isPrime(long number) {
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0 || number == 1) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
