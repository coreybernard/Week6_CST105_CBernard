/**
 * Program: Palindromic Primes
 * 
 * File: PalindromicPrimes.java
 * 
 * Summary: Shows the numbers that are both palindromes and primes for the first
 * 100,000 positive integers
 * 
 * Author: Corey Bernard
 * 
 * Date: July 8, 2017
 * 
 **/

public class PalindromicPrimes {

	public static void main(String[] args) {
		String palindromicPrimes = "";
		int newLineCount = 0;

		for (int i = 1; i <= 10000; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				palindromicPrimes += Integer.toString(i) + "\t";
				newLineCount++;
			}
			if (newLineCount == 4) {
				palindromicPrimes += "\n";
				newLineCount = 0;
			}
		}

		System.out.println(palindromicPrimes);
	}

	// Returns true if the number is Prime
	public static boolean isPrime(int input) {
		int count = 0;

		for (int j = input; j > 0; j--) {
			if (input % j == 0) {
				count++;
			}
		}

		if (count == 2) {
			return true;
		}

		return false;
	}

	// Returns true if the number is a palindrome
	public static boolean isPalindrome(int input) {
		String number = Integer.toString(input);
		int length = number.length();
		int first = 0;
		int last = length - 1;
		int middle = (first + last) / 2;
		int i;

		for (i = first; i <= middle; i++) {
			if (number.charAt(first) == number.charAt(last)) {
				first++;
				last--;
			} else {
				break;
			}
		}
		
		if (i == middle + 1) {
			return true;
		} else {
			return false;
		}
		
	}

	
}




















