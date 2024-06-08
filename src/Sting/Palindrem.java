package Sting;

public class Palindrem {
	public static void main(String[] args) {
		String s = "malayalam";
		int i = 0, j = s.length() - 1;
		boolean isPalindrome = true;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}

		if (isPalindrome) {
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}
	}
}
