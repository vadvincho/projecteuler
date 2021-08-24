package com.vadzimvincho.task4;

//A palindromic number reads the same both ways.
// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

public class Task4 {
    //    method find the largest palindrome made from the product of two numbers
    //    in the range from beginNumber to endNumber
    public int getLargestPalindrome(int beginNumber, int endNumber) {
        int largestPalindrome = 0;
        for (int i = beginNumber; i <= endNumber; i++) {
            for (int j = beginNumber; j <= endNumber; j++) {
                int temp = i * j;
                if (isPalindrome(temp) && temp > largestPalindrome) {
                    largestPalindrome = temp;
                }
            }
        }
        return largestPalindrome;
    }

    //    method determines whether number is palindrome
    private boolean isPalindrome(int number) {
        int temp = number;
        int revers = 0;
        while (temp != 0) {
            revers = temp % 10 + (revers * 10);
            temp = temp / 10;
        }
        return number == revers;
    }
}
