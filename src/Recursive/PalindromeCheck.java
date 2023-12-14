package Recursive;


public class PalindromeCheck {

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);

        if (firstChar != lastChar) {
            return false;
        }

        String remainingSubstring = s.substring(1, s.length() - 1);
        return isPalindrome(remainingSubstring);
    }

    public static void main(String[] args) {
        String word1 = "mom";
        String word2 = "cat";
        String word3 = "level";

        System.out.println(word1 + " is a palindrome: " + isPalindrome(word1));
        System.out.println(word2 + " is a palindrome: " + isPalindrome(word2));
        System.out.println(word3 + " is a palindrome: " + isPalindrome(word3));
    }
}

