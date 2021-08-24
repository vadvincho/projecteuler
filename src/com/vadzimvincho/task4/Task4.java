package com.vadzimvincho.task4;

//A palindromic number reads the same both ways.
// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

public class Task4 {
    public int largestPalindrome(int begin, int end) {
        int largestPalindrome = 0;
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                int temp = i * j;
                if (isPalindrome(temp) && temp > largestPalindrome) {
                    largestPalindrome = temp;
                }
            }
        }
        return largestPalindrome;
    }

    private boolean isPalindrome(int value) {
        int temp = value;
        int revers = 0;
        while (temp != 0) {
            revers = temp % 10 + (revers * 10);
            temp = temp / 10;
        }
        return value == revers;
    }
}
