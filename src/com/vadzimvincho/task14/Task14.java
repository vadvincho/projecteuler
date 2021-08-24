package com.vadzimvicnho.task14;

//Which starting number, under one million, produces the longest chain?

public class Task14 {
    private long[] results = new long[BILLION];
    private static final int BILLION = 1000000;

    private long getCollatz(long n) {
        if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return checkingResults(n / 2) + 1;
        } else {
            return checkingResults(3 * n + 1) + 1;
        }
    }

    private long checkingResults(long next) {
        if (next >= BILLION) {
            return getCollatz(next);
        }
        if (results[(int) next] == 0) {
            results[(int) next] = getCollatz(next);
        }
        return results[(int) next];
    }

    public long getCountCollatz(int n) {
        long count = 0;
        long value = 0;
        for (int i = 1; i <= n; i++) {
            long c = getCollatz(i);
            if (c > count) {
                value = i;
                count = c;
            }
        }
        return value;
    }
}
