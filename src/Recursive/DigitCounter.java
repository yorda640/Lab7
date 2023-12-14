package Recursive;

public class DigitCounter {

    public static void main(String[] args) {
        System.out.println(numberOfDigits(12344));
        System.out.println(sumOfDigits(12345));
    }

    public static int numberOfDigits(int num) {
        if (num < 10)
            return 1;
        else
            return (1 + numberOfDigits(num / 10));
    }

    public static int sumOfDigits(int num) {
        if (num == 0)
            return 0;
        else
            return (num % 10 + sumOfDigits(num / 10));
    }
}

