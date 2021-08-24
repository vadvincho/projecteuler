package com.vadzimvicnho.task17;

//If the numbers 1 to 5 are written out in words: one, two, three, four, five,
//then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

public class Task17 {
    //    constants
    private static String[] ONES_NUMBERS = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] ONE_TEN_NUMBERS = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] TENS_NUMBERS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static String HUNDRED = "hundred";
    private static String THOUSAND = "thousand";

    //  method returns the sum of letters from 1 to the limit
    public int getNumberLetterSum(int limit) {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += numberToString(i).length();
        }
        return sum;
    }

    //  method converts the digital value of number to string
    private String numberToString(int number) {
        String string = null;
        if (0 <= number && number < 10) {
            string = ONES_NUMBERS[number];
        } else if (10 <= number && number < 20) {
            string = ONE_TEN_NUMBERS[number % 10];
        } else if (20 <= number && number < 100) {
            string = TENS_NUMBERS[number / 10];
            if (number % 10 != 0) {
                string += ONES_NUMBERS[number % 10];
            }
        } else if (100 <= number && number < 1000) {
            string = ONES_NUMBERS[number / 100] + HUNDRED;
            if (number % 100 != 0) {
                string += "and" + numberToString(number % 100);
            }
        } else if (1000 <= number && number < 1000000) {
            string = numberToString(number / 1000) + THOUSAND;
            if (number % 1000 != 0) {
                string += numberToString(number % 1000);
            }
        }
        return string;
    }
}
