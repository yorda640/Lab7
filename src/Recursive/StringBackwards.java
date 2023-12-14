package Recursive;

public class StringBackwards {

    public static void printBackwards(String s) {
        if (s.length() != 0) {
            System.out.print(s.charAt(s.length() - 1));
            printBackwards(s.substring(0, s.length() - 1));
        }
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        System.out.print("Input String: ");
        System.out.println(inputString);

        System.out.print("Backwards: ");
        printBackwards(inputString);
    }
}

