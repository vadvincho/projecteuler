package com.vadzimvicnho.task17;

//If the numbers 1 to 5 are written out in words: one, two, three, four, five,
//then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

public class Task17 {
    private static String[] ONES_NUMBERS = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] ONE_TEN_NUMBERS = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] TENS_NUMBERS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static String HUNDRED = "hundred";
    private static String THOUSAND = "thousand";

    public int getNumberLetterSum(int n) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += numberToString(i).length();
        }
        return sum;
    }

    private String numberToString(int n) {
        String string = null;
        if (0 <= n && n < 10) {
            string = ONES_NUMBERS[n];
        } else if (10 <= n && n < 20) {
            string = ONE_TEN_NUMBERS[n % 10];
        } else if (20 <= n && n < 100) {
            string = TENS_NUMBERS[n / 10];
            if (n % 10 != 0) {
                string += ONES_NUMBERS[n % 10];
            }
        } else if (100 <= n && n < 1000) {
            string = ONES_NUMBERS[n / 100] + HUNDRED;
            if (n % 100 != 0) {
                string += "and" + numberToString(n % 100);
            }
        } else if (1000 <= n && n < 1000000) {
            string = numberToString(n / 1000) + THOUSAND;
            if (n % 1000 != 0) {
                string += numberToString(n % 1000);
            }
        }
        return string;
    }
}
