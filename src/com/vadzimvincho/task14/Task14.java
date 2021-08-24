package com.vadzimvicnho.task14;

//Which starting number, under one million, produces the longest chain?

public class Task14 {
    private long[] results = new long[BILLION];
    private static final int BILLION = 1000000;

    //    method generates Collatz sequence that starts with beginNumber and count iterations
    private long getCollatzChain(long beginNumber) {
        if (beginNumber == 1) {
            return 1;
        } else if (beginNumber % 2 == 0) {
            return checkingResults(beginNumber / 2) + 1;
        } else {
            return checkingResults(3 * beginNumber + 1) + 1;
        }
    }

    //  checking previously stored values
    private long checkingResults(long next) {
        if (next >= BILLION) {
            return getCollatzChain(next);
        }
        if (results[(int) next] == 0) {
            results[(int) next] = getCollatzChain(next);
        }
        return results[(int) next];
    }

    //    the method returns the value for which the Collatz sequence is maximum in the range from 0 to limit
    public long getCountCollatzChain(int limit) {
        long countMax = 0;
        long value = 0;
        for (int i = 1; i <= limit; i++) {
            long countI = getCollatzChain(i);
            if (countI > countMax) {
                value = i;
                countMax = countI;
            }
        }
        return value;
    }
}
