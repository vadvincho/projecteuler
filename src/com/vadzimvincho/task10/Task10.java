package com.vadzimvincho.task10;

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.

import java.util.Arrays;

public class Task10 {
    private boolean[] primes;

    public long sumOfAllPrimes(int limit) {
        long sum = 0;
        fillSieve(limit);
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                sum += i;
            }
        }
        return sum;
    }

    private void fillSieve(int n) {
        primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
    }
}
